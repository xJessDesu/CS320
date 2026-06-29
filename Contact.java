/**Jessica Paul
 * Module Three Milestone
 * 5/26/2026
 */

package Contact;

public class Contact {

    private final String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {

        if(contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID Invalid");
        }

        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First Name Invalid");
        }

        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last Name Invalid");
        }

        if(phoneNumber == null || phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        if(address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address Invalid");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First Name Invalid");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last Name Invalid");
        }
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber.length != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address Invalid");
        }
        this.address = address;
    }

    public String getContactID() {
        return contactId;
    }

}