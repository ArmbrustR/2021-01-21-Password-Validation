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
     // Also could be used:   char[] passwordCharArray = password.toCharArray();
     // instead of char characterToCheck = password.charAt(i);

        int quantityOfDigits = 0;
        int quantityOfUpperCase = 0;
        int quantityOfLowerCase = 0;

        for (int i = 0; i < password.length() ; i++){
            char characterToCheck = password.charAt(i);

            if (Character.isDigit(characterToCheck)){
                quantityOfDigits = quantityOfDigits +1;
            }
            if (Character.isUpperCase(characterToCheck)){
                quantityOfUpperCase = quantityOfUpperCase +1;
            }
            if (Character.isLowerCase(characterToCheck)) {
                quantityOfLowerCase = quantityOfLowerCase + 1;
            }
        }




        boolean passwordRequirementsMatch = quantityOfDigits > 0 && quantityOfLowerCase > 0 && quantityOfUpperCase > 0;
        System.out.println(passwordRequirementsMatch);

        return passwordRequirementsMatch;

    }


}