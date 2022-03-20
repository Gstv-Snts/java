package warmup2;

public class StringX {
    public String stringX(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < sb.length() - 1; i++) { // xabxxxcdx
            if (sb.charAt(i) == 'x') { // 1234567
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

}
