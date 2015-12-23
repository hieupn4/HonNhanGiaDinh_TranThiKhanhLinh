/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnbv;

import java.util.ArrayList;

/**
 *
 * @author DH Vinh
 */
public class Marriage {
  // danh sách các ông chồng chuẩn bị đi tuyển vợ
    public static ArrayList<Men> menList = new ArrayList();
    public ArrayList<Women> womenList = new ArrayList();
    public Marriage() {
        menList = null;
        womenList = null;
    }
    // hàm khởi tạo đầu vào là danh sách các ông chồng đã có đầy đủ các thông tin
    public Marriage(ArrayList x) {
        menList = x;
        womenList = (ArrayList)menList.get(0).getPreferList().clone();
        
    }
    // kiểm tra điều kiện dừng của quá trình tuyển chồng, chú ý rằng quá trình tuyển chồng là một vòng lặp
    public boolean kiem_tra()
            {
                // dừng được rồi, khi trong danh sách chẳng còn ai
                if(menList.size()==0) return true;
                else
                    {
                        int dem = 0;
                        for(int i=0;i<menList.size();i++)
                           if(menList.get(i).getPreferList().size() !=0)
                               dem = dem+1;
                           else
                               {
                                  menList.remove(i);
                                  i = i-1;
                               }
                        if(menList.size()==0) return true;
                        if(dem==0)
                            return true;
                    }
                return false; // chưa dừng được việc tuyển chồng
            }
    //tuyển chồng
    public ArrayList<Couple> doMarried()
            {
                // luu tru cac cap vo chong đã nên duyên
                ArrayList<Couple> cm = new ArrayList();
                // kiểm tra xem có nên tiếp tục việc tuyển vợ hay không
                while(!kiem_tra())
                    {
                       for(int i=0;i<menList.size();i++)
                           {
                            // nếu được cô gái đồng ý thì phải loại bỏ khỏi danh sách
                             if(menList.get(i).propose()) 
                                menList.remove(i);
                           }
                    }              
              // lưu lại trong Couple
                for(int i=0;i<womenList.size();i++)
                    {                       
                        Couple l = new Couple(womenList.get(i),womenList.get(i).getFianceList());
                        cm.add(l);
                    }              
                return cm;
            }  
}
