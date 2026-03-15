//1. Write a program for print following pattern
//****
//***
//**
//*

//public class prcticeloop {
//    public static void main(String[] args) {
//        int rows = 4;  // number of rows
//
//        for (int i = rows; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


//Q2. Write a program to sum first n even number using while loop
//public class prcticeloop {
//    public static void main(String args[]){
//        int sum = 0;
//        int n = 4;
//        for(int i=0; i<n; i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of even number: ");
//        System.out.println(sum);
//
//    }
//}


//Q3. Write a program to print multiplication table of a given number n.
import java.util.Scanner;

public class prcticeloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();   // number whose table we want

        System.out.println("Multiplication table of " + n + ":");

        for (int i = 1; i <= 10; i++) {      // loop runs 10 times
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}