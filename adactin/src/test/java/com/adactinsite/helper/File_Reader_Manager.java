package com.adactinsite.helper;

public class File_Reader_Manager{
	private File_Reader_Manager() {
		
	}
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager helper=new File_Reader_Manager();
		return helper;
	}
	
	public Configuration getInstanceCR() throws Throwable{
		Configuration reader=new Configuration();
		return reader;
		
	}

}
