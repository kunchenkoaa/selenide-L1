package practiceFormTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class practiceFormTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void practiceFormTest () {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $(".main-header").shouldHave(text("Practice Form"));
        $("#firstName").setValue("John");
        $("#lastName").setValue("Doe");
        $("#userEmail").setValue("test@email.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Commerce").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("img/File.png");
        $("#currentAddress").setValue("Test address 1111");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
        $("#submit").click();

        sleep (1000);


    }

}
