package array;

import java.util.Scanner;

public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(arr,n);
        System.out.println("Array after sorting ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void sort(int[] arr, int n)
    {
        int l = 0, m = 0, h = n-1;
        while(m < h)
        {
            if(arr[m] == 2)
            {
                int temp = arr[h];
                arr[h] = arr[m];
                arr[m] = temp;
                h--;
            } else if(arr[m] == 1){
                m++;
            } else {
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                m++;
                l++;
            }
        }
    }

}
