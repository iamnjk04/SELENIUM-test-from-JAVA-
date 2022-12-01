/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangehrm;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author gorkh
 */
public class Login {
  public static void main(String[] args){
      onlylogin log= new onlylogin();
      log.browser();
    WebDriver driver=new ChromeDriver();
    System.setProperty ("webdriver.chrome.driver","C:\\Users\\gorkh\\OneDrive\\Documents\\NetBeansProjects\\Seleniumtest\\chromedriver.exe");
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    String arr[][]={{"Admin","admin"},{"admin","admin123"},{"Admin","admin123"}};
    for(int i=0;i<arr.length;i++)
    {
        WebElement username =driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys("arr[i][0]");
        
        WebElement password =driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        password.sendKeys("arr[i][1]");
    
     driver.findElement(By.xpath("]/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      
    }
    
  }
    
    
}
