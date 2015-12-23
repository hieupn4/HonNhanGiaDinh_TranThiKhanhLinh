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
public class bo_vo_chong {
    public Vo vo;
    public ArrayList<Chong> chongs;

    public bo_vo_chong() {
        vo = null;
        chongs = null;
    }

    public bo_vo_chong(Vo vo, ArrayList<Chong> chongs) {
        this.vo = vo;
        this.chongs = chongs;
    }
    
    @Override
    public String toString() {
        String ds_chong= "";
        for(int i=0;i<chongs.size();i++)
            ds_chong = ds_chong + chongs.get(i).name+",";
        ds_chong = ds_chong + vo.name;
        return "{" + ds_chong + '}';
    }
    public void display()
            {
                System.out.println(this.toString());
            }
    
}
