package org.example;

import java.util.Arrays;

public class CallByValue {

    public static void main(String[] args) {
        int[] arr = {23,3434,343,34,34,46,54,34,56,8,9,1,3,4,52,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
