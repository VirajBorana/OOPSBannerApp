public class OOPSBannerApp {

    public static void main(String[] args) {
<<<<<<< HEAD

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
=======

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    public static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "*     * ",
                " *****  "
        };
>>>>>>> feature/UC6
    }
}