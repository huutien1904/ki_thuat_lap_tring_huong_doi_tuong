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
public class DauNgoac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        
        while(n-->0){
            Stack<Integer> stk = new Stack<>();
            String s = in.nextLine();
            int d =1;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '('){
                    stk.add(d);
                    System.out.print(d + " ");
                    d++;
                }else if (s.charAt(i) == ')'){
                    System.out.print(stk.peek()+" ");
                    stk.pop();
                }
                    
            }
            System.out.println("");
        }
    }
}
