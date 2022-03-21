package warmup2;

public class StringYak {
    public String stringYak(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() - 2; i++) { // yakpak
            if (sb.charAt(i) == 'y' && sb.charAt(i + 1) == 'a' && sb.charAt(i + 2) == 'k') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }

}
