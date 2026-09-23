package Day2;

public class Home_2 {
        public static void main(String[] args) {

            String str = "aabbcdde";

            for (int i = 0; i < str.length(); i++) {

                char current = str.charAt(i);
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (current == str.charAt(j)) {
                        count++;
                    }
                }

                if (count == 1) {
                    System.out.println("First non-repeating character: " + current);
                    break;
                }
            }
        }

}
