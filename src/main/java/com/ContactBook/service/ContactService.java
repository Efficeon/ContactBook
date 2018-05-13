package com.ContactBook.service;

import com.ContactBook.model.Contact;

import java.util.List;

public interface ContactService {
	
	List<Contact> getAllContacts();

	void addContact(Contact contact);
}
