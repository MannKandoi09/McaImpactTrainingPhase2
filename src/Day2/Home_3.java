package Day2;
import java.util.*;
public class Home_3 {
        public static int longestSubarray(int[] arr, int k) {

            Map<Integer, Integer> map = new HashMap<>();

            int prefixSum = 0;
            int maxLength = 0;

            for (int i = 0; i < arr.length; i++) {

                prefixSum += arr[i];

                if (prefixSum == k) {
                    maxLength = i + 1;
                }

                if (map.containsKey(prefixSum - k)) {
                    int length = i - map.get(prefixSum - k);
                    maxLength = Math.max(maxLength, length);
                }

                if (!map.containsKey(prefixSum)) {
                    map.put(prefixSum, i);
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {

            int[] arr = {10, 5, 2, 7, 1, 9};
            int k = 15;

            System.out.println(longestSubarray(arr, k));
        }

}
