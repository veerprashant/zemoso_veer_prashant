public class Assignment2 {

    public static void main(String[] args) {
        String input = "1234";

        System.out.println(checkAlpha(input));

        if (checkAlpha(input)==true) {
            System.out.println("Input contains Alphabet");
        } else {
            System.out.println("Input Doesn't contains Alphabet");
        }

    }

    public static boolean checkAlpha(String input) {
        if (input == null) {
            return false;
        }
        for (int i = 0; i <input.length(); i++) {
            char c = input.charAt(i);

            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;

    }
}



//public static boolean isAlpha(String input)
//{
//
//    return input !=null && input.matches("^[a-zA-Z]*$");
//}
//
//}

