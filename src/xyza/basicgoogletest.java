package xyza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicgoogletest {

public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("a");

	}

}
