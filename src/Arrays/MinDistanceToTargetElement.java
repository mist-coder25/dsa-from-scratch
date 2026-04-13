package Arrays;
import java.util.*;
public class MinDistanceToTargetElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0 ; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = sc.nextInt();

        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                int distance = Math.abs(i - start);
                minDistance = Math.min(minDistance, distance);
            }
        }
        System.out.println(minDistance);
        sc.close();
    }
}
