package com.demoqa;

public class TestData {
    private static String firstName = "George";
    private static String lastName = "Test";
    private static String email = "test@test.ru";
    private static String phoneNumber = "1234567890";
    private static String subject = "Chemistry";
    private static String currentAddress = "Moscow";
    private static String picture = "src/test/resources/1.jpeg";
    private static String state = "NCR";
    private static String city = "Delhi";
    private static String title_thanks = "Thanks for submitting the form";
    private static String gender = "Male";
    private static String date_of_birth = "20 December,1994";
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
