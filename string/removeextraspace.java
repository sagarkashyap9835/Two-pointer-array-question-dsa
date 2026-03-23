public class removeextraspace {
    public static void main(String[] args) {

        String str = "   hello   world   java   ";
        String result = "";
        boolean spaceSeen = false;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch != ' ') {
                result += ch;
                spaceSeen = false;
            } else {
                if(!spaceSeen && result.length() != 0) {
                    result += ' ';
                    spaceSeen = true;
                }
            }
        }

        System.out.println(result);
    }
}
