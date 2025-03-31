package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFilePractice {
	
	public static void main(String[] args) throws Exception {
	PropertiesUtility pUtil=new PropertiesUtility();
	String Url= pUtil.getDataFromPropertiesFile("url");
	WebDriver driver=new ChromeDriver();
	driver.get(Url);
	Thread.sleep(2000);
	
	}}
