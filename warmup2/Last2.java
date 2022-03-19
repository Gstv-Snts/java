package warmup2;

public class Last2 {
    public int last2(String str) {
        int a = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) {
                a++;
            }
        }
        return a;
    }

}
