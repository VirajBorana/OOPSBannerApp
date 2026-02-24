public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

<<<<<<< HEAD
        banner[0] = String.join("  ", " ***** ", " ***** ", " ******", " ***** ");
        banner[1] = String.join("  ", "*     *", "*     *", "*     *", "*     *");
        banner[2] = String.join("  ", "*     *", "*     *", "*     *", "*     *");
        banner[3] = String.join("  ", "*     *", "*     *", " ******", " ***** ");
        banner[4] = String.join("  ", "*     *", "*     *", "*      ", "*      ");
        banner[5] = String.join("  ", "*     *", "*     *", "*      ", "*      ");
        banner[6] = String.join("  ", " ***** ", " ***** ", "*      ", " ***** ");
=======
                String.join(" ",
                        " *****  ",
                        " *****  ",
                        " ****** ",
                        " *****  "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*      "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "******  ",
                        " *****  "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*       ",
                        "      * "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*       ",
                        "*     * "),

                String.join(" ",
                        " *****  ",
                        " *****  ",
                        "*       ",
                        " *****  ")
        };
>>>>>>> feature/UC5

        for (String line : banner) {
            System.out.println(line);
        }
    }
}