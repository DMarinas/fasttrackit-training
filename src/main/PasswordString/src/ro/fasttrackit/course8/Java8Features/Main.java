package ro.fasttrackit.course8.Java8Features;

public class Main {

    public static boolean isValid(String password)
    {

        //1. Password has at least 12 characters
        if (!((password.length() >= 12))){
            System.out.println("Invalid Password --> Give at least 12 characters");
             return false;
        }
        //2. Password has upper case and lower case
        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println("Invalid Password --> Small letters are missing");
                return false;
            }
        }
        // 3. Password has only letters and digits (no spaces or special characters)

        // to check space
        if (password.contains(" ")) {
            System.out.println("Invalid Password --> Password contains empty spaces");
            return false;
        }
        // for special characters
        if ((password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            System.out.println("Invalid Password --> Not aloud to use special characters");
            return false;
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println("Invalid Password --> Capital letters are missing");
                return false;
            }
        }

        //4. Check if password contains 3 digits
        char element;
        int digit=0;

        for(int index = 0; index < password.length(); index++ ){

             element = password.charAt( index );

             if( Character.isDigit(element) ){
                digit++;
            }

        }

        if( digit < 3 ){
            System.out.println("Invalid Password --> Please introduce at least 3 digits");
            return false;
        }

        // if all conditions fails
        return true;
    }

    public static void main(String[] args) {
        String password1 = "Doruestelamare234";

        if (isValid(password1)) {
            System.out.println(password1);
           System.out.println("Is Valid");
        }
        else {
            System.out.println(password1);
        }

       }
    }

