import com.contactbook.model.Contact;
import com.contactbook.repository.ContactRepository;
import com.contactbook.service.ContactService;

import com.contactbook.service.ContactServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class RepositoryContactServiceTest {

    private static final String FIRST_NAME = "Contact_name";
    private static final String LAST_NAME = "Contact_lastName";

    ContactService contactService;

    private ContactRepository contactRepositoryMock;

    @Before
    public void setUp() {
        contactRepositoryMock = mock(ContactRepository.class);
        contactService = new ContactServiceImpl(contactRepositoryMock);
    }

    @Test
    public void saveContact()
    {
        Contact persisted = ContactTestUtil.createModelObject(FIRST_NAME, LAST_NAME);

        when(contactRepositoryMock.save(any(Contact.class))).thenReturn(persisted);
        Contact returned = contactService.addContact(persisted);

        assertEquals(returned, persisted);
    }

    @Test
    public void findAll() {
        List<Contact> persons = new ArrayList<Contact>();
        when(contactRepositoryMock.findAll(any(Sort.class))).thenReturn(persons);

        List<Contact> returned = contactService.getAllContacts();

        assertEquals(persons, returned);
    }
}
