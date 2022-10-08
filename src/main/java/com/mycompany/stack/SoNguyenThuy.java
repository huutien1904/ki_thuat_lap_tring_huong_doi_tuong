/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author TienNH
 */
public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int t = in.nextInt();
            Queue<String> que = new LinkedList<>();
            que.add("4");
            que.add("5");
        }
    }
    
    public static boolean ktraChan(String n){
        int dodai = n.length();
        if(dodai % 2 ==0 ) return true;
        else return false;
    }
    public static boolean kTraSoDoiXung(String n){
        int dodai = n.length();
        for (int i = 0; i < n.length()/2; i++) {
            if(n.charAt(i) != n.charAt(n.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
