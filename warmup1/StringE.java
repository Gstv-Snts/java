package warmup1;

public class StringE {
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'e') {
                count++;
            }
        }
        if (count >= 1 && count <= 3) {
            return true;
        } else {
            return false;
        }
    }
}
