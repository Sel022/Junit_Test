package CS_320_Pro_Contact;
//Selvadurai Pathmathasan_320_mod_06_Contact
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    @Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("B1", "Thomson", "Philip", "1234567890", "222 nd St");
        contactService.addContact(contact);

        assertNotNull(contactService.getContactById("B1"));
    }

}