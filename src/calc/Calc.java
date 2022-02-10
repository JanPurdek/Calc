/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author janop
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        Multiplication nasobenie = new Multiplication();
      while (start){
          System.out.println("Vyberte ktorou metodou chcete pocitat : ");
          System.out.println("1. - pomocou BigInteger");
          System.out.println("2. - bez pomoci BigInteger");
          System.out.println("0. - koniec programu");
          int vyber = sc.nextInt();
          switch(vyber){
              case 1:
                  System.out.println("Zadajte prve cislo :");
                  String cislo1 = sc.next();
                  System.out.println("Zadajte druhe cislo :");
                  String cislo2 = sc.next();
                  System.out.println(nasobenie.velkeCisla(cislo1, cislo2));
                  break;
              case 2:
                  System.out.println("Zadajte prve cislo :");
                  String cislo3 = sc.next();
                  System.out.println("Zadajte druhe cislo :");
                  String cislo4 = sc.next();
                  System.out.println(nasobenie.vynasobDveCisla(cislo3, cislo4));
                  break;
              case 0:
                  start = false;
                  break;
              default :
                  System.out.println("Zadali ste nespravnu hodnotu !");
                  
          }
      }
    }
    
}
