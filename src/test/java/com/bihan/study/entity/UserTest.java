package com.bihan.study.entity;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void toStringUser() {

        User user = new User("shebihan",25);
        String result = user.toString("shebihan",25);

        Assert.assertTrue("{\"name\":\"shebihan\".\"age\":25}".equals(result));


    }
}