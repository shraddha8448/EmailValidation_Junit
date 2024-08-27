
import org.example.EmailValidation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EmailValidationTest {

    @Test
    void testEmailValidation(){
        String email = "shraddhajadhav834@gmail.com";

        // Valid
        assertTrue(EmailValidation.validateEmailId(email));

        email = "shraddha@";
        // Invalid email addresses
        assertFalse(EmailValidation.validateEmailId(email));

        // Valid emails
        email = "abc@yahoo.com";
        assertTrue(EmailValidation.validateEmailId(email));

        email = "abc-100@yahoo.com";
        assertTrue(EmailValidation.validateEmailId(email));

        email = "abc.100@yahoo.com";
        assertTrue(EmailValidation.validateEmailId(email));

        email = "abc111@abc.com";
        assertTrue(EmailValidation.validateEmailId(email));

        email = "abc@1.com";
        assertTrue(EmailValidation.validateEmailId(email));

        email = "abc@gmail.com";
        assertTrue(EmailValidation.validateEmailId(email));

        email = "abc+100@gmail.com";
        assertTrue(EmailValidation.validateEmailId(email));

        // Invalid emails
        email = "abc";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc@.com.my";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc123@gmail.a";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc123@.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc123@.com.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = ".abc@abc.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc()*@gmail.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc@%*.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc..2002@gmail.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc.@gmail.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc@abc@gmail.com";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc@gmail.com.1a";
        assertFalse(EmailValidation.validateEmailId(email));

        email = "abc@gmail.com.aa.au";
        assertFalse(EmailValidation.validateEmailId(email));
    }

}
