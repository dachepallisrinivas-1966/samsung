package com.samsung.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.samsung.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Long> {
	boolean existsByMobile(String mobile);
	boolean existsByEmail(String email);
	
	List<Contact> findByFullName(String fullName);
	Contact findByMobile(String mobile);
	Contact findByEmail(String email);
	
	@Query("SELECT c FROM Contact c WHERE c.dateOfBirth BETWEEN :start AND :end")
	List<Contact> findAllBornInDates(LocalDate start, LocalDate end);

}
