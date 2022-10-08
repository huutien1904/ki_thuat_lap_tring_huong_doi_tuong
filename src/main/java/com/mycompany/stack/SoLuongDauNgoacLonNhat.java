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
public class SoLuongDauNgoacLonNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
            Stack<Character> stk = new Stack<>();
            int dem =0;
            int res =0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)== '(' || s.charAt(i) == ('[') ){
                    stk.push(s.charAt(i));
                }else{
                    if(stk.size() > 0 && s.charAt(i) == ')' && stk.peek() == '(' ){
                        stk.pop();
                    }else if(stk.size() > 0 && s.charAt(i) == ']' && stk.peek() == '[' ){
                        dem++;
                        res = Math.max(res, dem);
                        stk.pop();
                    }else{
                        dem =0;
                    }
                }
            }
            System.out.println(""+res);
    }
}
