import java.util.*;
public class ConditionalStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int botton = sc.nextInt();

//        if(age > 18){
//            System.out.println("Adult");
//        } else {
//            System.out.println("Not Adult");
//        }

//        if(x % 2 == 0){
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//        if(a == b) {
//            System.out.println("Equal");
//        } else {     // or else if(){
//            if(a > b){
//                System.out.println("a is greater");
//            } else {
//                System.out.println("a is lesser");
//            }
//        }

        switch(botton){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");
        }
    }
}
