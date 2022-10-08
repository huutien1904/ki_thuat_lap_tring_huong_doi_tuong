/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author TienNH
 */
public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while(n-->0){
           String s = in.nextLine();
           s.trim();
           String s1 = "";
           if(s.charAt(s.length() -1) != '.'){
               System.out.println("NO");
               continue;
           }
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ')' || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == ']' ){
                    s1 += s.charAt(i);
                }
            }
           if(ktra(s1)){
               System.out.println("YES");
           }
           if(ktra(s1) == false) {
               System.out.println("NO");
           }
            
        }
    }
    public static boolean ktra(String s){
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(s.length() - 1) != '.'){
//                    return false;
//                    }
            if(s.charAt(i) == '(' || s.charAt(i) == '['){
                stk.push(s.charAt(i));
            }else{
                if (!stk.isEmpty()) {
                    if (s.charAt(i) == ')' && stk.peek() == '(') {
                        stk.pop();
                    } else if (s.charAt(i) == ']' && stk.peek() == '[') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } 
                else {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
