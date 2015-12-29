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
public class Women {
   // tên của cô này là gì 
    private String name;
    // số lượng chồng có thể có , cái này chính là q, phải để là static
    private static int q;
    // danh sách những ông chồng mà cô này thích , xếp theo thứ tự ít dần
    private ArrayList<Men> preferList = new ArrayList();
    // hiện tại cô này có những người chồng nào thì bỏ vào đây
    private ArrayList<Men> fianceList  = new ArrayList();

    public Women(String name) {
        this.name = name;
        
    }
    //phuong thuc up danh sach vao preferList
    public void addList(Men[] man)
    {
       for(int i=0;i<man.length;i++)
            preferList.add(man[i]); 
    }
    // hàm set
    public void setName(String name) {
        this.name = name;
    }

    public static void setQ(int q) {
        Women.q = q;
    }

    public void setPreferList(ArrayList<Men> preferList) {
        this.preferList = preferList;
    }

    public void setFianceList(ArrayList<Men> fianceList) {
        this.fianceList = fianceList;
    }
    //hàm get

    public String getName() {
        return name;
    }

    public static int getQ() {
        return q;
    }

    public ArrayList<Men> getPreferList() {
        return preferList;
    }

    public ArrayList<Men> getFianceList() {
        return fianceList;
    }   
    //hàm loại bỏ chồng không thích hơn ra khỏi danh sách
    public void refuseMen(Men x)
            {
               for(int i=0;i<fianceList.size();i++)
                   if(fianceList.get(i)==x)
                       {
                          fianceList.remove(i);
                          // cập nhật lại thông tin cho ng dan ong vua bi loai
                          x.getFianceList().clear();
                          Marriage.menList.add(x);
                          System.out.print("loại :"+x.getName()+"\n");
                          
                       }
            }
    //hàm thêm chồng vào danh sách, đây là hàm xay ra khi có yêu cầu kết hôn từ chồng
    public boolean addMenInList(Men x)
            {
                if (fianceList.size() < q) {
                    fianceList.add(x);
                    System.out.println(name + " đính hôn với thằng " + x.getName());
                    // nhớ cập nhật những thông tin của thằng chồng.
                    x.getFianceList().add(this);
                    return true;
                } else {
                       //đây là trường hợp mà cô này đã có đầy đủ chồng, khi có lời 
                    // yêu cầu kết hôn thì cô ấy sẽ kiểm tra xem anh chàng ngỏ lời cầu hôn có 
                    // tốt hơn những anh đang có trong danh sách hay không, nếu có thì vứt anh tệ nhất ra 
                    // và thế anh này vào
                    return addMenPreferInList(x);
                    
                }

                             
            }
    // hàm này là hàm kiểm tra xem trong list của vợ có thằng chồng nào kém hơn y không thì thế y vào
    public boolean addMenPreferInList(Men y)
            {
                int min =0;
                int index_y =0;
                // tìm vị trí của thằng chồng kém hơn, ngu vãi .... :)
                for(int i=0;i<fianceList.size();i++)
                    {                       
                    for(int j =0;j<preferList.size();j++)
                       {
                           if(fianceList.get(i)==preferList.get(j))
                               if(j>min) min = j;
                       } 
                    }
                // xác định xem thằng chồng y này trong danh sách thì nó nằm ở vị trí nào
                for(int j =0;j<preferList.size();j++)
                       {
                           if(y==preferList.get(j))
                               {
                               if(j<min)
                                   {
                                       //loại thằng bé nhất ra khỏi danh sách chồng hiện tại
                                          refuseMen(preferList.get(min));
                                       // bỏ thằng y vào danh sách chồng hiện tại
                                          fianceList.add(y);
                                          System.out.println(name + " loại thằng hôn phu tệ nhất là "+preferList.get(min).getName()+" để thay vào bởi thằng " + y.getName());

                                          y.getFianceList().add(this);
                                          return true;
                                   }
                               else
                                   return false;
                               }
                       } 
                return true;    
            }
    public void display()
            {
                System.out.print("("+")");
            }
}
