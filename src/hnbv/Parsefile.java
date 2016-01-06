/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hnbv;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Character.isDigit;

/**
 * lớớp này được sinh ra là để chuẩn hóa cho những file dữ liệu đầu vào
 * @author PhamNgocHieu
 */
public class Parsefile {
    /**
     * biến này là biến để kiểm tra xem nội dung của file cũ có bị thay đổi hay không sau khi được chuẩn hóa bởi lớp
     * mặc định là false, nếu có sự thay đổi thì chuyển thành true
     */
    public static boolean invalidChange; 
    /**
   * đưa nội dung của một file text vào chuỗi String
   * sau đó loại bỏ những khoảng trắng, những xuống dòng ở cuối và đầu String
   * @param url : location của file
   * @return The file contents as a <code>String</code>
   * @exception IOException IO Error
   */
  public static String deserializeString(String url)
  throws IOException {
      File file = new File(url);
      int len;
      char[] chr = new char[4096];
      final StringBuffer buffer = new StringBuffer();
      final FileReader reader = new FileReader(file);
      try {
          while ((len = reader.read(chr)) > 0) {
              buffer.append(chr, 0, len);
          }
      } finally {
          reader.close();
      }
      return buffer.toString().trim();
  }
  /**
   * đây là hàm chuẩn hóa một String,một xâu khi ném vào thì nó sẽ chuẩn hóa thành số
   * bằng cách loại bỏ hết những ký tự không phải là số ra khỏi chuỗi
   * @param x : chuỗi đầu vào
   */
  public static String parseString(String x)
          {
              String tg ="";
              for(int i=0;i<x.length();i++)
                  if(isDigit(x.charAt(i)))
                     tg=tg+x.charAt(i);
              return tg;
          }
  /**
   * phương thức này là chuẩn hóa một chuỗi bao gồm những từ được cách với nhau bởi dấu cách
   * nó loại bỏ hết khoảng trắng đầu và cuối đồng thời chuẩn hóa từng từ về thành số
   * @param y 
   */
  public static String parseStringOfString(String y)
          {
              String tg="";
              String regex = "\\s+";
              y = y.trim();
              String[] parts = y.split(regex);
              for (int i = 0; i < parts.length; i++) {
                  tg = tg + " ";
                  tg = tg + parseString(parts[i]);
                  tg.trim();    
              }
              return tg;
          }
  /**
   * lớp này để chuẩn hóa nội dung của file đầu vào
   * chuẩn hóa xong là nó ghi đè lại file cũ
   * @param url: loation của file đầu vào
   * @throws IOException 
   */
    public static void parseContextOfFile(String url) throws IOException {
        String tg="";
        // lấy nội dung file sau khi đã bỏ khoảng trắng , xuống dòng ở đầu và cuối đoạn văn
        String context = deserializeString(url);
        // lấy nội dung đoạn văn theo từng dòng
        String[] lines = context.split(System.getProperty("line.separator"));
        // chuẩn hóa lần lượt các dòng
        for (int i = 0; i < lines.length; i++) {
            if (i != (lines.length - 1)) {
                lines[i] = parseStringOfString(lines[i]) + "\n";
                tg = tg + lines[i];
            } else {
                lines[i] = parseStringOfString(lines[i]);
                tg = tg + lines[i];
            }
        }
        // kiểm tra xem so với nội dung gốc thì nội dung sau khi được chuẩn hóa có bị thay đổi gì không
        if(tg.equals(context))
           invalidChange = true;
        else
           invalidChange = false; 
        // bước tiếp theo là ghi lại vào file (chuẩn hóa file)
        FileOutputStream write = new FileOutputStream(url,false);
        PrintWriter pw = new PrintWriter(write);
        pw.print(tg);
        pw.flush();
        pw.close();       
    }
}
