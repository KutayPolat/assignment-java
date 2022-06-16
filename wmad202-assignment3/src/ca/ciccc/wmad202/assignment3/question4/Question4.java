package ca.ciccc.wmad202.assignment3.question4;

import java.util.Arrays;

public class Question4 {
    public void invoke(){
        int arr[] = {1,4,5,6,1,2,4,5,6,5};
        int n = arr.length;
        System.out.println(mostRepeated(arr, n));
    }

    public int mostRepeated(int arr[], int n) {

        Arrays.sort(arr);

        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                curr_count++;
            } else{
                curr_count = 1;
            }

            if (curr_count > max_count) {
                max_count = curr_count;
                res = arr[i - 1];
            }
        }
        return res;
    }
}
