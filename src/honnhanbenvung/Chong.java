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
public class Chong {

    public Chong(String name) {
        this.name = name;
    }
    // tên ông này là gì 
    public String name;
    // ông này kết hôn hay chưa
    public boolean dakethon;
    // danh sách những cô từ chối kết hôn
    public ArrayList<Vo> nhungcotuchoi = new ArrayList();
    // hiện tại thằng này có những người vợ nào thì bỏ vào đây, thường thì chỉ 1 vợ thôi
    public ArrayList<Vo> danhsach_vo_hientai = new ArrayList();
    // danh sách những co vợ mà ông này thích nhất, xếp theo thứ tự giảm dần
    public ArrayList<Vo> danhsachmucdoyeu = new ArrayList();
    // danh sách những cô đã từ chối câu hôn
    public void them_conang_da_cauhon_vao_danhsach(Vo x)
            {
                nhungcotuchoi.add(x);
            }
    // hàm này là hàm cầu hôn
    public boolean cau_hon(Vo x)
            {
                // co này sẽ thêm chồng vào danh sách
                return x.them_chong_vao_danhsach(this);
            }
    // hàm này là để nó cầu hôn theo lần lượt thứ tự ưu tiên
    public boolean cau_hon()
            {
                for(int i=0;i<this.danhsachmucdoyeu.size();i++)
                    {
                    if(cau_hon(this.danhsachmucdoyeu.get(i)))
                        {
                          this.danhsachmucdoyeu.remove(i);
                          return true;
                        }
                    else
                        {
                          this.danhsachmucdoyeu.remove(i); 
                          i=i-1;
                        }
                    }
                return false;
            }
}
