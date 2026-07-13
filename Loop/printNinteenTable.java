package Loop;

public class printNinteenTable {
    static void main(String[] args) {
        int i ;
     // better way to print tables
     // take 10 rounds
        for(i=19;i<=190; i +=19){
            System.out.println(i);
        }

        // takes 171 rounds
        for (i=19;i<=190;i++)
            if(i%19==0){
                System.out.println(i);

            }


    }
}
