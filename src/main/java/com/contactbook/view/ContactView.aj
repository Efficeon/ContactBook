package com.contactbook.view;

import com.contactbook.model.Contact;
import com.contactbook.service.ContactService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean(name="contactView")
@RequestScoped
@Controller
@Getter
@Setter
@NoArgsConstructor
public class ContactView {
    @Autowired
    private ContactService contactService;

    private String name;
    private String lastName;
    private String phone;

    public void add(){
        Contact contact = new Contact();
        contact.setName(getName());
        contact.setLastName(getLastName());
        contact.setPhone(getPhone());
        contactService.addContact(contact);
    }

    public List<Contact> getContactList() {
        return contactService.getAllContacts();
    }
}
