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
public class bo_vo_chongTest {
    
    public bo_vo_chongTest() {
    }

    @Test
    public void testToString() {
        ArrayList<String> x = new ArrayList();
        String t1 = "iloveyou";
        String t2 = "hello";
        String t3 = "koko";
        String t4 = " lalala";
        x.add(t1);
        x.add(t2);
        x.add(t3);
        x.add(t4);        
        for(int i=0;i<x.size();i++)
            {
                
                if(i==0)
                    {
                        x.remove(i);
                       // i=i-1;
                    }
                System.out.println(x.get(i));
            }
        
        
    }

  //  @Test
    public void testDisplay() {
        System.out.println("display");
        bo_vo_chong instance = new bo_vo_chong();
        instance.display();
        fail("The test case is a prototype.");
    }
    
}
