/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atoumatahomework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author خالد
 */
public class AtoumataHomework {
    
    public static void qus1(){
        int  transTable [][]={ {0,1,0},{1,2,1},{2,0,2} };
        System.out.print("Enter word >> ");
        Scanner input =new Scanner(System.in);
        String s=input.nextLine();
        
        char []ss=s.toCharArray();
        int intialState=0;
        int finalState=0;
        int nextSate=intialState;
        
        for(int i=0;i<ss.length;i++){
            char item =ss[i];
            for(int j =0;j<transTable.length;j++){
                if( nextSate ==transTable[j][0] ){
                        if(item == 'a' ){
                              nextSate =  transTable[j][1];
                              item ='n';
                        }else if(item == 'b' ){
                              nextSate =  transTable[j][2];
                               item ='n';
                        }
                }
            }
        }
        if(nextSate ==0 ){
            System.out.println("Accepted !!");
        }else{
            System.out.println("Not Accepted !!");
        }
        
    }
    
    public static void qus2(){
        System.out.print("Enter the set >> ");
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        char input[] = inputStr.toCharArray();
        System.out.print("Enter n >> ");
        int num = in.nextInt();    
         String x[]=new String[input.length];
         String copy[];
             for(int col=0;col<input.length;col++){
                 x[col]=input[col]+"";        
             }
             for(int i=1;i<num;i++){
                int size = (int) Math.pow(input.length, i+1 ); 
                copy=new String[size];
                int count=0;
                for(int j=0;j<x.length;j++){
                    String str=x[j];
                    for(int g=0;g<input.length;g++){
                        copy[count]=str+input[g];
                        count++;
                    }
                }
                x=copy;
             }    
             for(int i=0;i<x.length;i++){
                 System.out.println(x[i]);
             }
      }
   

     
    
    public static void main(String[] args) {
      qus1();
      qus2();
     
    
}
}
