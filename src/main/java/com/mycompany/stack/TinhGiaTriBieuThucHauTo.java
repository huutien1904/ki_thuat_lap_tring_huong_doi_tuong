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
public class TinhGiaTriBieuThucHauTo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        in.nextLine();
        while(n-->0){
            String s = in.nextLine();
            Stack<Integer> stk = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/'){
                    int tren = stk.peek();
                    stk.pop();
                    int duoi = stk.peek();
                    stk.pop();
                    if(s.charAt(i) == '+'){
                        stk.push(tren+duoi);
                    }
                    if(s.charAt(i) == '-'){
                        stk.push(duoi-tren);
                    }
                    if(s.charAt(i) == '*'){
                        stk.push(tren*duoi);
                    }
                    if(s.charAt(i) == '/'){
                        stk.push(duoi/tren);
                    }
                }else{
                    stk.push(Integer.parseInt(String.valueOf(s.charAt(i))));
                }
            }
            System.out.println(""+stk.peek());
        }
    }
}
