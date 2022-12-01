/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangehrm;

import constant.chrome;
import org.openqa.selenium.By;

/**
 *
 * @author gorkh
 */
public class Menu {
    
    public void choose(){
    chrome.driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")).click();
    chrome.driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();
    
    
    }
    
}
