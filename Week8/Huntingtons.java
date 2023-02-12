import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Huntingtons {

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int n = dna.length();
        int maxCount = 0;
        int count = 0;

        int i = 0;
        if (dna.length() < 3)
            return 0;
        while (i <= n - 3) {
            if (dna.charAt(i) == 'C') {
                String condon = dna.substring(i, i + 3);
                if (condon.equals("CAG")) {
                    count++;
                    maxCount = Math.max(count, maxCount);
                    i += 3;
                    continue;
                }
            }
            count = 0;
            i++;
        }
        return maxCount;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines)
    // removed.

    public static String removeWhitespace(String s) {
        char[] characters = new char[s.length()];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ' || s.charAt(i) == '\t' || s.charAt(i) == '\n')) {
                characters[j] = s.charAt(i);
                j++;

            }

        }

        String s2 = new String(characters, 0, j);

        return s2;

    }

    // Returns one of these diagnoses corresponding to the maximum number of
    // repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats < 10 || maxRepeats > 180)
            return "not human";
        else if (maxRepeats < 36)
            return "normal";
        else if (maxRepeats < 40)
            return "high risk";
        else
            return "Huntington's";

    }

    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        String data = in.readAll();
        data = removeWhitespace(data);

        int maxRepeats = maxRepeats(data);

        StdOut.println("max repeats = " + maxRepeats);
        StdOut.println(diagnose(maxRepeats));

    }

}
