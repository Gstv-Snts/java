package warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        if (str.length() <= 3) {
            String a = "";
            for (int i = 0; i < n; i++) {
                a = a + str;
            }
            return a;
        } else {
            String a = "";
            for (int i = 0; i < n; i++) {
                a = a + str.substring(0, 3);
            }
            return a;
        }
    }

}
