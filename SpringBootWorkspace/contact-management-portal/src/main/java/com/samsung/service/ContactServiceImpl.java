package com.samsung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samsung.entity.Contact;
import com.samsung.exception.ContactBookException;
import com.samsung.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepo contactRepo;
	
	@Override
	public List<Contact> getAll() throws ContactBookException {
		return contactRepo.findAll();
	}

	@Override
	public Contact getById(Long cid) throws ContactBookException {
		return contactRepo.findById(cid).orElse(null);
	}

	@Override
	public Contact add(Contact contact) throws ContactBookException {
		if (contact != null) {
			if (contactRepo.existsById(contact.getCid())) {
				throw new ContactBookException("contact with same id already present");
			}
		}
		contactRepo.save(contact);
		return contact;
	}

	@Override
	public Contact modify(Contact contact) throws ContactBookException {
		if (contact != null) {
			if (!contactRepo.existsById(contact.getCid())) {
				throw new ContactBookException("contact not found");
			}
		}
		contactRepo.save(contact);
		return contact;
	}

	@Override
	public void deleteById(Long cid) throws ContactBookException {
		contactRepo.deleteById(cid);
	}

}
