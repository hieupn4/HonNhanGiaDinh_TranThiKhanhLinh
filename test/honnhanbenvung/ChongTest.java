/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package honnhanbenvung;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PhamNgocHieu
 */
public class ChongTest {
    
    public ChongTest() {
    }

    //@Test
    public void testThem_conang_da_cauhon_vao_danhsach() {
        System.out.println("them_conang_da_cauhon_vao_danhsach");
        Vo x = null;
        Chong instance = null;
        instance.them_conang_da_cauhon_vao_danhsach(x);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCau_hon() {
        System.out.println("them_chong_vao_danhsach");
        ArrayList<Chong> x = new ArrayList();
        ArrayList<Vo> y = new ArrayList();
        // arraylist này lưu những cặp vợ chồng
        ArrayList<bo_vo_chong> z = new ArrayList();
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
        x.add(m4);x.add(m3);x.add(m2);x.add(m1);
        y.add(w2);y.add(w1); 
       // System.out.println(x.size());
       /* for(int k=0;k<x.size();k++)
          x.get(k).cau_hon(); */
        x.get(0).cau_hon();
        x.get(1).cau_hon();
        x.get(2).cau_hon();
        x.get(3).cau_hon();
       // x.get(3).cau_hon();
        System.out.println(w1.danhsachchonghientai.get(0).name);
        System.out.println(w1.danhsachchonghientai.get(1).name);
        System.out.println(w2.danhsachchonghientai.get(0).name);
        System.out.println(w2.danhsachchonghientai.get(1).name);
       /* m3.cau_hon(w1);
        System.out.println(w1.danhsachchonghientai.size());
        m1.cau_hon(w1);
        System.out.println(w1.danhsachchonghientai.get(1).name);
        m2.cau_hon(w1);
        System.out.println(w1.danhsachchonghientai.get(0).name);
        System.out.println(w1.danhsachchonghientai.get(1).name);
        /*w1.them_chong_vao_danhsach(m1);
        w1.them_chong_vao_danhsach(m3);
        w1.them_chong_vao_danhsach(m2);
        System.out.println(m3.danhsach_vo_hientai.size());
        System.out.println(m1.danhsach_vo_hientai.size());
        System.out.println(m2.danhsach_vo_hientai.size());
        int t = w1.danhsachchonghientai.size();
        System.out.println(w1.danhsachchonghientai.get(1).name);*/
        
    }
    
}
