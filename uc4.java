public class uc4 {

    public static void main(String[] args) {
        // Step 1: Store the banner lines in a String array
        String[] banner = {
            " ***   ***  ****   **** ",
            "*   * *   * *   * *     ",
            "*   * *   * ****   ***  ",
            "*   * *   * *         * ",
            " ***   ***  *     ****  "
        };

        System.out.println("--- OOPS Banner App UC4 ---");
        String output = String.join("\n", banner);
        
	for (int i = 0; i < banner.length; i++) {
            System.out.println(banner[i]);
        }

    }
}
