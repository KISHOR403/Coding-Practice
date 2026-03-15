import java.util.ArrayList;
import java.util.Collections;

class ArrayListdemo{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add element
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);


        // get element
        int element = list.get(1);
        System.out.println(element);


        //add el in between 
        list.add(1, 2);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}