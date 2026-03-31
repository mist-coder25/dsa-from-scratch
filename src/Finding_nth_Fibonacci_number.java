import java.util.*;
public class Finding_nth_Fibonacci_number {
    public static int Fibonacci(int n){

        if(n <= 1) return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = Fibonacci(n);
        System.out.print("Fibonacci " + n + " = " + result);

        sc.close();
    }
}
