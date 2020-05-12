package com.tribosoftec.contact.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tribosoftec.contact.domains.Contact;
import com.tribosoftec.contact.services.ContactService;

@RestController
@RequestMapping(value="/contact")
public class ContactResource {
	
	@Autowired
	private ContactService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Contact> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)	
	public Contact addRecord(@RequestBody Contact obj){
		return service.addRecord(obj);
	}
}
