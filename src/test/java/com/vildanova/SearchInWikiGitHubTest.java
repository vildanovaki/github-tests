package com.vildanova;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchInWikiGitHubTest {

    @Test
    void checkExampleCodeJUnit5InSoftAssertions(){
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //Проверить всписке страниц (Pages) наличие страницы SoftAssertions
        $("#wiki-pages-box").$(withText("Show")).click();
        //Открыть страницу SoftAssertions
        $(byText("SoftAssertions")).click();
        // Проверить что внутри есть пример кода для JUnit5
        $("#wiki-content").shouldHave(text("Using JUnit5 extend test class:"));
    }
}
