/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangehrm;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author gorkh
 */
public class onlylogin {
     public  WebDriver driver=new ChromeDriver();
    public void browser(){
  
    System.setProperty ("webdriver.chrome.driver","C:\\Users\\gorkh\\OneDrive\\Documents\\NetBeansProjects\\Seleniumtest\\chromedriver.exe");
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    credentials();
    Pim pim= new Pim();
        pim.addpim();
    Menu menu=new Menu();
    menu.choose();
    
    
    }
 
    
    public void credentials(){
        
      driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("arr[i][0]");
        
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("arr[i][1]");
    
     driver.findElement(By.xpath("]/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      
 
    }
}
