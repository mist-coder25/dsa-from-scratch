package com.Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Transactions {
    public static void main(String[] args){

        HashSet<String> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prevTimestamp = -1;

        for(int i = 0; i < n ; i++){

            String Sender = sc.next();
            String Receiver = sc.next();
            int Timestamp = sc.nextInt();
            int Amount = sc.nextInt();

            String key = Sender + "-" + Receiver;

            if(set.contains(key)){
                System.out.println("error duplication transaction");
                return;
            }
            if(i > 0 && (Timestamp - prevTimestamp > 60)){
                System.out.println("fraud detected");
                return;
            }

            set.add(key);
            prevTimestamp = Timestamp;
        }
        System.out.println("all transaction are valid");

        sc.close();
    }
}
