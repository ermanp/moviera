package com.moviera.repository;

import com.moviera.model.Profile;
import com.moviera.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * User: Erman PAYASLI
 * Date: 5.04.2019
 * Time: 21:41
 */
@Repository
@Transactional
public class UserRepository
{
    @Autowired
    EntityManager em;

    public void saveUserWithProfile(){

        Profile profile = new Profile("Z123456");
        em.persist(profile);
        User user = new User("Ahmet");
        user.setProfile(profile);
        em.persist(user);


    }
}
