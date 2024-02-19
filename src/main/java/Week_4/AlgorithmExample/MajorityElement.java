package Week_4.AlgorithmExample;


//LOGIC
//Iterate through teh array;
//declare a variable counter 0;
//condition to check if arr[i] == arr[j];
//increase the count
public class MajorityElement {
    public boolean isMajorityElement(int[] nums, int target) {
        // write your code here
        //one way to solve it
        int count = 0;
        for(int num : nums){
            if(num == target){
                count++;
            }
        }
        return count > nums.length/2;



        //another way
//        int count = 0;
//        for (int i =0; i < nums.length; i++){
//            for(int j = 0; j < nums.length; j++){
//                if(nums[i] == nums[j]){
//                    count ++;
//                }
//            }
//            if(count >(nums.length/2) && nums[i] == target)){
//        }
    }

}
