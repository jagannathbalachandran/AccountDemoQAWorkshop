package util;

import org.apache.commons.io.FileUtils;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ExecutionListener extends RunListener
{


    @Override
    public void testFinished(Description description) throws Exception {
        DriverFactory.getDriver().close();
        System.out.println("Test " + description.getMethodName() + " completed");
    }

    /**
     *  Called when an atomic test fails.
     * */
    public void testFailure(Failure failure) throws java.lang.Exception
    {
        File scrFile = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
        FileUtils.copyFile(scrFile, new File(failure.getDescription().getMethodName() + ".png"));
        System.out.println("Test case failed : "+ failure.getDescription().getMethodName());
    }

}