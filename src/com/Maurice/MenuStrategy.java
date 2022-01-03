package com.Maurice;

import java.util.HashMap;

public interface MenuStrategy {
    UserAccountType getAccountType();
    HashMap<String, String> getAccountMolderInformation();
    String[] getAccountMenuOptions();
    void nextMenuOption();
    void previousMenuOption();
}
