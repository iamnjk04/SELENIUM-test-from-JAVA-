/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangehrm;

import org.openqa.selenium.By;
import constant.chrome;
import org.openqa.selenium.support.ui.ExpectedConditions;
/**
 *
 * @author gorkh
 */
public class Pim {
   
    public void addpim(){
        chrome.driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
        chrome.driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("aujan");
        
    }
}

 