//import java.util.*;
//public class SecondDArray {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//
//        //input
//        //rows
//        for(int i=0; i<rows; i++){
//            //columns
//            for(int j=0; j<cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//
//        //output
//        for(int i=0; i<rows; i++){
//            //columns
//            for(int j=0; j<cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}


//Q. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
import java.util.*;
public class SecondDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++){
            //cols
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
            //compare with x
            if(numbers[i][j] == x){
                System.out.println("x found at location (" + i + ", " + j + ")");
            }
        }
    }
}
}

