/**Jessica Paul
 * Module Three Milestone
 * 5/26/2026
 */

package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testContactID() {

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        assertEquals("1234567890", contact.getContactID());
        assertEquals("Monkey D", contact.getFirstName());
        assertEquals("Luffy", contact.getLastName());
        assertEquals("East Blue Way", contact.getAddress());
        assertEquals("5656565656", contact.getPhoneNumber());
    }

    @Test
    void testContactIDTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Monkey D", "Luffy", "5656565656", "East Blue Way");
        });
    }

    @Test
    void testNullFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "1234567890",
                    null,
                    "Luffy",
                    "5656565656",
                    "East Blue Way");
        });
    }

    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "1234567890",
                    "Monkey D",
                    "PirateKingXX",
                    "5656565656",
                    "East Blue Way");
        });
    }

    @Test
    void testInvalidPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "1234567890",
                    "Monkey D",
                    "Luffy",
                    "12345",
                    "East Blue Way");
        });
    }

    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "1234567890",
                    "Monkey D",
                    "Luffy",
                    "5656565656",
                    "East Blue Way!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        });
    }

    @Test
    void testUpdateFields() {

        Contact contact = new Contact(
                "1234567890",
                "Monkey D",
                "Luffy",
                "5656565656",
                "East Blue Way");

        contact.setFirstName("Roronoa");
        contact.setLastName("Zoro");
        contact.setPhoneNumber("1112223333");
        contact.setAddress("Grand Line");

        assertEquals("Roronoa", contact.getFirstName());
        assertEquals("Zoro", contact.getLastName());
        assertEquals("1112223333", contact.getPhoneNumber());
        assertEquals("Grand Line", contact.getAddress());
    }
}