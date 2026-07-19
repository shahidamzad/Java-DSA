package DSASeries.Array;

public class question1 {
    static void main(String[] args) {
        // given arr marks of student , if marks less then 35 print roll no. / index of arr

        int[] arr = { 81,32,58,35,45,24,58,14,88,4,55,0} ;

        // use loop

        for (int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] < 35){
                System.out.print(i + " ");
            }
        }
    }
}
