package com.moviera.ai.moviera;

import com.moviera.MovieraApplication;
import com.moviera.model.Profile;
import com.moviera.model.User;
import com.moviera.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * User: Erman PAYASLI
 * Date: 5.04.2019
 * Time: 23:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MovieraApplication.class)
public class UserRepositoryTest
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository repository;

    @Autowired
    EntityManager em;

    @Test
    @Transactional
    public void retrieveUserAndProfileDetails(){
       User user = em.find(User.class,20001L);
       logger.info("user -> {}",user);
       logger.info("profile -> {}",user.getProfile());
    }

    @Test
    @Transactional
    public void retreiveProfileAndAssociatedUser(){
        Profile profile = em.find(Profile.class,40001L);
        logger.info("profile -> {}",profile);
        logger.info("u -> {}", profile.getUser());
    }

}
