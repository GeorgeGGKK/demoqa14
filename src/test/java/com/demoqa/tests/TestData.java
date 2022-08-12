package com.demoqa.tests;

import com.demoqa.utils.RandomUtils;
import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    private static String firstName = faker.name().firstName();
    private static String lastName = faker.name().lastName();
    private static String email = faker.internet().emailAddress();
    private static String phoneNumber = RandomUtils.getRandomString(10);
    ;
    private static String subject = "Chemistry";
    private static String currentAddress = faker.address().fullAddress();
    private static String picture = "src/test/resources/1.jpeg";
    private static String state = "NCR";
    private static String city = "Delhi";
    private static String title_thanks = "Thanks for submitting the form";
    private static String gender = "Male";
    private static String date_of_birth = "20 December,1994";
    private static String day = "20";
    private static String month = "December";
    private static String year = "1994";

    public static String getDay() {
        return day;
    }

    public static String getMonth() {
        return month;
    }

    public static String getYear() {
        return year;
    }

    private static String hobbies = "Sports, Reading, Music";

    public static String getTitle_thanks() {
        return title_thanks;
    }

    public static String getGender() {
        return gender;
    }

    public static String getDate_of_birth() {
        return date_of_birth;
    }

    public static String getHobbies() {
        return hobbies;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPhoneNumber() {
        return phoneNumber;
    }

    public static String getSubject() {
        return subject;
    }

    public static String getCurrentAddress() {
        return currentAddress;
    }

    public static String getPicture() {
        return picture;
    }

    public static String getState() {
        return state;
    }

    public static String getCity() {
        return city;
    }
}
