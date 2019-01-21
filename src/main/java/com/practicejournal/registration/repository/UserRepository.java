package com.practicejournal.registration.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practicejournal.registration.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,String>  {
    
    User findByEmailAddress(String emailAddress);
    
}
