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
public class DanhsoThuTuDauNgoac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        in.nextLine();
        while(n-->0){
            String s = in.nextLine();
            Stack<Integer> stk = new Stack<>();
            int t =1;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '('){
                    stk.add(t);
                    System.out.print(t+" ");
                    t++;
                }else if(s.charAt(i) == ')'){
                    System.out.print(stk.peek() +" ");
                    stk.pop();
                }
            }
            System.out.println();
        }
        
    }
}
