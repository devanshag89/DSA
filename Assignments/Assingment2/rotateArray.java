package Assignments.Assingment2;

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
        d = d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        
    }
    
    static void reverse(int[] arr,int st,int en){
        while(st<en){
            int t = arr[st];
            arr[st] = arr[en];
            arr[en] = t;
            st++;
            en--;
        }
    }
}
