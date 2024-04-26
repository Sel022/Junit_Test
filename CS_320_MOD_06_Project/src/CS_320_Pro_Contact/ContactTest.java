package CS_320_Pro_Contact;

//Selvadurai Pathmathasan_320_mod_06_Contact
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("C1", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("C1", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

}