package com.rashid;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class hacker_ranksubmition_to_java_file {

	
	
	
	static int cnt = 0;

	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
		File file = new File("F:\\New folder\\rashidahmad03_data.json");
		Object obj = new JSONParser().parse(new FileReader(file));
		JSONObject jo = (JSONObject) obj;
		JSONArray jsso = (JSONArray) jo.get("submissions");
		for (Object s : jsso) {
			jsonss(s);
			//System.out.println(s);

		}

	}

	public static void jsonss(Object s) {
		JSONObject jsonObject = (JSONObject) s;
		String name = (String) jsonObject.get("code");
	//System.out.println(name);
		name="package com.rashid.hackersolution;   \n"+name;
	String dataset=	name.replaceAll("Solution", "HackerrankSolution"+cnt);
		//System.out.println(dataset);
		try {
			//FileWriter fw = new FileWriter("D:\\json\\HackerrankSolution" + cnt + ".java");
			cnt++;
			if("HackerrankSolution12".contentEquals(dataset))
System.out.println(dataset);
			//fw.write(dataset);
		//	fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	
	}
}
