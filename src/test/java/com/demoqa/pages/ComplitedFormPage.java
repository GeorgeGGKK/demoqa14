package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.tests.TestData;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ComplitedFormPage {

    SelenideElement title = $x("//div[@class='modal-title h4']");
    SelenideElement table = $x("//div[@class='table-responsive']");
    @Step("Проверка заполненых полей")
    public void equalsFormValues() {
        title.shouldHave(text(TestData.getTitle_thanks()));
        table.shouldHave(text(TestData.getFirstName() + " " + TestData.getLastName()),
                text(TestData.getEmail()),
                text(TestData.getGender()),
                text(TestData.getPhoneNumber()),
                text(TestData.getDate_of_birth()),
                text(TestData.getSubject()),
                text(TestData.getHobbies()),
                text((TestData.getPicture()).split("/")[3]),
                text(TestData.getCurrentAddress()),
                text(TestData.getState() + " " + TestData.getCity()));
    }
}
