public class CountWordsPair {
    public static void main(String[] args) {

        String str = "   Java is very  strong  c   powerful";
        int count = 0;

        // first word check (agar first char space nahi hai)
        if(str.charAt(0) != ' ') {
            count++;
        }

        for(int i = 0; i < str.length() - 1; i++) {
            char currentchar = str.charAt(i);
            char nextchar = str.charAt(i + 1);

            // space ke baad letter → new word
            if(currentchar == ' ' && nextchar != ' ') {
                count++;
            }
        }

        System.out.println("Total no of words: " + count);
    }
}
