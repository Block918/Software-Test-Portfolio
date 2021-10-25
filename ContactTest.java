import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact contact = new Contact("1", "firstName", "lastName", "1234567", "Willow street 1345"); 
    //class member so that all the methods can access it

    @Test
    void getContactID() {
        assertEquals("1", contact.getContactID());
    }

    @Test
    void getFirstName() {
        assertEquals("firstName", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("lastName", contact.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("1234567", contact.getPhoneNumber());
    }

    @Test
    void getAddress() {
        assertEquals("willow street 1345", contact.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Contact [contactID=1, firstName=firstName, lastName=lastName, phoneNumber=1234567, address=willow street 1345]", contact.toString());
    }

}