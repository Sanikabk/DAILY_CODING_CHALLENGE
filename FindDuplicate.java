import java.util.Scanner;

public class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        int low = 1;
        int high = arr.length - 1;  // Since array has n+1 elements, so high = n

        // Perform binary search on the range [1, n]
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Count how many numbers are <= mid
            int count = 0;
            for (int num : arr) {
                if (num <= mid) {
                    count++;
                }
            }

            // If count is greater than mid, the duplicate is in the lower half
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // low will be the duplicate number
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array (n+1): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (values between 1 and n):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(arr);
        System.out.println("The duplicate number is: " + duplicate);

        sc.close();
    }
}
