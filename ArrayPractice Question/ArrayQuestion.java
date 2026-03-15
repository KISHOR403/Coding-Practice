//1/ Create an array of 5 float and calcute their sum.
// public class ArrayQuestion {
//     public static void main(String[] arg){
//         float[] arr = {11.2f, 22.3f, 33.4f, 44.5f, 55.6f};
//         float sum = 0;

//         for(float num : arr){
//             sum = sum + num;
//         }
//         System.out.println("The sum of this number: " + sum);
//     }
    
// }




//2. Write a program to find out whether a given integer is present in an array or not.
// public class ArrayQuestion{
//     public static void main(String[] arg){
//         int [] arr = {11, 22, 33, 44, 55};
//         int num = 20;
//         boolean isPresent = false;

//         for(int element : arr){
//             if(element == num){
//                 isPresent = true;
//                 break;
//             }
//         }
//         if(isPresent){
//             System.out.println("The number is present in the array.");
//         }
//         else{
//             System.out.println("The number is not present in the array.");
//         }
//     }

// }



// 3. calculate  the average marks from an array containing marks of all student in physics using for each loop.

// public class ArrayQuestion{
//     public static void main(String[] arg){
//         int[] marks = {10, 20, 30, 40, 50};
//         int sum = 0;

//         for(int element : marks){
//             sum = sum + element;
//         }
//         System.out.println("The average marks of the students in physics is: " + (sum/marks.length));
//     }
// }



// 4. write a program to add two matrix of 2*3.
// public class ArrayQuestion{
//     public static void main(String[] arg){
//         int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
//         int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        
//         int[][] resutl = {{0, 0, 0}, {0, 0, 0}};

//         for(int i = 0; i < matrix1.length; i++){
//             for(int j = 0; j < matrix1[i].length; j++){
//                 System.out.format("Adding %d and %d\n", matrix1[i][j], matrix2[i][j]);
//                 resutl[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }
//         System.out.println("The result of addition of two matrix is: ");
//         for(int i = 0; i < resutl.length; i++){
//             for(int j = 0; j < resutl[i].length; j++){
//                 System.out.print(resutl[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// 5. Write a java program to reverse an array
// public class ArrayQuestion{
//     public static void main(String[] arg){
//         int arr[] = {1, 2, 3, 4, 5};
//         int l = arr.length;
//         int n = Math.floorDiv(l, 2);
//         int temp;

//         for(int i = 0; i < n; i++){

//             // swap a[i] and a[l - i - 1]
//             temp =  arr[i];
//             arr[i] = arr[l-1-i];
//             arr[l-1-i] = temp;
//         }
//             for(int element : arr){
//                 System.out.print(element + " ");
//             }
//         // System.out.println(n);
//     }
// }


// 6. Write a java program to find the maximum and minimum element in an array.
public class ArrayQuestion{
    public static void main(String[] arg){
        int[] arr = {11, 22, 33, 44, 55};
        int max = 0;
        
        for(int element : arr){
            if(element >max){
                max = element;
            }
        }
        System.out.println("The maximum element in the array is: " + max);
        
    }
}