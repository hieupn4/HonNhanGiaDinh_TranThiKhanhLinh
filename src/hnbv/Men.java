/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnbv;

import java.util.ArrayList;

/**
 *
 * @author dh Vinh
 */
public class Men {
    // tên ông này là gì 
    private String name;
    /* hiện tại thằng này có những người vợ nào thì bỏ vào đây, thường thì chỉ 1 vợ thôi*/
    private ArrayList<Women> fianceList  = new ArrayList();
    /* danh sách những co vợ mà ông này thích nhất, xếp theo thứ tự giảm dần*/
    private ArrayList<Women> preferList= new ArrayList();
    // hàm setter
    
    public void setName(String name) {
        this.name = name;
    }

    public void setFianceList(ArrayList<Women> fianceList) {
        this.fianceList = fianceList;
    }

    public void setPreferList(ArrayList<Women> preferList) {
        this.preferList = preferList;
    }
    // hàm getter
    public String getName() {
        return name;
    }

    public ArrayList<Women> getFianceList() {
        return fianceList;
    }

    public ArrayList<Women> getPreferList() {
        return preferList;
    }
    // hàm khởi tạo
    public Men(String name) {
        this.name = name;           
    } 
    //phuong thuc up danh sach vao preferList
    public void addList(Women[] woman)
    {
       for(int i=0;i<woman.length;i++)
            preferList.add(woman[i]); 
    }
    /* hàm này là hàm cầu hôn */
    public boolean propose(Women x)
            {
                // co này sẽ thêm chồng vào danh sách
                System.out.println();
                return x.addMenInList(this);
            }
    // hàm này là để nó cầu hôn theo lần lượt thứ tự ưu tiên
    public boolean propose()
            {
                for(int i=0;i<this.preferList.size();i++)
                    {
                    if(propose(this.preferList.get(i)))
                        {
                          this.preferList.remove(i);
                          return true;
                        }
                    else
                        {
                          this.preferList.remove(i); 
                          i=i-1;
                        }
                    }
                return false;
            }
    
}
