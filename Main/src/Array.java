// Defining array 1
//public class Array {
//    public static void main(String args[]){
////        int[] marks = new int[3];
//        int marks[] = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;
//
//        for(int i = 0; i<3; i++){
//            System.out.println(marks[i]);
//        }
//    }
//}



// Defining array 2
//public class Array {
//    public static void main(String args[]){
////
//        int marks[] = {97,98,95};
//
//
//        for(int i = 0; i<3; i++){
//            System.out.println(marks[i]);
//        }
//    }
//}


// Defining array 3
//    import java.util.*;
//public class Array{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        //input
//        for(int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//
//        // Output
//        for(int i = 0; i<size; i++){
//            System.out.println(numbers[i]);
//        }
//    }
//}


//Q. Take an array as input from the user.Search for a given numbers x and print the index at which it occures.
//import java.util.*;
//public class Array{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        //input
//        for(int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//
//        int x = sc.nextInt();
//
//
//      // output
//        for(int i=0; i<numbers.length; i++){
//            if(numbers[i] ==x) {
//                System.out.println("x found at index: " + i);
//            }
//        }
//    }
//}


//Q. Take an array of names as input from the user and print them on the screen.
//import java.util.*;
//
//
//public class Array {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        String names[] = new String[size];
//
//
//        //input
//        for(int i=0; i<size; i++) {
//            names[i] = sc.next();
//        }
//
//        //output
//        for(int i=0; i<names.length; i++) {
//            System.out.println("name " + (i+1) +" is : " + names[i]);
//        }
//
//    }
//}



// Q. Find the maximum & minimum number in an array of integers.
//import java.util.*;
//public class Array{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        for(int i = 0; i<size; i++) {
//            numbers[i] = sc.nextInt();
//        }
//            // Starting values
//            int max = numbers[0];
//            int min = numbers[0];
//
//            // Finding max & min
//            for (int i = 1; i<size; i++){
//                if(numbers[i] > max){
//                    max = numbers[i];
//                }
//
//        if (numbers[i] < min) {
//            min = numbers[i];
//        }
//    }
//        System.out.println("Maximum: " + max);
//        System.out.println("Minimum: " + min);
//    }
//}


