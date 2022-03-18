package warmup2;

public class StringBits {
    public String stringBits(String str) {
        String a = "";// Hello
        for (int i = 0; i < str.length(); i = i + 2) {
            a = a + str.charAt(i);
        }
        return a;
    }
}
