public class replacewordstringbuffer {
     public static void main(String[] args) {

        String str = "Java is easy";
        StringBuffer result = new StringBuffer();

        String word = "";

        for(int i = 0; i <= str.length(); i++) {

            // last me ya space pe word complete
            if(i == str.length() || str.charAt(i) == ' ') {

                if(word.equals("easy")) {
                    result.append("powerful");
                } else {
                    result.append(word);
                }

                // har word k baad  space add karo (last pe nahi)
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
