import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidationTest {

   //EINFACHER TEST OB IN EINEM PW DER TEST AUFGEHT
   @Test
   public void passwordLongerXChar(){
       //GIVEN
       String testPassword2 = "neuefische";

       //WHEN
       boolean passwordLongerXChar = PasswordValidation.passwordLongerXChar(testPassword2);

       //THEN
       assertEquals(true, passwordLongerXChar);

   }

   // EINFACHER TEST OB IN EINEM PW DER TEST AUFGEHT

    @Test
    public void passwordContainsRequiredCharactersTest(){
    //GIVEN
    String testPassword1 = "Hallo7neueFische";

    //WHEN
    boolean passwordMatchesRequirements = PasswordValidation.passwordContainsRequiredCharacters(testPassword1);

    //THEN
    assertTrue(passwordMatchesRequirements);
   }


//PARAMETRISIERTER TEST MIT ARGUMENTEN

    @ParameterizedTest
    @MethodSource("factoryMethod") // <-- Name der Factory Methode; wenn leer, dann wird nach einer gleichnamigen gesucht
    void testMethod(boolean passwordBoolean, String passwordArguments) {
        assertEquals(passwordBoolean ,PasswordValidation.passwordContainsRequiredCharacters(passwordArguments));
    }

    static Stream<Arguments> factoryMethod() { // Return value ist ein Stream mit Integern
        return (Stream) Stream.of(
                Arguments.of(false, "Hello"),
                Arguments.of(false, "passwort44"),
                Arguments.of(false, "neuefische3"),
                Arguments.of(true, "NeueFische999")
        );
    }

}
