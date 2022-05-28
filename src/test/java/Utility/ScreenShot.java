package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	TakesScreenshot tksr = (TakesScreenshot)driver;
	File source = tksr.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\Suraj\\Documents\\ScreenShot\\failedMessage.png");
	FileHandler.copy(source, target);

}
