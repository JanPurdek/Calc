/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;


/*import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*/

/**
 *
 * @author janop
 */
public class MultiplicationTest {
    
    public MultiplicationTest() {
    } 

    
    @Test
    public void testVelkeCisla() {
        System.out.println("velkeCisla");
        String cislo3 = "1234567890123456789099999999999999999";
        String cislo4 = "111111111111111111119999999999999999999";
        Multiplication instance = new Multiplication();
        String result = instance.velkeCisla(cislo3, cislo4);
        String result2 = instance.vynasobDveCisla(cislo3, cislo4);
        assertEquals( result,result2);
      
    }

  
}
