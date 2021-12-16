package com.opencart.steps;

import com.opencart.pages.HeaderPage;
import com.opencart.pages.NavigationBarPage;

public class MainPageBL {

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public NavigationBarPageBL getNavigationBarPageBL() {
        return new NavigationBarPageBL();
    }
}
