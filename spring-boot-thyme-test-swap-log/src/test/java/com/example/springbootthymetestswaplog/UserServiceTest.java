package com.example.springbootthymetestswaplog;

import com.example.springbootthymetestswaplog.service.UserServiceClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootThymeTestSwapLogApplication.class})
public class UserServiceTest {

    @Resource
    private UserServiceClass userService;

    @Test
    public void getNameTest(){

        Assert.assertEquals(userService.getName(), "Chinedu");
    }


}
