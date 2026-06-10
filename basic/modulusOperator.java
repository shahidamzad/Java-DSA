package basic;

public class modulusOperator {
    static void main(String[] args) {
        // a % b give remainder , when a is divided by b .

        int a = 8 ;
        int b = 2 ;
        System.out.println(a%b);

        // modules property :
        // 1.) a % a  = a [when a < b ]
        System.out.println(3%4);
        System.out.println(4%3000);

        // 2.) a%(-b) = a % b [ - , - = - ]
        System.out.println(49%-10);

        // 3.) (-a) % b = -[a%b]
        System.out.println(-49%-10);

    }
}
