package warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String a = ""; // Code C
        for (int i = 0; i <= str.length(); i++) {
            a = a + str.substring(0, i);
        }
        return a;
    }
}
