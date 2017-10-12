package xyza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTests {

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("http://www.niittrainercentral.com/UserRegistration.aspx");
driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_rblRegType_0")).click();
driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtTitle']")).sendKeys("Mr");
driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtFirstName']")).sendKeys("mani");
driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtLastName']")).sendKeys("madishetty");
driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_rblGender_0")).click();
driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtDateOfBirth")).sendKeys("01-Jan-2003");
driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtEmail")).sendKeys("madishettymanibushan@gmail.com");
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtMobile']")).sendKeys("abcdefghij");
Thread.sleep(5000);
driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtAddress")).sendKeys("abcdefg");
Thread.sleep(5000);
Select dropDown = new Select (driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_ddlCountry")));
dropDown.selectByVisibleText("India");
Thread.sleep(5000);
Select dropDown1 = new Select (driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_ddlState")));
dropDown1.selectByVisibleText("Andhra Pradesh");
Thread.sleep(5000);
Select dropDown3 = new Select (driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_ddlCity")));
dropDown3.selectByVisibleText("Hyderabad");
driver.findElement(By.id("ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_txtPin")).sendKeys("50002");
Thread.sleep(5000);
Select dropDown4 = new Select (driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_ddlYearofExp']")));
dropDown1.selectByVisibleText("3");
Thread.sleep(5000);
Select dropDown5 = new Select (driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_ddlYearOfTrainingExp']")));
dropDown5.selectByVisibleText("1");
Thread.sleep(5000);
Select dropDown6 = new Select (driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder3_ddlTrainingArea']")));
dropDown6.selectByVisibleText("Insurance");






}

}
