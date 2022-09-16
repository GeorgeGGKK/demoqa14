package com.demoqa.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        DesiredCapabilities capabilities = new DesiredCapabilities();

        Configuration.browserCapabilities = capabilities;
        Configuration.browserSize = "2160x1440";
        Configuration.baseUrl = "https://demoqa.com";
        if(System.getProperty("remote").equals("true")) {
            Configuration.browser = System.getProperty("browser_name");
            Configuration.browserVersion = System.getProperty("browser_version");
            Configuration.browserSize = System.getProperty("browser_size");
            Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
        } else {
            Configuration.browser ="chrome";
            Configuration.browserSize ="1920x1180";
        }
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
