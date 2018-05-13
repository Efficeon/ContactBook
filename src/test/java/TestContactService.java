import com.ContactBook.ApplicationRun;
import com.ContactBook.model.Contact;
import com.ContactBook.service.ContactService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationRun.class)
@WebAppConfiguration
public class TestContactService
{
    @Autowired
    ContactService contactService;

    private List<Contact> listContacts;

    @Test
    public void getAllContact(){
        listContacts = contactService.getAllContacts();
        Assert.assertNotNull(listContacts);
    }

    @Test
    public void saveContact()
    {
        Contact contact = new Contact();
        contact.setId(999);
        contact.setName("test_name");
        contact.setLastName("test_last_name");
        contact.setPhone("123456");
        contactService.addContact(contact);
    }
}
