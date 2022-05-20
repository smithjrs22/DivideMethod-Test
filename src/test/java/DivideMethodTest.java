import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("JUnit Nested Example Divide Method")
class DivideMethodTest {
    @Nested
    @DisplayName("Seeing if takes scanner input in Main Method")
    @org.junit.jupiter.api.Test
    void main() {
        double num1 = 20;
        double num2 = 10;
        assertEquals(2.0, num1/num2 );
    }
    @Nested
    @DisplayName("Seeing if correctly does the calculation for Divide Method")
    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2.0, DivideMethod.divide(10.0, 5.0));
    }

}