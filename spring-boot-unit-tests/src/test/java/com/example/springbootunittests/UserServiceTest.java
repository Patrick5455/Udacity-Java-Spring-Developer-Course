package com.example.springbootunittests;

import com.example.springbootunittests.dao.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

// @RunWith: integrate spring with junit
@RunWith(SpringJUnit4ClassRunner.class)
// @SpringBootTest: this class is springboot test
@SpringBootTest(classes = {SpringBootUnitTestsApplication.class})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testGetUser(){

        Assert.assertEquals(userService.getUser(), "Tom");
    }
}
