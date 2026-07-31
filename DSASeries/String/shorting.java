package DSASeries.String;

import java.util.Arrays;

public class shorting {
    static void main(String[] args) {
        String s = "shahid ";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for (char ele : ch){
            System.out.print(ele);
        }
        System.out.println();

        // StringBuilder -> covert into String the -> convert into charArray
        StringBuilder sb = new StringBuilder("hussain");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        for (char ele : arr){
            System.out.print(ele);
        }
        System.out.println();
    }
}
