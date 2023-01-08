package gitHubTest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {
    @Test
    void successfulSearchTest() {
        open("https://github.com/selenide/selenide");
        $("[id=wiki-tab]").click();
        $(byText("Show 2 more pages…")).click();
        $("div").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $("div.markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
