public class removeduplicate {
    public static void main(String[] args) {

        String str = "programming";
        StringBuffer result = new StringBuffer();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // check karo ch pehle se result me hai ya nahi
            boolean found = false;

            for(int j = 0; j < result.length(); j++) {
                if(result.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            // agar duplicate nahi hai to add karo
            if(!found) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
