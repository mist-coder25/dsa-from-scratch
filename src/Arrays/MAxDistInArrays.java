package Arrays;
import java.util.*;
public class MAxDistInArrays {
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        arrays.add(Arrays.asList(1,2,3));
        arrays.add(Arrays.asList(4,5));
        arrays.add(Arrays.asList(1,2,3));

        Solution obj = new Solution();
        int result = obj.maxDistance(arrays);

        System.out.println("Maximum Distance: " + result);

    }
}
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        // Step 1: Take first array values
        int globalMin = arrays.get(0).get(0); // first element
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1); // last element

        int maxDistance = 0;

        // Step 2: Loop through remaining arrays
        for (int i = 1; i < arrays.size(); i++) {

            List<Integer> currentArray = arrays.get(i);

            int currMin = currentArray.get(0);
            int currMax = currentArray.get(currentArray.size() - 1);

            // Step 3: Calculate distance
            int distance1 = Math.abs(currMax - globalMin);
            int distance2 = Math.abs(globalMax - currMin);

            // Step 4: Update max distance
            maxDistance = Math.max(maxDistance, distance1);
            maxDistance = Math.max(maxDistance, distance2);

            // Step 5: Update global values
            globalMin = Math.min(globalMin, currMin);
            globalMax = Math.max(globalMax, currMax);
        }

        return maxDistance;
    }
}