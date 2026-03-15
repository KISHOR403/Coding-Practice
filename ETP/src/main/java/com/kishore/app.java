package com.kishore;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import java.net.URL;

public class app {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Android Emulator")
                .setPlatformName("Android")
                .setApp("C:\\Users\\Victus\\Downloads\\calculator.apk");



        AppiumDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/"), options);

        driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_7")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();

        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
        System.out.println("Result = " + result);

        driver.quit();
    }
}
