package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = -1, n;
        do{
            n = scanner.nextInt();
            sum += n; count++;
        }while(n != 0);
        System.out.println(sum/count);
    }

}