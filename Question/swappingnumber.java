class swappingnumber {
    public static void main(String[] args){
        int a = 10, b=20;
        System.out.println("Before swapping: " + a +" "+b);

        //logic1 - third variable
        // 
        // int t=a;
        // a=b;
        // b=t;

//Logic 2 - use +& - without third variable
// a = a + b;
// b = a - b;
// a = a - b;
        

//Logic 3 - use *& / without third variable
// here a & b values should not be zero
// a = a*b;
// b = a/b;
// a = a/b;


// logic4  single statement
b=a+b-(a=b);


        System.out.println("After swapping: " +a + " "+b);
    }
}