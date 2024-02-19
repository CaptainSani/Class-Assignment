package Week_4.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinimumArray {

    public  static int min(int[] arr){

        //this line assumes that the array is not empty
        int min = arr[0];


        for(int i = 1; i< arr.length; i++){
            //this line checks if the current element (arr[i]) being iterated over
            //in the array is less than te current min value
            //if teh current value is smaller, updates the value of min to be the value of teh current element
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] a = {33,6,10,2};
        System.out.println(min(a));
    }

    List<String>list = new ArrayList<>();
}
