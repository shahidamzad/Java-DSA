package DSASeries.String;
import java.util.Scanner;
public class reverseEachWordInSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i = 0, j = 0;
        while (j <= n) {
            if (j == n || sb.charAt(j) != ' ') {
                j++;
            } else {
                reverse(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        // reverse the last word
        reverse(sb, i, j - 1);

        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb, int i, int j) {
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}