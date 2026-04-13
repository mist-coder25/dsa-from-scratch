package com.ifelseladder;
import java.util.Scanner;
public class Discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount < 0 ){
            System.out.println("invalid input");
        }
        else if(amount == 0){
            System.out.println(0);
        }
        else if(amount < 5000){
            System.out.println(amount);
        }
        else if(amount >= 5000 && amount <= 9999 ){
            System.out.println(amount - (amount * 10 / 100));
        }
        else if(amount >= 10000 && amount <= 19999){
            System.out.println(amount - (amount * 20 / 100));
        }
        else if(amount >= 20000){
            System.out.println(amount - (amount * 30 / 100));
        }

        sc.close();
    }
}
