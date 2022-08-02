package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ComplitedFormPage {

    SelenideElement title = $x("//div[@class='modal-title h4']");
    SelenideElement table = $x("//div[@class='table-responsive']");

    void equalsFormValues(){
        title.shouldHave(text(TestData.getTitle_thanks()));
        table.shouldHave(text(TestData.getFirstName()+" "+TestData.getLastName()),
                text(TestData.getEmail()),
                text(TestData.getGender()),
                text(TestData.getPhoneNumber()),
                text(TestData.getDate_of_birth()),
                text(TestData.getSubject()),
                text((TestData.getPicture()).split("/")[3]),
                text(TestData.getCurrentAddress()),
                text(TestData.getState()+" "+TestData.getCity()));
    }
}
