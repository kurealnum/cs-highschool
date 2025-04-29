import java.util.ArrayList;

public class ap24 {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("an");
        wordList.add("band");
        wordList.add("band");
        wordList.add("abandon");

        for (int i = 1; i < wordList.size(); i++) {
            boolean isChain = false;
            String cur = wordList.get(i);
            String bef = wordList.get(i - 1);
            for (int j = 0; j < cur.length() - bef.length(); j++) {
                if (cur.substring(j, j + bef.length()).equals(bef)) {
                    isChain = true;
                }
            }
        }
    }
}
