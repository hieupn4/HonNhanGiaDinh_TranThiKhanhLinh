/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hnbv;

import java.util.ArrayList;

/**
 *
 * @author DH Vinh
 */
public class Couple {
    private Women woman;
    private ArrayList<Men> men; ;
    public Couple() {
        woman = null;
        men = null;
    }   
    public Couple(Women woman, ArrayList<Men> men) {
        this.woman = woman;
        this.men = men;
    }  
    public Women getWoman() {
        return woman;
    }
    public ArrayList<Men> getMen() {
        return men;
    }
    @Override
    public String toString() {
        String mList= "";
        for(int i=0;i<men.size();i++)
            mList = mList + men.get(i).getName()+",";
        mList = mList + woman.getName();
        return "{" + mList + '}';
    }
    public void display()
            {
                System.out.println(this.toString());
            } 
}
