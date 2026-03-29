public class OOPSBannerApp {
    private static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

   
    private static class CharacterPatternMap {
        public static CharacterPattern getCharacterPattern(char c) {
            return switch (Character.toUpperCase(c)) {
                case 'O' -> new CharacterPattern('O', new String[]{
                    "  OOO  ",
                    " O   O ",
                    " O   O ",
                    " O   O ",
                    "  OOO  "
                });
                case 'P' -> new CharacterPattern('P', new String[]{
                    " PPPP  ",
                    " P   P ",
                    " PPPP  ",
                    " P     ",
                    " P     "
                });
                case 'S' -> new CharacterPattern('S', new String[]{
                    "  SSSS ",
                    " S     ",
                    "  SSS  ",
                    "     S ",
                    " SSSS  "
                });
                default -> new CharacterPattern(c, new String[]{" ", " ", " ", " ", " "});
            };
        }
    }

   
    public void generateBanner(String text) {
        int height = 5; 
        StringBuilder bannerBuilder = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (char c : text.toCharArray()) {
                CharacterPattern cp = CharacterPatternMap.getCharacterPattern(c);
                bannerBuilder.append(cp.getPattern()[i]).append("  "); 
            }
            bannerBuilder.append("\n");
        }

        System.out.println(bannerBuilder.toString());
    }

    public static void main(String[] args) {
        OOPSBannerApp app = new OOPSBannerApp();
        System.out.println("--- UC7: Object-Oriented Banner ---");
        app.generateBanner("OOPS");
    }
}