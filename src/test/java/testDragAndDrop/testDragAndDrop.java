package testDragAndDrop;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class testDragAndDrop {
    @Test
    void testDragAndDrop () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("[id=column-a]").dragAndDropTo($("[id=column-b]"));
        $("[id=column-a]").shouldHave(text("B"));

    }
}
