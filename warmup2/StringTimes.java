package warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String a = "";
        for (int i = 0; i < n; i++) {
            a = a + str;
        }
        return a;
    }
}
