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

    public void dummyOperation() {
        //Database operation 1 - Retreive user
        User user = em.find(User.class,"402882e26a086546016a08654db60001");
        //Persistent Context includes -> student

        //Database operation 2 - Retreive profile
        user.getProfile();
        //Persistent Context includes -> profile

        //Database operation 3 - update profile
        user.getProfile().setNumber("J345678");
        //Persistent Context includes -> user & profile++


        //Database operation 3 - update user
        user.setName("Alex");
        //Persistent Context includes -> user++ & profile++
    }
}
