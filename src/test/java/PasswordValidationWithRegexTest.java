import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationWithRegexTest {



    @ParameterizedTest
    @MethodSource("CheckValidationtest")
    void CheckValidationtest(Boolean checkPasswordRequirements, String passwordArguments) {
        assertEquals(checkPasswordRequirements, PasswordValidationWithRegex.checkPasswordRequirements(passwordArguments));

    }

    static Stream<Arguments> CheckValidationtest() {
        return (Stream) Stream.of(
                Arguments.of(false, "Hallo"),
                Arguments.of(true, "Hallo22"),
                Arguments.of(false, "hallo22"),
                Arguments.of(false, "123allo22")
                );
    }
}
