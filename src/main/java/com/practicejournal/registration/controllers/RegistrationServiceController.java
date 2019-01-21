package com.practicejournal.registration.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practicejournal.registration.exception.DuplicateRegistrationException;
import com.practicejournal.registration.model.User;
import com.practicejournal.registration.services.RegistrationService;

@RestController
@RequestMapping(value="v1/user")
public class RegistrationServiceController {
    @Autowired
    private RegistrationService registrationService;
    private static final Logger logger = LoggerFactory.getLogger(RegistrationServiceController.class);

    @RequestMapping(value="/{userId}",method = RequestMethod.GET)
    public User getUser( @PathVariable("userId") String userId) {
        logger.info("Looking up data for user by id {}", userId);

        User user = registrationService.getUserById(userId);
        return user;
    }

    @RequestMapping(value="/{userId}",method = RequestMethod.PUT)
    public void updateUser( @PathVariable("userId") String userId, @RequestBody User user) {
        registrationService.updateUser(user);

    }

    @RequestMapping(value="/{userId}",method = RequestMethod.POST)
    public void saveUser(@RequestBody User user) {
       try {
          registrationService.saveUser(user);
       }
       catch (DataIntegrityViolationException dive) {
           throw new DuplicateRegistrationException(dive.getMessage());
       }       
    }

//    @RequestMapping(value="/{userId}",method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteOrganization( @PathVariable("userId") String userId) {
//        registrationService.deleteUser(userId);
//
//    }
}
