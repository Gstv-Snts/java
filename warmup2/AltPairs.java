package warmup2;

public class AltPairs {
    public String altPairs(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 2; i < sb.length(); i = i + 2) {
            sb.deleteCharAt(i);
            if (sb.length() > 2) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

}
