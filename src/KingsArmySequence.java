import java.util.Scanner;
public class KingsArmySequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("invalid input");
            return;
        }
        int a = 1;
        int b = 2;

        if(n == 1){
            System.out.print(a);
        }

        else if(n == 2){
            System.out.print(a + " " + b);
        }
        else{
            System.out.print(a + " " + b);

            for(int i = 3 ; i <= n; i++){
                int next = a + b;
                System.out.print(" " + next);

                a = b;
                b = next;
            }
        }

        sc.close();
    }
}
