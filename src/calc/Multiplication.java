/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author janop
 */
public class Multiplication {

    public String velkeCisla(String cislo3, String cislo4){
        BigInteger cislo1 = new BigInteger(cislo3);
        BigInteger cislo2 = new BigInteger(cislo4);
        BigInteger vysledok ;
        vysledok = cislo1.multiply(cislo2);
        return vysledok.toString();
    }
    


    public String vynasobDveCisla(String cislo1, String cislo2){
   
       int dlzka1, dlzka2;
        
       int zvysok = 0;
       dlzka1= cislo1.length();
       dlzka2= cislo2.length();
       int x = -1,y = -1;
       char[][] vysledky = new char[dlzka1][(dlzka2 + dlzka1+1)] ;
       for(int i =0; i <dlzka1; i++){
           for(int j = 0; j <(dlzka2 + dlzka1+1); j++){
               vysledky[i][j] = '0';
           }
       }
       for(int i = dlzka1 -1; i>= 0; i--){
           y = x;
           x+=1;
           
           for(int j = dlzka2 -1; j>=0; j--){
               y +=1;
               int cinitel1= Character.getNumericValue(cislo1.charAt(i));
               int cinitel2 = Character.getNumericValue(cislo2.charAt(j));
               int sucin = cinitel1 * cinitel2;
               sucin += zvysok;
               String suc =String.valueOf(sucin);
               if(sucin >9  ){
                  
                   zvysok =Character.getNumericValue(suc.charAt(0));
                   vysledky[x][y] =suc.charAt(1);
                   if(j ==0){
                        String zvys =String.valueOf(zvysok);
                        vysledky[x][y+1] = zvys.charAt(0);
                        zvysok = 0;
                    }
               } else {
               vysledky[x][y] = suc.charAt(0) ;
               zvysok = 0;
               }
           }
       }
       ArrayList<Character> finish = new ArrayList<Character>();
       
       for(int i = 0; i < (dlzka2 + dlzka1+1); i++){
           int scitanie = 0;
           for(int j = 0; j< dlzka1 ; j++){
               scitanie += Character.getNumericValue(vysledky[j][i]);
           }
           scitanie += zvysok;
           String scit = String.valueOf(scitanie);
           if(scit.length() > 1){
               finish.add(scit.charAt(scit.length()-1));
               if (scit.length() >2){
               String zv = scit.substring(0, scit.length()-1);
               zvysok = Integer.parseInt(zv);
               }else {
                   zvysok = Character.getNumericValue(scit.charAt(0));
                   
               }
               
           } else {
                finish.add(scit.charAt(0));
                zvysok = 0;
           }
       }
       String ret = "";
       for(int i = finish.size() -1; i >=0; i-- ){
           ret += finish.get(i);
           if(ret.equals("0")){
               ret = "";
           } 
       } 
       return ret;

    }
}