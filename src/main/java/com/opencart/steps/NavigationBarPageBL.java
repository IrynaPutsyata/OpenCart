package com.opencart.steps;

import com.opencart.containers.NavigationBarProductsContainer;
import com.opencart.containers.WishListProductsContainer;
import com.opencart.pages.NavigationBarPage;
import org.jsoup.select.Collector;
import org.testng.Assert;

import java.util.stream.Collectors;

public class NavigationBarPageBL extends WishListPageBL {


    private NavigationBarPage navigationBarPage;


    public NavigationBarPageBL() {
        navigationBarPage = new NavigationBarPage();
    }


    public NavigationBarPageBL addProductToTheWishList() {
        clickOnDesktopsButton();
        clickOnShowAllDesktops();
        addProductsToWishList("Apple Cinema 30\"");
        addProductsToWishList("Canon EOS 5D");
        addProductsToWishList("HP LP3065");
        addProductsToWishList("Palm Treo Pro");
        addProductsToWishList("iPhone");
        addProductsToWishList("iPod Classic");
       // addProductsToWishList("Samsung SyncMaster 941BW");


        //clickOnMacButton();
        // clickOnAddToWishListButton();
        // clickOnLaptopsAndNotebooks();
        // clickOnShowAllLaptopsAndNotebooksButton();
        // clickOnAddToWishListButton1();
        // clickOnComponentsButton();
        // clickOnMonitorsButton();
        // clickOnAddToWishListButton2();
        // clickOnAddToWishListButton3();
        // clickOnTabletsButton();
        // clickOnAddToWishListButton4();
        // clickOnPhonesPDAsButton();
        // clickOnAddToWishListButton5();
        // clickOnCamerasButton();
        // clickOnAddToWishListButton6();


        return this;
    }


    public void clickOnNavigationBar() {
        navigationBarPage.getNavigationBar().click();
    }

    public void clickOnDesktopsButton() {
        navigationBarPage.getDesktopsButton().click();
    }

    public void clickOnMacButton() {
        navigationBarPage.getMacButton().click();
    }

    public void clickOnShowAllDesktops() {
        navigationBarPage.getShowAllDesktops().click();
    }


    public void clickOnAddToWishListButton() {
        navigationBarPage.getAddToWishListButton().click();
    }


    public void clickOnLaptopsAndNotebooks() {
        navigationBarPage.getLaptopsAndNotebooks().click();
    }

    public void clickOnShowAllLaptopsAndNotebooksButton() {
        navigationBarPage.getShowAllLaptopsAndNotebooksButton().click();
    }

    public void clickOnAddToWishListButton1() {
        navigationBarPage.getAddToWishListButton1().click();
    }


    public void clickOnComponentsButton() {
        navigationBarPage.getComponentsButton().click();
    }

    public void clickOnMonitorsButton() {
        navigationBarPage.getMonitorsButton().click();
    }

    public void clickOnAddToWishListButton2() {
        navigationBarPage.getAddToWishListButton2().click();
    }

    public void clickOnAddToWishListButton3() {
        navigationBarPage.getAddToWishListButton3().click();
    }


    public void clickOnTabletsButton() {
        navigationBarPage.getTabletsButton().click();
    }

    public void clickOnAddToWishListButton4() {
        navigationBarPage.getAddToWishListButton4().click();
    }


    public void clickOnPhonesPDAsButton() {
        navigationBarPage.getPhonesPDAsButton().click();
    }

    public void clickOnAddToWishListButton5() {
        navigationBarPage.getAddToWishListButton5().click();
    }


    public void clickOnCamerasButton() {
        navigationBarPage.getCamerasButton().click();
    }

    public void clickOnAddToWishListButton6() {
        navigationBarPage.getAddToWishListButton6().click();
    }


    public void addProductsToWishList(String productName) {
        System.out.println(navigationBarPage.getNavigationBarProducts().stream().map(e -> e.getProductsName().getText()).collect(Collectors.toList()));
        NavigationBarProductsContainer navigationBarProductsContainer = navigationBarPage.getNavigationBarProducts().stream()
                .filter(e -> e.getProductsName().getText().replaceAll("\n", "").trim().equals(productName))
                .findFirst()
                .get();
        navigationBarProductsContainer.getWishListButton().click();

    }
}





