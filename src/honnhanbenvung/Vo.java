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
public class Vo {
    // tên của cô này là gì 
    public String name;
    // đã kết hôn hay chưa
    public boolean dakethon;
    // số lượng chồng có thể có , cái này chính là q, phải để là static
    public static int soluongchong;
    // danh sách những ông chồng mà cô này thích , xếp theo thứ tự ít dần
    public ArrayList<Chong> danhsachmucdoyeu = new ArrayList();
    // hiện tại cô này có những người chồng nào thì bỏ vào đây
    public ArrayList<Chong> danhsachchonghientai = new ArrayList();
    // danh sách những anh chàng đã cầu hôn cô này
    public ArrayList<Chong> nhunganhchangdacauhon = new ArrayList();

    public Vo(String name) {
        this.name = name;
    }
    
    //hàm loại bỏ chồng không thích hơn ra khỏi danh sách
    public void loai_bo_rakhoi_danhsach(Chong x)
            {
               for(int i=0;i<danhsachchonghientai.size();i++)
                   if(danhsachchonghientai.get(i)==x)
                       {
                          danhsachchonghientai.remove(i);
                          // cập nhật lại thông tin cho thằng chồng vừa mới bị ly hôn
                          x.dakethon = false;
                          x.danhsach_vo_hientai.clear();
                          tuyen_chong.danhsach.add(x);
                          
                       }
            }
    //hàm thêm chồng vào danh sách, đây là hàm xay ra khi có yêu cầu kết hôn từ chồng
    public boolean them_chong_vao_danhsach(Chong x)
            {
                if (danhsachchonghientai.size() < soluongchong) {
                    danhsachchonghientai.add(x);
                    this.them_anhchang_da_cauhon_vao_danhsach(x);
                    // nhớ cập nhật những thông tin của thằng chồng.
                    x.dakethon = true;
                    x.them_conang_da_cauhon_vao_danhsach(this);
                    x.danhsach_vo_hientai.add(this);
                    return true;
                } else {
                       //đây là trường hợp mà cô này đã có đầy đủ chồng, khi có lời 
                    // yêu cầu kết hôn thì cô ấy sẽ kiểm tra xem anh chàng ngỏ lời cầu hôn có 
                    // tốt hơn những anh đang có trong danh sách hay không, nếu có thì vứt anh tệ nhất ra 
                    // và thế anh này vào
                    return kiemtra_co_thang_chong_nao_kem_hon_khong_thi_dua_vao(x);
                    
                }

                             
            }
    public void them_anhchang_da_cauhon_vao_danhsach(Chong x)
            {
                nhunganhchangdacauhon.add(x);
            }
    // hàm này là hàm kiểm tra xem trong list của vợ có thằng chồng nào kém hơn y không thì thế y vào
    public boolean kiemtra_co_thang_chong_nao_kem_hon_khong_thi_dua_vao(Chong y)
            {
                int benhat =0;
                int vi_tri_thang_y =0;
                // tìm vị trí của thằng chồng kém hơn, ngu vãi .... :)
                for(int i=0;i<danhsachchonghientai.size();i++)
                    {                       
                    for(int j =0;j<danhsachmucdoyeu.size();j++)
                       {
                           if(danhsachchonghientai.get(i)==danhsachmucdoyeu.get(j))
                               if(j>benhat) benhat = j;
                       } 
                    }
                // xác định xem thằng chồng y này trong danh sách thì nó nằm ở vị trí nào
                for(int j =0;j<danhsachmucdoyeu.size();j++)
                       {
                           if(y==danhsachmucdoyeu.get(j))
                               {
                               if(j<benhat)
                                   {
                                       //loại thằng bé nhất ra khỏi danh sách chồng hiện tại
                                          loai_bo_rakhoi_danhsach(danhsachmucdoyeu.get(benhat));
                                          them_anhchang_da_cauhon_vao_danhsach(y);
                                       // bỏ thằng y vào danh sách chồng hiện tại
                                          danhsachchonghientai.add(y);
                                          y.dakethon = true;
                                          y.danhsach_vo_hientai.add(this);
                                          y.them_conang_da_cauhon_vao_danhsach(this);
                                          return true;
                                   }
                               else
                                   return false;
                               }
                       } 
                return true;    
            }
    
}

