package com.code0.bootDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootDemoApplication.class)
public class BootDemoPropertiesTest {
    @Autowired
    BootDemoProperties profiles;
    @Test
    public void testProfiles()throws Exception{
        // Assert.assertEquals(profiles.getName(),"test name");
        // Assert.assertEquals(profiles.getTitle(),"test title");
        System.out.println(profiles.getActive());
        System.out.println(profiles.getTest());
        System.out.println(profiles.getName());
        System.out.println(profiles.getTitle());
        System.out.println(profiles.getValue());
    }
}