package com.demoqa.tests;

import com.demoqa.base.BaseTest;
import com.demoqa.pages.StudentRegistrationFormPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DemoQaTest extends BaseTest {
    StudentRegistrationFormPage form = new StudentRegistrationFormPage();


    @Test
    void checkRegistrationFormTest() {
        open("/automation-practice-form");
        form.fillRegistrationForm()
                .equalsFormValues();


    }
}
