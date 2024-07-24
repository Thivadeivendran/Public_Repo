package filereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class filereader {

	Properties s;
	
	public filereader() throws IOException {

		File f = new File("C:\\Users\\RAJA\\work\\amazondiva\\probertyfile");

		FileInputStream g = new FileInputStream(f);

		s = new Properties();

		s.load(g);

	
		
	}


 public String getbrowser() {
	 
	 String gb = s.getProperty("broswer");
	 
	 return gb;
 }

 
 public String geturl() {
	 
	 String gb = s.getProperty("url");
	 
	 return gb;
 }



}




