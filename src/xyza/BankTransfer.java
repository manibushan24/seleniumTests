package xyza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BankTransfer {

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
WebElement obj = driver.findElement(By.id("enterID-input"));
obj.sendKeys("manimadishetty");
WebElement obj2 = driver.findElement(By.name("dummy-passcode"));
obj2.sendKeys("Mlrsvbm105?");
WebElement obj3 = driver.findElement(By.name("enter-online-id-submit"));
obj3.click();
WebElement obj4= driver.findElement(By.xpath(".//*[@id='fsd-li-transfers']/a"));
obj4.click();
WebElement obj5 = driver.findElement(By.xpath(".//*[@id='fsd-li-transfers']/div/div[1]/div[2]/a[1]"));
obj5.click();
Select dropDown = new Select(driver.findElement(By.xpath(".//*[@id='selFromValue']")));
dropDown.selectByVisibleText("BofA Core Checking - 5181 - AvailBal $1,353.85");
WebElement obj6 = driver.findElement(By.xpath(".//*[@id='txtToValue']"));
obj6.click();
WebElement obj7 = driver.findElement(By.xpath(".//*[@id='to-value-field-list']/div[1]/div[2]/span[1]"));
obj7.click();
Thread.sleep(5000);
driver.findElement(By.id("txtAmount")).sendKeys("1.00");
driver.findElement(By.xpath(".//*[@id='btnModalSave']/span[1]")).click();
Thread.sleep(5000);
driver.findElement(By.id("btnDontMakeTransfer")).click();
driver.close();
}

}
