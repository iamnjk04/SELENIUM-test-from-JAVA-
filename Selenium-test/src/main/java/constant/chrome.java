/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constant;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author gorkh
 */
public class chrome {
    public static final WebDriver driver=new ChromeDriver();
    public static final WebDriverWait wait=new WebDriverWait(chrome.driver, Duration.ofSeconds(100));
}
