/**Jessica Paul
 * Module Three Milestone
 * 5/26/2026
 */

package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        assertTrue(service.addContact(contact));
    }

    @Test
    void testDuplicateContactID() {

        ContactService service = new ContactService();

        Contact contact1 = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        Contact contact2 = new Contact(
                "1234567890",
                "Roronoa",
                "Zoro",
                "1112223333",
                "Grand Line");

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    @Test
    void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        service.addContact(contact);

        assertTrue(service.deleteContact("1234567890"));
    }

    @Test
    void testUpdateFirstName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        service.addContact(contact);

        assertTrue(service.updateFirstName("1234567890", "Roronoa"));
    }

    @Test
    void testUpdateLastName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        service.addContact(contact);

        assertTrue(service.updateLastName("1234567890", "Zoro"));
    }

    @Test
    void testUpdatePhoneNumber() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        service.addContact(contact);

        assertTrue(service.updatePhone("1234567890", "1112223333"));
    }

    @Test
    void testUpdateAddress() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        service.addContact(contact);

        assertTrue(service.updateAddress("1234567890", "Grand Line"));
    }
}