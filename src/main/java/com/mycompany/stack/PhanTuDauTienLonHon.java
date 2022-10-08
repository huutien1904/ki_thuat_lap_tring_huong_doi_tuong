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
public class PhanTuDauTienLonHon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while(n-->0){
            Stack<Integer> stk = new Stack<>();
            int k =in.nextInt();
            int[] a = new int[k];
            int[] kq = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = in.nextInt();
            }
            for (int i = k-1; i >=0 ; i--) {
                while(!stk.empty() && stk.peek() <= a[i]){
                    stk.pop();
                }
                kq[i] = stk.empty() ? -1: stk.peek();
                stk.push(a[i]);
            }
            for (int i = 0; i < k; i++) {
                System.out.print(kq[i] + " ");
            }
            System.out.println("");
            
        }
    }
}
