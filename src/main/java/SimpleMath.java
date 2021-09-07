/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class SimpleMath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int num1 = sc.nextInt();
        System.out.print("What is the second number? ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " +num2+ " = " + (num1+num2));
        System.out.println(num1 + " - " +num2+ " = " + (num1-num2));
        System.out.println(num1 + " * " +num2+ " = " + (num1*num2));
        System.out.println(num1 + " / " +num2+ " = " + (num1/num2));
    }
}
