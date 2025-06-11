package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nEnter Target: ");
        int target = sc.nextInt();

        int[] res = twoSum(arr, target);

        if(res[0] == -1) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices found:");
            System.out.println("Index 1 = " + res[0]);
            System.out.println("Index 2 = " + res[1]);
            System.out.println("Values: " + arr[res[0]] + " + " + arr[res[1]] + " = " + target);
        }

        sc.close();
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int res = target - arr[i];
            if(mp.containsKey(res)) {
                return new int[]{mp.get(res), i};
            }
            mp.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
