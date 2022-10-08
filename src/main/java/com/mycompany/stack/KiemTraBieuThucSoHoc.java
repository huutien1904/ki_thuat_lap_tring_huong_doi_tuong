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
public class KiemTraBieuThucSoHoc {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while(n-->0){
           String s = in.nextLine();
           if(ktra(s)==true){
               System.out.println("Yes");
           }else{
               System.out.println("No");
           }
            
        }
    }

    private static boolean ktra(String s) {
        Stack<Character> stk = new Stack<>();
        boolean ktra = false ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')'){
                ktra = true;
                char top = stk.peek();
                stk.pop();
                while(top != '('){
                    if(top == '+' || top == '-' || top == '*' ||top == '/' )
                        ktra = false;
                    top = stk.peek();
                    stk.pop();
                }
                if(ktra) break;
            }else{
                stk.push(s.charAt(i));
            }
        }
        return ktra;
    }
    
}
