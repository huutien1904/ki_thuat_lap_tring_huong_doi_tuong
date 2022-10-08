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
public class SuaLaiDauNgoac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while(n-->0){
            String s = in.nextLine();
            System.out.println(""+dem(s));
        }
    }

    private static int dem(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[' || (s.charAt(i) == ']' && stk.empty())) stk.push(s.charAt(i));
            else if(s.charAt(i) == ']'){
                if(stk.size() > 0 && stk.peek() == '[')stk.pop();
                else stk.push(s.charAt(i));
            }
        }
        int d1 =0 ;
        int d2 =0;
        while(!stk.empty()){
            if(stk.peek() == '['){
                d1++;
                stk.pop();
            }
            else{
                d2++;
                stk.pop();
            }
            
        }
        int res = d1/2+d2/2+d1%2+d2%2;
        return res;
    }
}
