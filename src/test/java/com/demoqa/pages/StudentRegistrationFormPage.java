package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.tests.TestData;
import com.demoqa.components.CalenderComponent;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class StudentRegistrationFormPage {
    public CalenderComponent calenderComponent = new CalenderComponent();
    SelenideElement firstName = $x("//input[@id='firstName']");
    SelenideElement lastName = $x("//input[@id='lastName']");
    SelenideElement email = $x("//input[@id='userEmail']");
    SelenideElement gender = $x("//label[@for='gender-radio-1']");
    SelenideElement userNumber = $x("//input[@id='userNumber']");
    SelenideElement dateOfBirth = $("#dateOfBirthInput");
    SelenideElement subjects = $x("//input[@id='subjectsInput']");
    SelenideElement hobbiesSports = $x("//label[@for='hobbies-checkbox-1']");
    SelenideElement hobbiesReading = $x("//label[@for='hobbies-checkbox-2']");
    SelenideElement hobbiesMusic = $x("//label[@for='hobbies-checkbox-3']");
    SelenideElement picture = $x("//input[@id='uploadPicture']");
    SelenideElement currentAddress = $x("//textarea[@id='currentAddress']");
    SelenideElement state = $x("//input[@id='react-select-3-input']");
    SelenideElement city = $x("//input[@id='react-select-4-input']");
    SelenideElement submitButton = $x("//button[@id='submit']");

    public ComplitedFormPage fillRegistrationForm() {
        firstName.setValue(TestData.getFirstName());
        lastName.setValue(TestData.getLastName());
        email.setValue(TestData.getEmail());
        gender.click();
        userNumber.setValue(TestData.getPhoneNumber());
        setDateOfBirth(TestData.getDay(),TestData.getMonth(),TestData.getYear());
        subjects.setValue(TestData.getSubject()).pressEnter();
        hobbiesSports.click();
        hobbiesReading.click();
        hobbiesMusic.click();
        picture.uploadFile(new File(TestData.getPicture()));
        currentAddress.setValue(TestData.getCurrentAddress());
        state.setValue(TestData.getState()).pressEnter();
        city.setValue(TestData.getCity()).pressEnter();
        submitButton.pressEnter();
        return new ComplitedFormPage();
    }
    public void setDateOfBirth(String day, String month, String year) {
        dateOfBirth.click();
        calenderComponent.setDate(day, month, year);
    }

}
