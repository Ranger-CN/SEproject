package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject51hp {

        Project51hpDelegate project51hpDelegate = new Project51hpDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project51hpDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}