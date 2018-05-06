package com.test.demo;

import java.io.IOException;
import java.util.Properties;

public class GridProperties {
	private static Properties properties = new Properties();

	static {
		try {
			properties.load(GridProperties.class.getClassLoader()
					.getResourceAsStream("grid.properties"));
		} catch (IOException e) {
			
		}
	}

	public static String getKey(String key) {
		return properties.getProperty(key);
	}

}
