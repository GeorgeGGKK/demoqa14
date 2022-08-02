package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DemoQaTest extends BaseTest{


    @Test
     void checkRegistrationFormTest(){
        open("/automation-practice-form");
        StudentRegistrationFormPage form = new StudentRegistrationFormPage();
        form.fillRegistrationForm()
                .equalsFormValues();


    }
}
