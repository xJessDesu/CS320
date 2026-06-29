/**Jessica Paul
 * Module Three Milestone
 * 5/26/2026
 */

package Contact;

public class ContactService {

    private Contact[] contacts = new Contact[100];
    private int count = 0;

    // add contact
    public boolean addContact(Contact contact) {

        // check for duplicate Contact ID
        for (int i = 0; i < count; i++) {
            if (contacts[i].getContactID().equals(contact.getContactID())) {
                throw new IllegalArgumentException("Contact ID already exists");
            }
        }

        contacts[count] = contact;
        count++;
        return true;
    }

    // remove contact
    public boolean deleteContact(String contactId) {

        for (int i = 0; i < count; i++) {

            if (contacts[i].getContactID().equals(contactId)) {

                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }

                contacts[count - 1] = null;
                count--;
                return true;
            }
        }

        throw new IllegalArgumentException("Contact ID does not exist");
    }

    // update first name
    public boolean updateFirstName(String contactId, String firstName) {
        Contact contact = findContact(contactId);
        contact.setFirstName(firstName);
        return true;
    }

    // update last name
    public boolean updateLastName(String contactId, String lastName) {
        Contact contact = findContact(contactId);
        contact.setLastName(lastName);
        return true;
    }

    // update phone number
    public boolean updatePhone(String contactId, String phone) {
        Contact contact = findContact(contactId);
        contact.setPhone(phone);
        return true;
    }

    // update address
    public boolean updateAddress(String contactId, String address) {
        Contact contact = findContact(contactId);
        contact.setAddress(address);
        return true;
    }

    // search for contact
    private Contact findContact(String contactId) {

        for (int i = 0; i < count; i++) {
            if (contacts[i].getContactID().equals(contactId)) {
                return contacts[i];
            }
        }

        throw new IllegalArgumentException("Contact ID does not exist");
    }
}