package testGitHubSolutions;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class testGitHubSolutions {
    @Test
    void testSolution() {
        open("https://github.com");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("div.col-9-max").shouldHave(text("Build like the best"));
    }
}
