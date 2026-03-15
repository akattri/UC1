public class uc5 {

    public static void main(String[] args) {
        String[] banner = {
            String.join("  ", " ***** ", " ***** ", "****** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "* "),
            String.join("  ", "*     *", "*     *", "*     *", "* "),
            String.join("  ", "*     *", "*     *", "****** ", " ***** "),
            String.join("  ", "*     *", "*     *", "* ", "           *"),
            String.join("  ", "*     *", "*     *", "* ", "           *"),
            String.join("  ", " ***** ", " ***** ", "* ", "      *****")
        };

        for (String row : banner) {
            System.out.println(row);
        }
    }
}
