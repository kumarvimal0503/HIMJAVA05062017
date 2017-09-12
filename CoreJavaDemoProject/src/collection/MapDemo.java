package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		List<Map<String,String>> studInfoList = new ArrayList<>();
		
		HashMap<String, String> studInfo = new HashMap<>();
		studInfo.put("name", "Vimal");
		studInfo.put("roll", "120");
		studInfo.put("subject", "Java");
				
		
		
		System.out.println(studInfo.get("name"));
		System.out.println(studInfo.get("roll"));
		System.out.println(studInfo.get("subject"));
		
		studInfoList.add(studInfo);
		
		//----------------------------------------------------------------------
		
		
		
		
		HashMap<String, String> studInfo1 = new HashMap<>();
		studInfo1.put("name", "Himanshu");
		studInfo1.put("roll", "121");
		studInfo1.put("subject", "C++");
		
		studInfoList.add(studInfo1);		
				
		System.out.println("========================================");
		for (Map<String, String> studMap : studInfoList) {
			System.out.println("Name: "+studMap.get("name"));
			System.out.println("Roll: "+studMap.get("roll"));
			System.out.println("Subject: "+studMap.get("subject"));
			System.out.println("========================================");
		}
		
		studInfo1.put("name", "Ajay");
		
		System.out.println(studInfo1.get("name"));
		
		
		//==================================================================================
		
		
		Set<String> keys = studInfo1.keySet();
		
		for (String key : keys) {
			System.out.println(key+": "+studInfo1.get(key));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
