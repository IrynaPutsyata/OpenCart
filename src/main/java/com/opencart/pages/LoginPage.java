package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id ="input-email")
    private WebElement emailAddressInput;

    @FindBy(id ="input-password")
    private WebElement passwordInput;

    @FindBy(xpath = ".//*[@class='btn btn-primary']")
    private WebElement loginButton1;

    public WebElement getEmailAddressInput() {
        return emailAddressInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getLoginButton() {
        return loginButton1;
    }
}

