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
public class HNBV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Men> x = new ArrayList();
        ArrayList<Women> y = new ArrayList();
        // arraylist này lưu những cặp vợ chồng
        ArrayList<Couple> kh = new ArrayList();
        
        Men m1 = new Men("m1");
        Men m2 = new Men("m2");
        Men m3 = new Men("m3");
        Men m4 = new Men("m4");
        Men m5 = new Men("m5");
        
        Women w1 = new Women("w1");
        Women w2 = new Women("w2");
        
        Women.setQ(2);
        
        Women[][] k = {{w2,w1},{w1,w2},{w1,w2},{w1,w2},{w2,w1}};
        Men[][] l = {{m1,m5,m4,m2,m3},{m3,m4,m5,m2,m1}};
        m1.addList(k[0]);
        m2.addList(k[1]);
        m3.addList(k[2]);
        m4.addList(k[3]);
        m5.addList(k[4]);
        
        w1.addList(l[0]);
        w2.addList(l[1]);
        
        x.add(m1);x.add(m2);x.add(m3);x.add(m4);x.add(m5);
        y.add(w1);y.add(w2);
        
        /*
         bộ 7-3-2       
        Men m1 = new Men("m1");
        Men m2 = new Men("m2");
        Men m3 = new Men("m3");
        Men m4 = new Men("m4");
        Men m5 = new Men("m5");
        Men m6 = new Men("m6");
        Men m7 = new Men("m7");
        
        Women w1 = new Women("w1");
        Women w2 = new Women("w2");
        Women w3 = new Women("w3");
        
        Women.setQ(2);
        
        Women[][] k = {{w1,w2,w3},{w2,w1,w3},{w1,w3,w2},{w3,w2,w1},{w2,w3,w1},{w3,w1,w2},{w1,w3,w2}};
        Men[][] l = {{m1,m2,m3,m4,m5,m6,m7},{m2,m4,m6,m1,m3,m7,m5},{m5,m3,m7,m2,m1,m4,m6}};
        m1.addList(k[0]);
        m2.addList(k[1]);
        m3.addList(k[2]);
        m4.addList(k[3]);
        m5.addList(k[4]);
        m6.addList(k[5]);
        m7.addList(k[6]);
        
        w1.addList(l[0]);
        w2.addList(l[1]);
        w3.addList(l[2]);
        
        x.add(m1);x.add(m2);x.add(m3);x.add(m4);x.add(m5);x.add(m6);x.add(m7);
        y.add(w1);y.add(w2);y.add(w3); */
      /*
        bộ 4-2-2
        Men m1 = new Men("m1");
        Men m2 = new Men("m2");
        Men m3 = new Men("m3");
        Men m4 = new Men("m4");
        
        Women w1 = new Women("w1");
        Women w2 = new Women("w2");
       
        Women.setQ(2);
        
        Women[][] k = {{w2,w1},{w1,w2},{w1,w2},{w1,w2}};
        Men[][] l = {{m1,m3,m4,m2},{m3,m4,m1,m2}};
        m1.addList(k[0]);
        m2.addList(k[1]);
        m3.addList(k[2]);
        m4.addList(k[3]);
        
        w1.addList(l[0]);
        w2.addList(l[1]);
        
        x.add(m1);x.add(m2);x.add(m3);x.add(m4);
        y.add(w1);y.add(w2); */
        /*
        bộ 3-4-1
        Men m1 = new Men("m1");
        Men m2 = new Men("m2");
        Men m3 = new Men("m3");
        
        Women w1 = new Women("w1");
        Women w2 = new Women("w2");
        Women w3 = new Women("w3");
        Women w4 = new Women("w4");
        Women.setQ(1);
        
        Women[][] k = {{w2,w1,w3,w4},{w3,w2,w4,w1},{w3,w4,w1,w2}};
        Men[][] l = {{m1,m3,m2},{m3,m1,m2},{m1,m3,m2},{m1,m3,m2}};
        m1.addList(k[0]);
        m2.addList(k[1]);
        m3.addList(k[2]);
        
        w1.addList(l[0]);
        w2.addList(l[1]);
        w3.addList(l[2]);
        w4.addList(l[3]);
        
        x.add(m1);x.add(m2);x.add(m3);
        y.add(w1);y.add(w2);y.add(w3);y.add(w4);
        */
        /* bộ 5-3-1
        Men m1 = new Men("m1");
        Men m2 = new Men("m2");
        Men m3 = new Men("m3");
        Men m4 = new Men("m4");
        Men m5 = new Men("m5");
        Women w1 = new Women("w1");
        Women w2 = new Women("w2");
        Women w3 = new Women("w3");
        Women.setQ(1);
        
        Women[][] k = {{w2,w1,w3},{w3,w2,w1},{w3,w1,w2},{w1,w3,w2},{w2,w3,w1}};
        Men[][] l = {{m1,m3,m4,m2,m5},{m5,m4,m3,m1,m2},{m4,m1,m3,m5,m2}};
        m1.addList(k[0]);
        m2.addList(k[1]);
        m3.addList(k[2]);
        m4.addList(k[3]);
        m5.addList(k[4]);
        
        w1.addList(l[0]);
        w2.addList(l[1]);
        w3.addList(l[2]);
        
        x.add(m1);x.add(m2);x.add(m3);x.add(m4);x.add(m5);
        y.add(w1);y.add(w2);y.add(w3); */
        
        Marriage h = new Marriage(x);
        kh = h.doMarried();
        System.out.println("Kết Quả Ghép Các Cặp Đôi Như Sau");
        for(int i=0;i<kh.size();i++)
            {
            kh.get(i).display();
            System.out.println("");
            } 
        // kiem tra xem trong menList cua lop Marriage co nhung thang doc than nao thi hien thi ra
        if(Marriage.menList.size() >0)
            {
               System.out.println("Nhung thang dan ong con doc than");
               for(int i=0;i<Marriage.menList.size();i++)
                    System.out.println(Marriage.menList.get(i).getName());
            }
    }
    
}
