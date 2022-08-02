package com.demoqa;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.Selenide.$x;

public class StudentRegistrationFormPage {
    SelenideElement firstName = $x("//input[@id='firstName']");
    SelenideElement lastName = $x("//input[@id='lastName']");
    SelenideElement email = $x("//input[@id='userEmail']");
    SelenideElement gender = $x("//label[@for='gender-radio-1']");
    SelenideElement userNumber = $x("//input[@id='userNumber']");
    SelenideElement datepicker = $x("//input[@id='dateOfBirthInput']");
    SelenideElement month = $x("//select[@class='react-datepicker__month-select']");
    SelenideElement year = $x("//select[@class='react-datepicker__year-select']");
    SelenideElement day = $x("//div[@class='react-datepicker__day react-datepicker__day--020']");
    SelenideElement subjects = $x("//input[@id='subjectsInput']");
    SelenideElement hobbiesSports = $x("//label[@for='hobbies-checkbox-1']");
    SelenideElement hobbiesReading = $x("//label[@for='hobbies-checkbox-2']");
    SelenideElement hobbiesMusic = $x("//label[@for='hobbies-checkbox-3']");
    SelenideElement picture = $x("//input[@id='uploadPicture']");
    SelenideElement currentAddress = $x("//textarea[@id='currentAddress']");
    SelenideElement state = $x("//input[@id='react-select-3-input']");
    SelenideElement city = $x("//input[@id='react-select-4-input']");
    SelenideElement submitButton = $x("//button[@id='submit']");

    public ComplitedFormPage fillRegistrationForm(){
    firstName.setValue(TestData.getFirstName());
    lastName.setValue(TestData.getLastName());
    email.setValue(TestData.getEmail());
    gender.click();
    userNumber.setValue(TestData.getPhoneNumber());
    datepicker.click();
    month.selectOptionByValue(String.valueOf(11));
    year.selectOptionByValue(String.valueOf(1994));
    day.click();
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
}
