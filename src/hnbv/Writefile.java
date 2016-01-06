/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnbv;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * đây là lớp dùng để ghi nội dung lên file
 * @author dh Vinh
 */
public class Writefile {
    /**
     * 
     * @param url : location của file cần tạo ra
     * @param context : nội dung cần ghi vào file
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException 
     * nếu file chưa có thì nó sẽ tạo ra rồi ghi vào, còn nếu có rồi thì ghi tiếp vào nội dung file hiện có
     */
    public static void writeContext(String url, String context) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream write = new FileOutputStream(url, true);
        PrintWriter pw = new PrintWriter(write);
        pw.write(context);
        pw.flush();
        pw.close();
        
      /*  PrintWriter writer = new PrintWriter(url, "UTF-8");
        writer.print(context);
        writer.print(context);
        writer.close();*/
    }
}
