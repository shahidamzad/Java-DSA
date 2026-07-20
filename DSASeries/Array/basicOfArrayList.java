package DSASeries.Array;

import java.util.ArrayList;

public class basicOfArrayList {
    public static void main(String[] args) {

                 // data type                     capacity of arr
        ArrayList<Integer> arr1 = new ArrayList<>(6);

        // initialize Arraylist
        arr1.add(0 , 10); // arr[0]
        arr1.add(1 , 20); // arr[1]
        arr1.add(2 , 30); // arr[2]
        arr1.add(3 , 40); // arr[3]
        arr1.add(4 , 50); // arr[4]
        arr1.add(5 , 60); // arr[5]

        // output
//        System.out.println(arr1);

        //for loop
        for (int i = 0; i <=5; i++) {
            System.out.print(arr1.get(i) + " "); // arr[i]
        }
        System.out.println();
        arr1.set(4,0); // modify
        for (int i = 0; i <=5; i++) {
            System.out.print(arr1.get(i) + " "); // arr[i]
        }
    }
}
