public class PasswordValidation {


    public static void main(String[] args) {
    String password = "Hello";
    passwordContainsRequiredCharacters(password);
    }

    public static boolean passwordLongerXChar(String password){
        boolean passwordLongerXChar = password.length() > 7;
        return passwordLongerXChar;
    }

    public static boolean passwordContainsRequiredCharacters(String password){
        char[] passwordCharArray = password.toCharArray();

        int quantityOfDigits = 0;
        int quantityOfUpperCase = 0;
        int quantityOfLowerCase = 0;

        for (int i = 0; i < passwordCharArray.length ; i++){

            if (Character.isDigit(passwordCharArray[i])){
                quantityOfDigits = quantityOfDigits +1;
            }
            if (Character.isUpperCase(passwordCharArray[i])){
                quantityOfUpperCase = quantityOfUpperCase +1;
                System.out.println(quantityOfUpperCase);
            }
            if (Character.isLowerCase(passwordCharArray[i])) {
                quantityOfLowerCase = quantityOfLowerCase + 1;
            }
        }

        boolean passwordRequirementsMatch = quantityOfDigits > 0 && quantityOfLowerCase > 0 && quantityOfUpperCase > 0;
        System.out.println(passwordRequirementsMatch);

        return passwordRequirementsMatch;

    }
}