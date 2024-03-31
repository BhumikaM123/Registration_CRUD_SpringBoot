package com.example.registration.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.Entity.RegistrationEntity;
import com.example.registration.Repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public List<RegistrationEntity> getAllRegistrations() {
        try {
            return registrationRepository.findAll();
        } catch (Exception ex) {
            // Handle the exception here
            ex.printStackTrace();
            return null; // or throw a custom exception
        }
    }

    public RegistrationEntity createRegistration(RegistrationEntity registration) {
        try {
            return registrationRepository.save(registration);
        } catch (Exception ex) {
            // Handle the exception here
            ex.printStackTrace();
            return null; // or throw a custom exception
        }
    }

    public RegistrationEntity updateRegistration(Long id, RegistrationEntity newRegistration) {
        try {
            newRegistration.setId(id);
            return registrationRepository.save(newRegistration);
        } catch (Exception ex) {
            // Handle the exception here
            ex.printStackTrace();
            return null; // or throw a custom exception
        }
    }

    public void deleteRegistration(Long id) {
        try {
            registrationRepository.deleteById(id);
        } catch (Exception ex) {
            // Handle the exception here
            ex.printStackTrace();
        }
    }
}