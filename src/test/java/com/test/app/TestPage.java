package com.test.app;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;

import com.app.pages.HomePage;

public class TestPage {

HomePage homePage;
BasePage bp;

int rand = new Random().nextInt(5000000);
String email = "priya" + rand + "@gmail.com";

public TestPage() {
	homePage = new HomePage();
	bp = new BasePage();
}

@Test
public void verifyTabs() {
	Assert.assertTrue(homePage.elementFound(homePage.women()));
	Assert.assertTrue(homePage.elementFound(homePage.dress()));
	Assert.assertTrue(homePage.elementFound(homePage.tshirt()));
}
}