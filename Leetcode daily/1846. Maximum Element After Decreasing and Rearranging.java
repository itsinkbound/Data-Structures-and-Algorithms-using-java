// // O(nlogn approach would be to sort the array and check manually when to update the number, only change the first element to one if not already)

// import java.util.*;

// class Solution {
//     public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
//         Arrays.sort(arr);
//         int n = arr.length;
//         if(arr[0]!=1){
//             arr[0]=1;
//         }
//         for(int i=1;i<n;i++){
//             if(Math.abs(arr[i-1]-arr[i])>1){
//                 arr[i]= arr[i-1]+1;
//             }
//         }
//         return arr[n-1];
//     }
// }

// other approach would be otu use the counting sort approach what we can do is easily 
// create a nums array for storing the counting elements restricting them first by the size n. Since max cannot exceed it. 
// keeping in mind that they cannot also increase the value at each step we will also restrict the answer to that index. 

class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        int nums[] = new int[n+1];
        for(int x : arr){
            nums[Math.min(x,n)]++;
        }
        int ans =1;
        for(int i=2;i<=n;i++){
            int curr = ans + nums[i];
            ans = Math.min(i,curr);
        }
        return ans;
        
    }
}