import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 1234

    //     int original = num;
    //     int rev = 0;
    //     int n = Math.abs(num);
    //     while(n > 0){
    //         int rem = n % 10;
    //         rev = rev * 10 + rem;
    //         n = n / 10;
    //     }

    //     if (original < 0) {
    //         rev = -rev;
    //     }

    //     System.out.println(rev);
    //     sc.close();


    // using string builder
    StringBuilder sb = new StringBuilder();
    sb.append(num);
    StringBuilder rev = sb.reverse();
    System.out.println("Reverse number: " + rev);

    }
}
