//Q. Print a given name in a function

//import java.util.*;
//public class FunctionandMethod {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
//
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        printMyName(name); // call kiya function ko
//    }
//
//}


//Q. Make a function to add2 numbers and return the sum
//import java.util.*;
//public class FunctionandMethod{
//    public static int calculateSum(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a, b);
//        System.out.println("Print the sum number: " + sum);
//    }
//}



//Q. Make a fnction to multiply 2 numbers and return the product.
//import java.util.*;
//public class FunctionandMethod{
//    public static int calculateProduct(int a, int b){
//        return a * b;
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("Product of 2 numbers is: " + calculateProduct(a, b));
//
//    }
//}


//Q. Find the factorial od a number.
import java.util.*;
public class FunctionandMethod {
    public static void printFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}