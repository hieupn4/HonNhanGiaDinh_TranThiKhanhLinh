/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnbv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author PhamNgocHieu
 */
public class Readfile {
    public static int mCount;
    public static int wCount;
    public static int q;
    public static ArrayList<Men> x = new ArrayList();
    public static ArrayList<Women> y = new ArrayList();
    public static void readfile(String input) {
        int dem =0;
        try {
            FileInputStream fis = new FileInputStream(new File(input));
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                String[] splitString = line.split(" ");
                for(int i=0;i<splitString.length;i++)
                    System.out.println(splitString[i]);
                dem ++;
                if(dem==1)
                    {
                        mCount = Integer.parseInt(splitString[0]);
                        wCount = Integer.parseInt(splitString[1]);
                    }
                if(dem==2)
                    {
                        q = Integer.parseInt(splitString[0]);
                        Women.setQ(q);
                        // tạo danh sách những người đàn ông tham gia tuyển vợ
                        for(int i=0;i<mCount;i++)
                              x.add(new Men("m"+Integer.toString(i+1))) ;  
                        // tạo danh sách những người đàn bà tham gia tuyển chồng
                        for(int j=0;j<wCount;j++)
                              y.add(new Women("w"+Integer.toString(j+1))) ; 
                    }
                // xong phần lấy số người đàn ông , đàn bà và q ra.
                // bây giờ đến công việc nhập thứ tự yêu thích cho các ông chồng và bà vợ
                if(dem>2)
                    {
                       if(dem<=2+mCount)
                           {
                             //đây là trường hợp dữ liệu của nhóm men 
                             for(int i=0;i<splitString.length;i++)
                                 x.get(dem-3).getPreferList().add(y.get(Integer.parseInt(splitString[i])-1));
                           }
                       else
                           {
                              // đây là trường hợp dữ liệu của nhóm wommen 
                              for(int i=0;i<splitString.length;i++)
                                 y.get(dem-3-mCount).getPreferList().add(x.get(Integer.parseInt(splitString[i])-1));
                           }
                    }
               // System.out.println("line data: " + line);
              /*  if (line != null && !line.isEmpty()) {
                    System.out.println("line data: " + line);
                } */
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
}
