package bj.programmers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
//		String[] str = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
//		String[] str2 = {"PYTHON", "C++", "SQL"};
//		int[] num = {7, 5, 5};
		String[] str = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
		String[] str2 ={"JAVA", "JAVASCRIPT"};
		int[] num = {7,5};
		System.out.println(solution(str, str2, num));

	}

	public static String solution(String[] table, String[] languages, int[] preference) {
		String answer = "Z";
		Map<String, Object>	map			= getDefaultMap();
		Map<String, Integer> scoreMap 	= new HashMap<>();
		Map<String, Integer> resultMap 	= new HashMap<>();
		int tableCount					= table.length;
		int langCount 					= languages.length;

		for (int i = 0; i < langCount; ++i) {
			scoreMap.put(languages[i],preference[i]);
		}

		for (int i = 0; i < tableCount; ++i) {
			String[] arr = table[i].split(" ");
			int arrCount = arr.length;
			String name = arr[0];
			for (int j = 1; j < arrCount; ++j) {
				if (scoreMap.containsKey(arr[j])) {
					resultMap.put(name, resultMap.getOrDefault(name, 0) + (scoreMap.get(arr[j]) * ((Map<String, Integer>)map.get(name)).getOrDefault(arr[j],0)));
				}
			}
		}

		int max = 0;
		for (Map.Entry<String, Integer> entryMap : resultMap.entrySet()) {
			if (max <= entryMap.getValue()) {
				if (max == entryMap.getValue()) {
					if (answer.charAt(0) > entryMap.getKey().charAt(0)){
						max = entryMap.getValue();
						answer = entryMap.getKey();
					}
				}
				else {
					max = entryMap.getValue();
					answer = entryMap.getKey();
				}
			}
		}
		return answer;
	}

	public static Map<String, Object> getDefaultMap() {
		Map<String, Object> total = new HashMap<>();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		Map<String, Integer> map3 = new HashMap<>();
		Map<String, Integer> map4 = new HashMap<>();
		Map<String, Integer> map5 = new HashMap<>();
		map1.put("JAVA"			, 5);
		map1.put("JAVASCRIPT"	, 4);
		map1.put("SQL"			, 3);
		map1.put("PYTHON"		, 2);
		map1.put("C#"			, 1);
		map2.put("JAVASCRIPT"	, 5);
		map2.put("JAVA"			, 4);
		map2.put("PYTHON"		, 3);
		map2.put("SQL"			, 2);
		map2.put("C++"			, 1);
		map3.put("C"			, 5);
		map3.put("C++"			, 4);
		map3.put("PYTHON"		, 3);
		map3.put("JAVA"			, 2);
		map3.put("JAVASCRIPT"	, 1);
		map4.put("JAVA"			, 5);
		map4.put("JAVASCRIPT"	, 4);
		map4.put("PYTHON"		, 3);
		map4.put("KOTLIN"		, 2);
		map4.put("PHP"			, 1);
		map5.put("C++"			, 5);
		map5.put("C#"			, 4);
		map5.put("JAVASCRIPT"	, 3);
		map5.put("C"			, 2);
		map5.put("JAVA"			, 1);
		total.put("SI"			, map1);
		total.put("CONTENTS"	, map2);
		total.put("HARDWARE"	, map3);
		total.put("PORTAL"		, map4);
		total.put("GAME"		, map5);
		return total;
	}

}
 