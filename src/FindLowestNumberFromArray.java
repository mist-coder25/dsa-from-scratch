public class FindLowestNumberFromArray {
    public static void main(String[] args){
        int[] array = {7,12,9,4,15};

        if(array.length == 0){
            System.out.println("Array is empty.");
            return;
        }
        int minVal = array[0];

        for(int i : array){
            if(i < minVal){
                minVal = i;
            }
        }
        System.out.println("Lowest Number From Array is: "+minVal);
    }
}
