package warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        int c = 0;
        for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++) {// xxcaazz xxbaaz
            if (a.charAt(i) + a.charAt(i + 1) == b.charAt(i) + b.charAt(i + 1)) {
                c++;
            }
        }
        return c;
    }

}
