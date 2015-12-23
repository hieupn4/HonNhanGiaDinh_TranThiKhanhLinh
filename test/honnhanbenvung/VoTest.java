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
public class VoTest {
    
    public VoTest() {
    }

   // @Test
    public void testLoai_bo_rakhoi_danhsach() {
        System.out.println("loai_bo_rakhoi_danhsach");
        Chong x = null;
        Vo instance = null;
        instance.loai_bo_rakhoi_danhsach(x);
        fail("The test case is a prototype.");
    }

    @Test
    public void testThem_chong_vao_danhsach() {
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
        w1.them_chong_vao_danhsach(m1);
        w1.them_chong_vao_danhsach(m3);
        w1.them_chong_vao_danhsach(m2);
        System.out.println(m3.danhsach_vo_hientai.size());
        System.out.println(m1.danhsach_vo_hientai.size());
        System.out.println(m2.danhsach_vo_hientai.size());
        int t = w1.danhsachchonghientai.size();
        System.out.println(w1.danhsachchonghientai.get(1).name);   
    }

 //   @Test
    public void testThem_anhchang_da_cauhon_vao_danhsach() {
        System.out.println("them_anhchang_da_cauhon_vao_danhsach");
        Chong x = null;
        Vo instance = null;
        instance.them_anhchang_da_cauhon_vao_danhsach(x);
        fail("The test case is a prototype.");
    }

 //   @Test
    public void testKiemtra_co_thang_chong_nao_kem_hon_khong_thi_dua_vao() {
        System.out.println("kiemtra_co_thang_chong_nao_kem_hon_khong_thi_dua_vao");
        Chong y = null;
        Vo instance = null;
        instance.kiemtra_co_thang_chong_nao_kem_hon_khong_thi_dua_vao(y);
        fail("The test case is a prototype.");
    }
    
}
