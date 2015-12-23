/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package honnhanbenvung;

import java.util.ArrayList;

/**
 * 
 * @author PhamNgocHieu
 */
public class tuyen_chong {
    // danh sách các ông chồng chuẩn bị đi tuyển vợ
    public static ArrayList<Chong> danhsach = new ArrayList();
    public ArrayList<Vo> trung_gian = new ArrayList();
    public tuyen_chong() {
        danhsach = null;
    }
    // hàm khởi tạo đầu vào là danh sách các ông chồng đã có đầy đủ các thông tin
    public tuyen_chong(ArrayList x) {
        danhsach = x;
      /*  for(int j=0;j<danhsach.size();j++)
            System.out.println(danhsach.get(j).name); */
        trung_gian = (ArrayList)danhsach.get(0).danhsachmucdoyeu.clone(); 
        
    }
    // kiểm tra điều kiện dừng của quá trình tuyển chồng, chú ý rằng quá trình tuyển chồng là một vòng lặp vô hạn
    public boolean kiem_tra()
            {
                // dừng được rồi, khi trong danh sách chẳng còn ai
                if(danhsach.size()==0) return true;
                else
                    {
                        int dem = 0;
                        for(int i=0;i<danhsach.size();i++)
                           if(danhsach.get(i).danhsachmucdoyeu.size() !=0)
                               dem = dem+1;
                           else
                               {
                                  danhsach.remove(i);
                                  i = i-1;
                               }
                        if(danhsach.size()==0) return true;
                        if(dem==0)
                            return true;
                    }
                return false; // chưa dừng được việc tuyển chồng
            }
    //tuyển chồng
    public ArrayList<bo_vo_chong> thucthi_tuyen_chong()
            {
                // luu tru cac cap vo chong đã nên duyên
                ArrayList<bo_vo_chong> cac_cap_vo_chong = new ArrayList();
                // kiểm tra xem có nên tiếp tục việc tuyển vợ hay không
                /*for(int j=0;j<danhsach.size();j++)
                System.out.println(danhsach.get(j).name); danh sách này đúng */
                while(!kiem_tra())
                    {
                       for(int i=0;i<danhsach.size();i++)
                           {
                            // System.out.println(danhsach.get(i).name);
                            // nếu được cô gái đồng ý thì phải loại bỏ khỏi danh sách
                             if(danhsach.get(i).cau_hon()) 
                                danhsach.remove(i);
                           }
                    }
              //  System.out.println(danhsach.size());               
              // lưu lại trong bo_vo_chong
                for(int i=0;i<trung_gian.size();i++)
                    {                       
                        bo_vo_chong l = new bo_vo_chong(trung_gian.get(i),trung_gian.get(i).danhsachchonghientai);
                        cac_cap_vo_chong.add(l);
                    }              
                return cac_cap_vo_chong;
            }
    
}
