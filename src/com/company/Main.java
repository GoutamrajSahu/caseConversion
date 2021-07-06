package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner Sc = new Scanner(System.in);
     StringBuffer str = new StringBuffer(Sc.nextLine());
     for(int i=0; i < str.length();i++){
         char ch = str.charAt(i);
         int ascii = ch;
         if(ascii>=97){
           char a = Character.toUpperCase(ch);
           str.setCharAt(i,a);
         }else if(ascii>=65 && ascii<=90){
             char a = Character.toLowerCase(ch);
             str.setCharAt(i,a);
         }
     }
        System.out.print(str);
    }
}
