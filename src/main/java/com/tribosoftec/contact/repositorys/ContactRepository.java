package com.tribosoftec.contact.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tribosoftec.contact.domains.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
