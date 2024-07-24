package Runnerclass;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.base;

import filereader.filereadermanager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\RAJA\\work\\amazondiva\\src\\test\\java\\featurefile\\featureFile.feature", 
glue = "stepdefinition")

public class classrunner extends base {
	
	
	
@BeforeClass

public static void login () throws Exception {
	
	
	browserlaunch(filereadermanager.FileReaderr().getbrowser());
}
	
	
	
//@AfterClass
//
//public static void close () {
//	
//	close();
//	
//	
//}
//	
//	
	
	
}
