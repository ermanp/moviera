package com.moviera.ai.moviera;

import com.moviera.MovieraApplication;
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

    //Session & Session Factory
    //EntityManager & Persistence Context
    //Transaction

    @Test
//    @Transactional //As soon as you define a transaction, you're also creating something called ***** PERSISTENT CONTEXT *****
    public void someTest(){
        repository.dummyOperation();


    }


    private void someDummyOperation(){

    }

    @Test
    @Transactional
    public void retrieveUserAndProfileDetails(){
        User user = em.find(User.class,"2001");
        logger.info("user -> {}",user);
        logger.info("profile -> {}",user.getProfile());
    }

}
