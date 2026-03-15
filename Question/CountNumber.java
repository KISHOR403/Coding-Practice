// Count Number Of Digits in A Number
// public class CountNumber {
//     public static void main(String[] args){
//         int num=123456;
//         int count=0;
//         while(num>0){
//             num=num/10;
//             count++;
//         }
//         System.out.println("Number of digits in the number is: " + count);
//     }
// }




// Number of even & odd digit in a number   number = 145678
public class CountNumber {
    public static void main(String[] args){
        int num=12345;

        int even_count=0;
        int odd_count=0;

        while(num>0){
            int rem=num%10;
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("Number of even digits: " + even_count);
        System.out.println("Number of odd digits: " + odd_count);
    }

}
    