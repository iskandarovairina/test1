package steps;


import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void openUrl(){
        open ("https://app.roll20.net/login");
    }
}
