package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Giải phương trình bậc hai ax^2 + bx + c = 0");
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if(quadraticEquation.getDiscriminant() < 0)
            System.out.println("Phương trình vô nghiệm");
        else if(quadraticEquation.getDiscriminant() == 0)
            System.out.println("Phương trình có 1 nghiệm là " + quadraticEquation.getRoot1());
        else {
            System.out.println("Phương trình có 2 nghiệm là");
            System.out.println("Nghiệm thứ nhất là " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai là " + quadraticEquation.getRoot2());
        }
    }
}
