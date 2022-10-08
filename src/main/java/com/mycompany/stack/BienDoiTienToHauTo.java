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
public class BienDoiTienToHauTo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while(n-->0){
            String s = in.nextLine();
            Stack<String> stk = new Stack<>();
            for (int i = s.length() -1; i >=0 ; i--) {
                if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' ){
                    String stren = stk.peek();
                    stk.pop();
                    String sduoi = stk.peek();
                    stk.pop();
                    String t = stren + sduoi + String.valueOf(s.charAt(i));
                    stk.push(t);
                }else{
                    stk.push(String.valueOf(s.charAt(i)));
                }
            }
            System.out.println(""+stk.peek());
        }
    }
}
