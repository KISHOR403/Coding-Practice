// Writw a program array union operation

//import java.util.HashSet;
//
//public class Union {
//    public static void main(String[] args) {
//
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {4, 5, 6, 7, 8};
//
//
//        HashSet<Integer> unionSet = new HashSet<>();
//
//
//        for (int num : arr1) {
//            unionSet.add(num);
//        }
//
//
//        for (int num : arr2) {
//            unionSet.add(num);
//        }
//
//
//        System.out.println("Union of the two arrays:");
//        for (int num : unionSet) {
//            System.out.print(num + " ");
//        }
//    }
//}



// you are given a array of intergers arr[]. you have to reerse the given array.
// input:arr=[1,2,3,2,6,5]
//Output:[5,6,2,3,4,1]


import java.util.Arrays;

public class Union {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 6, 5};
        int n = arr.length;

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}



// arrange even and odd number such that old comes after even?  Using O(n) complexity?