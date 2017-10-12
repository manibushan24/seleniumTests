package xyza;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample { 

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Ftag%3Dhymsabk-20%26hvadid%3D3480083188%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26ref%3Dnav_custrec_signin");
driver.findElement(By.name("email")).sendKeys("chintu.bushan@gmail.com");
driver.findElement(By.name("password")).sendKeys("Mlrsvbm105?");
driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
Thread.sleep(10000);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Calvin klein Men shoes");
driver.findElement(By.className("nav-input")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id='result_1']/div/div[3]/div[1]/a/h2")).click();
Thread.sleep(5000);
Select dropDown = new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
dropDown.selectByVisibleText("8 D(M) US");
Thread.sleep(10000);
driver.findElement(By.id("add-to-cart-button")).click();
Thread.sleep(10000);
driver.findElement(By.id("hlb-ptc-btn-native")).click();
Thread.sleep(10000);
driver.findElement(By.xpath(".//*[@id='address-book-entry-0']/div[2]/span/a")).click();
Thread.sleep(10000);
driver.findElement(By.xpath(".//*[@id='order_0_ShippingSpeed_sss-us']")).click();
Thread.sleep(10000);
driver.findElement(By.className("a-button-text")).click();
Thread.sleep(5000);
driver.close();
}



}
