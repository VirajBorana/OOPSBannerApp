import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        patterns.put('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        });

        patterns.put('S', new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "*     * ",
                " *****  "
        });

        return patterns;
    }

    public static void renderBanner(String word, Map<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String word = "OOPS";

        renderBanner(word, patterns);
    }
}