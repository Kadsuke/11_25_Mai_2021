package com.mycompany.myapp.cucumber;

import com.mycompany.myapp.TestAvanceApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = TestAvanceApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
