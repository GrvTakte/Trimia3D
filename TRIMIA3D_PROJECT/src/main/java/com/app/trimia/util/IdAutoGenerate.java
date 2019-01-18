package com.app.trimia.util;

<<<<<<< HEAD
public class IdAutoGenerate {
	
	public static String generateId(String idName) {
		String id = idName;
		String suffix = id.substring(2, id.length());
		String prefix = id.substring(0,2);
		int id1 = Integer.parseInt(suffix);
		id1++;
		String generatedId = prefix+id1;
		System.out.println("Generated ID: "+generatedId);
		return generatedId;	
	}
	
}
=======
<<<<<<< HEAD
public class IdAutoGenerate
{
	
	public static String generateId(String idName) 
	{
		String id = idName;
		String suffix = id.substring(2, id.length());
		String prefix = id.substring(0,2);
		int id1 = Integer.parseInt(suffix);
		id1++;
		String generatedId = prefix+id1;
		return generatedId;	
	}
	
}
=======

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
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
>>>>>>> branch 'master' of https://github.com/GrvTakte/Trimia3D
