package DSASeries.Stack;


import java.util.Stack;

public class Infix {

    public static void main(String[] args) {

        String s = "9-5+3*4/6";
        System.out.println(s);

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // If digit
            if (ch >= '0' && ch <= '9') {
                val.push(ch - '0');
            }

            // If operator stack is empty
            else if (op.size() == 0) {
                op.push(ch);
            }

            else {

                // + or -
                if (ch == '+' || ch == '-') {

                    int v1 = val.pop();  // right operand
                    int v2 = val.pop();  // left operand

                    if (op.peek() == '-')
                        val.push(v2 - v1);

                    if (op.peek() == '+')
                        val.push(v2 + v1);

                    if (op.peek() == '*')
                        val.push(v2 * v1);

                    if (op.peek() == '/')
                        val.push(v2 / v1);

                    op.pop();
                    op.push(ch);
                }

                // * or /
                else if (ch == '*' || ch == '/') {

                    if (op.peek() == '*' || op.peek() == '/') {

                        int v1 = val.pop();  // right operand
                        int v2 = val.pop();  // left operand

                        if (op.peek() == '*') val.push(v2 * v1);

                        if (op.peek() == '/') val.push(v2 / v1);

                        op.pop();
                        op.push(ch);
                    }

                    else {
                        op.push(ch);
                    }
                }
            }
        }

        // Calculate remaining operations
        while (val.size() > 1) {

            int v1 = val.pop();  // right operand
            int v2 = val.pop();  // left operand

            if (op.peek() == '-') val.push(v2 - v1);
            if (op.peek() == '+') val.push(v2 + v1);
            if (op.peek() == '*') val.push(v2 * v1);
            if (op.peek() == '/') val.push(v2 / v1);

            op.pop();
        }

        System.out.println(val.peek());
    }
}

