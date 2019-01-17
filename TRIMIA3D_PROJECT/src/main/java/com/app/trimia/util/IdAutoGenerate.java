package com.app.trimia.util;


public class IdAutoGenerate {
	
	public static String generateId(String idName) {
		String id = idName;
		String suffix = id.substring(2, id.length());
		String prefix = id.substring(0,2);
		int id1 = Integer.parseInt(suffix);
		id1++;
		String generatedId = prefix+id1;
		return generatedId;	
	}
	
}
