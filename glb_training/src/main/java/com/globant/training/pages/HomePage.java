package com.globant.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(id = "searchInput")
	private WebElement searchInput;
	
	@FindBy(id = "searchLanguage")
	private WebElement searchLanguage;
	
	@FindBy(xpath = "//*[@id='www-wikipedia-org']/div[2]/form/fieldset/input[3]")
	private WebElement submitbutton;
	
	
	public void search(String query, String Language)
	{
		searchInput.sendKeys(query);
		searchLanguage.sendKeys(Language);
		submitbutton.click();
		
	}
	
}
