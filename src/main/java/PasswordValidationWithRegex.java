public class PasswordValidationWithRegex {

    public static boolean checkPasswordRequirements(String password){
        boolean passwordMatchesDigit = password.matches(".*\\d+.*");
        boolean passwordMatchesUpperCase = password.matches(".*[A-Z].*");
        boolean passwordMatchesLowerCase = password.matches(".*[a-z].*");

return passwordMatchesDigit && passwordMatchesUpperCase && passwordMatchesLowerCase;
    }
}
