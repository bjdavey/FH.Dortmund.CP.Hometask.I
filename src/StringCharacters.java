public class StringCharacters {

    public static void main(String[] args) throws Exception {

        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        int spaces = 0, vowels = 0, letters = 0;

        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                spaces++;
            } else if (c >= 'a' && c <= 'z') {
                letters++;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }

        }

        System.out.println("The text contained vowels: " + vowels + "\n consonants " + (letters - vowels)
                + "\n spaces: " + spaces);
    }

}

//-------------Console Output-------------
// The text contained vowels: 60
//  consonants 93
//  spaces: 37