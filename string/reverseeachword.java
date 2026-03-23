public class reverseeachword {
    public static void main(String[] args) {

        String str = "Java is powerful";
        StringBuilder result = new StringBuilder();
        String word = "";

        for(int i = 0; i <= str.length(); i++) {

            // word complete (space ya end)
            if(i == str.length() || str.charAt(i) == ' ') {

                // reverse word
                StringBuilder sb = new StringBuilder(word);
                result.append(sb.reverse());

                // space add (last me nahi)
                if(i != str.length()) {
                    result.append(" ");
                }

                word = ""; // reset

            } else {
                word += str.charAt(i); // word bana rahe hain
            }
        }

        System.out.println(result);
    }
}
