// package Arrays;


// bruteforce O(n^3)
// public class maxSubArraySum {
//     public static void maxSubSum(int arr[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 currSum = 0;
//                 for (int j2 = i; j2 < j+1; j2++) {
//                     currSum+=arr[j2];
//                 }
//                 if (maxSum<currSum) {
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println("max sum:"+maxSum);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,-2,6,-1,3};
//         maxSubSum(arr);
//     }
// }


// prefix array method O(n^2)
// public class maxSubArraySum {
//     public static void maxSubSum(int arr[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[arr.length];
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i-1]+arr[i];
//         }

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 currSum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
//                 if (maxSum<currSum) {
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println("max sum:"+maxSum);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,-2,6,-1,3};
//         maxSubSum(arr);
//     }
// }



//Kadane's Algorithm O(n)
public class maxSubArraySum {
    public static void maxSubSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) { 
            currSum+=arr[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSum= Math.max(currSum, maxSum);
        }
        System.out.println("Max sum of Subarray is "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubSum(arr);
    }
}