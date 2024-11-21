package com.shoppersstack_Generic_Utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.shopperstack_POM.Home_page;
import com.shopperstack_POM.Login_page;
import com.shopperstack_POM.Welcome_page;

public class Base_Test {

	public File_Utility fileUtility = new File_Utility();
	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Welcome_page Welcomepage;
	public Login_page loginPage;
	public Home_page homePage;
	public Java_Utility javaUtility = new Java_Utility();
	public WebDriverWait wait;
	public WebDriver_Utility webDriverUtility = new WebDriver_Utility();

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("@BeforeSuite");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");

		spark = new ExtentSparkReporter(FrameworkConstants.extentReportsPath + javaUtility.dateAndTime() + ".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
	}

	@BeforeClass
	public void beforelass() throws IOException {
		System.out.println("@BeforeClass");

		String browser = fileUtility.readPropertyFile("browserName");//no passing data use this two line
		String url = fileUtility.readPropertyFile("url");
		
	//	String url = System.getProperty("url");     // this is use to passing data
	//   String browser = System.getProperty("browserName");	

		if (browser.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.contains("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.contains("edge")) {

			driver = new EdgeDriver();
		} else {
			System.out.println("Enter valid Browser Name");
		}
		sDriver = driver;
		homePage = new Home_page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get(url);
		
	}

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("@BeforeMethod");
		String userName = fileUtility.readPropertyFile("username");
		String password = fileUtility.readPropertyFile("password");

		Welcomepage = new Welcome_page(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(Welcomepage.getLoginBtn()));
		Thread.sleep(3000);
		Welcomepage.getLoginBtn().click();

		loginPage = new Login_page(driver);
		loginPage.getEmailTextfield().sendKeys(userName);
		loginPage.getPasswordTextfield().sendKeys(password);
		loginPage.getLoginBtn().click();
	}

	@AfterMethod
	public void afterMathod() {
		System.out.println("@AfterMethod");
		homePage.getSettingbtn().click();
		homePage.getLogoutbtn().click();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
		
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		System.out.println("@Aftertest");
		reports.flush();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}
}
