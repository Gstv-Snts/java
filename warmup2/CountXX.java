package warmup2;

public class CountXX {
    public int countXX(String str) {
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                if (i <= str.length() - 2) {
                    if (str.charAt(i + 1) == 'x') {
                        x++;
                    }
                }
            }
        }
        return x;
    }
}
