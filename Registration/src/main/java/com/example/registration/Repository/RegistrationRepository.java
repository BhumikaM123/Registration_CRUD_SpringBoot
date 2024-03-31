package com.example.registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.Entity.RegistrationEntity;



@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity,Long> {
	
}
