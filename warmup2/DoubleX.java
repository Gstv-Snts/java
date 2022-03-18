package warmup2;

public class DoubleX {
    public boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) != 'x') {
                return false;
            } else if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                return true;
            }
        }
        return false;
    }
}
