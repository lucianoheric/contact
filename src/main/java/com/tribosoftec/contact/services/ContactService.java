package com.tribosoftec.contact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tribosoftec.contact.domains.Contact;
import com.tribosoftec.contact.repositorys.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository repo;
	
	public List<Contact> getAll(){
		return repo.findAll();
	}
	
	public Contact addRecord(Contact obj){
		return repo.save(obj);
	}
}
