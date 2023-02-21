
import java.util.List;


public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        // Converting the list to an array
        int [] arr = new int[nums.size()];
        //Initializing max and min values
        int max = 0;
        int diff =0;
        //loop through the List and set each array[index] to equal whatever is on list
        for(int i = 0; i < nums.size(); i++){
            arr[i] = nums.get(i);
        }
        //Setting min to equal first element in array
        int min = arr[0];
        //Loop to set the max value
        for(int j = 0; j < arr.length; j++){
            if(max < arr[j]){

            max = arr[j];
            
            
            }
        }
        //loop to set min value
        for(int k = 0; k < arr.length; k++){
            if(min > arr[k]){

            min = arr[k];
            
            
            }
        }
        diff = max - min;
         return diff;
    }
}
