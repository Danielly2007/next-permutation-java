package Desafio;
import java.util.Scanner;

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int start = i + 1;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do array: ");
            int n = scanner.nextInt();

            int[] nums = new int[n];

            System.out.println("Digite os números do array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            Solution solution = new Solution();
            solution.nextPermutation(nums);

            System.out.println("Próxima permutação:");
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }
}
