package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	FileInputStream fileinput ;
	public String getProperty (String Key)   {
		String userDir = System.getProperty("user.dir");
		String fileseparator = System.getProperty("file.separator");
		
		String filepath = userDir+fileseparator+"properties"+fileseparator+"application.properties";
		System.out.println(filepath);
		
		try {
			fileinput = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties ();
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = prop.getProperty(Key);
		return value;
		
		
	}

}
