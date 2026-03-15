public class ReverString {
    public static void main(String[] args){
        // using string concatination operator
        String str = "Hello World";
        String rev = "";

        // int len = str.length();

        // for(int i = len-1; i>=0; i--){
        //     rev = rev + str.charAt(i);
        // }
        // System.out.println("Reverse string: " + rev);


        // using char array
        char a[] = str.toCharArray();
        int len = a.length;

        for(int i = len - 1; i >=0; i--){
            rev=rev+a[i];
        }
        System.out.println("Reverse string: " + rev);
    }
}
