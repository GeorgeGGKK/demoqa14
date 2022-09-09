package com.demoqa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.base.BaseTest;
import com.demoqa.pages.StudentRegistrationFormPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class DemoQaTest extends BaseTest {
    StudentRegistrationFormPage form = new StudentRegistrationFormPage();


    @Test
    @DisplayName("Заполнение и проверка формы регистрации")
    void checkRegistrationFormTest() {
        step("Открыть страницу формы регистрации", () -> {
            open("/automation-practice-form");
        });
        form.fillRegistrationForm()
                .equalsFormValues();


    }
}
