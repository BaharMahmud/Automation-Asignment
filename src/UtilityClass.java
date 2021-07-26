import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UtilityClass {
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
}

