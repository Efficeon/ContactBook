package com.contactbook.service;

import com.contactbook.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();

    void addContact(Contact contact);
}
