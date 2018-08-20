package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println();

        System.out.print("Nhập c: ");
        int c = scanner.nextInt();
        System.out.println();

        int delta;
        if(a == 0){
            System.out.println("x = "+((-c)/b));
        }else{
            delta = (b*b)-(4*a*c);
            if(delta < 0){
                System.out.println("Vô nghiệm");
            }else if(delta == 0){
                System.out.println("Nghiệm kép: "+((-b)/(2*a)));
            }else{
                System.out.println("x1 = "+((-b+Math.sqrt(delta))/(2*a)));
                System.out.println("x2 = "+((-b-Math.sqrt(delta))/(2*a)));
            }
        }
    }
}
