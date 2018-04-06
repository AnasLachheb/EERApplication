package com.anas.test.cucumber.stepdefs;

import com.anas.test.EerApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = EerApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
