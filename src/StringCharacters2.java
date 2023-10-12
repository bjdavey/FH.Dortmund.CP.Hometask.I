import java.util.ArrayList;
import java.util.List;

public class StringCharacters2 {

    // a "word" is one or more alphabetic character(s) surrounded by nothing, space,
    // or special character
    public static void main(String[] args) throws Exception {

        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        List<String> words = new ArrayList<String>();

        String tmp = "";
        for (int i = 0; i < text.length() - 1; i++) {
            char current = Character.toLowerCase(text.charAt(i));
            if (current >= 'a' && current <= 'z') {
                tmp += text.charAt(i);
            }

            char next = Character.toLowerCase(text.charAt(i + 1));
            if (next < 'a' || next > 'z') {
                if (tmp.trim() != "") {
                    words.add(tmp);
                }
                tmp = "";
            }
        }

        var sorted = bubbleSort(words);
        for (var s : sorted) {
            System.out.println(s);
        }

    }

    private static List<String> bubbleSort(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                var current = list.get(i);
                var successive = list.get(j);

                if (successive.toLowerCase().compareTo(current.toLowerCase()) < 0) {
                    // Swap
                    list.set(i, successive);
                    list.set(j, current);
                    // var tmp = current;
                    // current = successive;
                    // successive = tmp;
                }

            }
        }
        return list;
    }

}


//-------------Console Output-------------
// a
// against
// and
// and
// arms
// arrows
// be
// be
// by
// end
// fortune
// in
// is
// mind
// nobler
// not
// of
// of
// opposing
// or
// or
// outrageous
// question
// sea
// slings
// suffer
// take
// that
// the
// the
// the
// them
// tis
// to
// To
// to
// to
// troubles
// Whether