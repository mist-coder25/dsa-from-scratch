import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n == 0) return;
        int prev2 = 0;
        System.out.print(prev2 + " ");

        if(n == 1) return;
        int prev1 = 1;
        System.out.print(prev1 + " ");

        for(int i = 2; i < n; i++){
            int newFibonacciNumber = prev1 + prev2;
            System.out.print(newFibonacciNumber + " ");
            prev2 = prev1;
            prev1 = newFibonacciNumber;
        }
        sc.close();
    }
}
