package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.LoginPage;
import com.opencart.pages.MyAccountPage;
import com.opencart.repository.LoginModelRepository;
import com.opencart.utill.DriverUtils;
import org.testng.Assert;

public class LoginPageBL {

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;


    public LoginPageBL() {
       loginPage = new LoginPage();
    }

    public LoginPageBL loginPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmailAddress(loginModel.getEmailAddress());
        inputPassword(loginModel.getPassword());

        clickOnLoginButton1();

        myAccountPage = new MyAccountPage();
        return this;
    }


    private void inputEmailAddress(String email) {
        loginPage.getEmailAddressInput().clear();
        loginPage.getEmailAddressInput().sendKeys(email);
    }

    private void inputPassword(String email) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(email);
    }

    public void clickOnLoginButton1() {
        loginPage.getLoginButton().click();
    }

    public void myAccount() {
        String expectedMessage = "My account";
        Assert.assertEquals(myAccountPage.getMyAccountTitle().getText(), expectedMessage, "Incorrect page title");
    }


}

