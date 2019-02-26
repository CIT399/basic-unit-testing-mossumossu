import static org.junit.jupiter.api.Assertions.*;

class TestTelephone {
    private Telephone testPhone = new Telephone();

    @org.junit.jupiter.api.Test
    void format1() {
        assertEquals("123456", testPhone.format("123456"), "Input string is returned when it's not correct length.");
    }

    @org.junit.jupiter.api.Test
    void format2() {
        assertEquals("(123)456-7890", testPhone.format("1234567890"), "10 digit string is returned formatted.");
    }

    @org.junit.jupiter.api.Test
    void format3() {
        assertEquals("(ABC)777-9999", testPhone.format("ABC7779999"), "10 digit string is returned formatted");
    }
}