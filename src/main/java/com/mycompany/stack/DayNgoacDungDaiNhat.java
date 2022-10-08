/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author TienNH
 */
public class DayNgoacDungDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while(n-->0){
            String s = in.nextLine();
            int res =0;
            Stack<Integer> stk = new Stack<>();
            stk.push(-1);
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '('){
                    stk.push(i);
                    
                }else{
                    stk.pop();
                    if(stk.size() > 0){
                        res = Math.max(res, i-stk.peek());
                    }
                    if(stk.size() == 0) stk.push(i);
                }
            }
            System.out.println(""+res);
        }
    }
}
