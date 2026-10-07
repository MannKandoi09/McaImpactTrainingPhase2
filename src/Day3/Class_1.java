package Day3;
import java.util.HashMap;
public class Class_1 {


    public class FirstNonRepeating {

        public static int firstNonRepeating(int[] arr) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int num : arr) {
                if (map.get(num) == 1) {
                    return num;
                }
            }

            return -1;
        }

        public static void main(String[] args) {

            int[] arr = {4, 5, 1, 2, 1, 4, 5};

            System.out.println(firstNonRepeating(arr));
        }
    }
}
