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
public class HonNhanBenVung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       System.out.println("them_chong_vao_danhsach");
        ArrayList<Chong> x = new ArrayList();
        ArrayList<Vo> y = new ArrayList();
        // arraylist này lưu những cặp vợ chồng
        ArrayList<bo_vo_chong> kh = new ArrayList();
        Chong m1 = new Chong("m1");
        Chong m2 = new Chong("m2");
        Chong m3 = new Chong("m3");
        Vo w1 = new Vo("w1");
        Vo w2 = new Vo("w2");
        Vo.soluongchong = 2;
        m1.danhsachmucdoyeu.add(w1);
        m1.danhsachmucdoyeu.add(w2);
        m2.danhsachmucdoyeu.add(w1);
        m2.danhsachmucdoyeu.add(w2);
        m3.danhsachmucdoyeu.add(w2);
        m3.danhsachmucdoyeu.add(w1);
        
        w1.danhsachmucdoyeu.add(m1);
        w1.danhsachmucdoyeu.add(m2);
        w1.danhsachmucdoyeu.add(m3);
        w2.danhsachmucdoyeu.add(m3);
        w2.danhsachmucdoyeu.add(m2);
        w2.danhsachmucdoyeu.add(m1);
        x.add(m1);x.add(m2);x.add(m3);
        y.add(w2);y.add(w1); 
        /*
       /* Chong m1 = new Chong("m1");
        Chong m2 = new Chong("m2");
        Vo w1 = new Vo("w1");
        Vo w2 = new Vo("w2");
        Vo.soluongchong = 1;
        m1.danhsachmucdoyeu.add(w2);
        m1.danhsachmucdoyeu.add(w1);
        m2.danhsachmucdoyeu.add(w1);
        m2.danhsachmucdoyeu.add(w2);
        
        w1.danhsachmucdoyeu.add(m1);
        w1.danhsachmucdoyeu.add(m2);
        w2.danhsachmucdoyeu.add(m2);
        w2.danhsachmucdoyeu.add(m1);
        x.add(m1);x.add(m2);
        y.add(w2);y.add(w1); */
        /*
        bộ dữ liệu 1
        Vo w1 = new Vo("w1");
        Vo w2 = new Vo("w2");
        Vo.soluongchong = 2; // một vợ có 2 chồng
        Chong m1 = new Chong("m1");
        Chong m2 = new Chong("m2");
        Chong m3 = new Chong("m3");
        Chong m4 = new Chong("m4");
        m1.danhsachmucdoyeu.add(w1);
        m1.danhsachmucdoyeu.add(w2);
        m2.danhsachmucdoyeu.add(w2);
        m2.danhsachmucdoyeu.add(w1);
        m3.danhsachmucdoyeu.add(w1);
        m3.danhsachmucdoyeu.add(w2);
        m4.danhsachmucdoyeu.add(w1);
        m4.danhsachmucdoyeu.add(w2);
        
        w1.danhsachmucdoyeu.add(m1);
        w1.danhsachmucdoyeu.add(m2);
        w1.danhsachmucdoyeu.add(m3);
        w1.danhsachmucdoyeu.add(m4);
        
        w2.danhsachmucdoyeu.add(m3);
        w2.danhsachmucdoyeu.add(m2);
        w2.danhsachmucdoyeu.add(m1);
        w2.danhsachmucdoyeu.add(m4);
       // x.add(m1);x.add(m2);x.add(m3);x.add(m4);
        x.add(m1);x.add(m2);x.add(m3);x.add(m4);
        y.add(w2);y.add(w1);  */
       
        tuyen_chong h = new tuyen_chong(x);
        kh = h.thucthi_tuyen_chong();     
        for(int i=0;i<kh.size();i++)
            {
            kh.get(i).display();
            System.out.println("");
            } 
        
        /*for(int j=0;j<h.danhsach.size();j++)
            System.out.println(h.danhsach.get(j).name); */
     //   System.out.println(h.kiem_tra());
     /*  System.out.println(w1.danhsachchonghientai.get(0).name);
        System.out.println(w1.danhsachchonghientai.get(1).name);
        System.out.println(w2.danhsachchonghientai.get(0).name);
        System.out.println(w2.danhsachchonghientai.get(1).name); */
    
}
    }
