package xyza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddingCourse {

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
driver.findElement(By.id("Email")).sendKeys("madishettymanibushan@gmail.com");
driver.findElement(By.name("signIn")).click();
Thread.sleep(5000);
driver.findElement(By.name("Passwd")).sendKeys("Madishetty12");
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id='signIn']")).click();
Thread.sleep(10000);
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id=':hf']/div/div")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[@id=':o6']")).sendKeys("mani.bhushan666@gmail.com");
driver.findElement(By.xpath(".//*[@id=':nb']")).sendKeys("hi");
driver.findElement(By.xpath(".//*[@id=':oq']")).click();

}
}
