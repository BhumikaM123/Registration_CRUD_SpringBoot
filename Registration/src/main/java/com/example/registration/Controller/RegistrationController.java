package com.example.registration.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Entity.RegistrationEntity;
import com.example.registration.Service.RegistrationService;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
	 @Autowired
	    private RegistrationService registrationService;

	    @GetMapping
	    public List<RegistrationEntity> getAllRegistrations() {
	        return registrationService.getAllRegistrations();
	    }


	    @PostMapping()
	    public RegistrationEntity createRegistration(@RequestBody RegistrationEntity registration) {
	        RegistrationEntity createdRegistration = registrationService.createRegistration(registration);
	        return createdRegistration;
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<RegistrationEntity> updateRegistration(@PathVariable Long id, @Valid @RequestBody RegistrationEntity newRegistration) {
	        RegistrationEntity updatedRegistration = registrationService.updateRegistration(id, newRegistration);
	        return ResponseEntity.ok(updatedRegistration);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteRegistration(@PathVariable Long id) {
	        registrationService.deleteRegistration(id);
	        return ResponseEntity.noContent().build();
	    }
	}

