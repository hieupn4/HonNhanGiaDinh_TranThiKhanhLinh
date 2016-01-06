/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnbv;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author DH Vinh
 */
public class HNBV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
     /*   ArrayList<Men> x = new ArrayList();
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
        y.add(w1);y.add(w2); */
        
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
        String url ="C:\\Users\\PhamNgocHieu\\Documents\\NetBeansProjects\\thutest\\src\\hnbv\\input732.txt";
        Readfile.readfile(url);
        Marriage h = new Marriage(Readfile.x);
        ArrayList<Couple> kh = new ArrayList();
        kh = h.doMarried();
        System.out.println("Kết Quả Ghép Các Cặp Đôi Như Sau");
        Writefile.writeContextln(url,"");
        Writefile.writeContextln(url,"----------------------------------------------------------------");
        for(int i=0;i<kh.size();i++)
            {
            kh.get(i).display();
            System.out.println("");
            Writefile.writeContext(url,kh.get(i).getWoman().getName()+" kết hôn với : ");
            for(int j=0;j<kh.get(i).getMen().size();j++)
                {
                    Writefile.writeContext(url,kh.get(i).getMen().get(j).getName());
                    if(j!=(kh.get(i).getMen().size()-1))
                        Writefile.writeContext(url,","); 
                    else
                        Writefile.writeContext(url,".");  
                }
            Writefile.writeContextln(url,"");
                
            }
        // kiem tra xem có nhung người đàn ông độc thân nào thì hiện thị ra
        if(Marriage.menListSigle.size()>0)
            {
               System.out.println("Những thằng đàn ông còn độc thân");
               // ghi vào file
               Writefile.writeContextln(url,"Những thằng đàn ông còn độc thân");
               for(int i=0;i<Marriage.menListSigle.size();i++)
                   {
                    System.out.println(Marriage.menListSigle.get(i).getName());
                    // ghi vào file
                    Writefile.writeContext(url,Marriage.menListSigle.get(i).getName());
                   }
            }
        else
            System.out.println("Khong co nguoi dan ong doc than");
    }
    
}
