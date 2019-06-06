package com.hero;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class filssdsd {

	static int cnt = 0;

	public static void main(String[] args) throws IOException, ParseException {
		File file = new File("D:\\download data\\rashidahmad03_data.json");
		Object obj = new JSONParser().parse(new FileReader(file));
		JSONObject jo = (JSONObject) obj;
		JSONArray jsso = (JSONArray) jo.get("submissions");
		for (Object s : jsso) {
			jsonss(s);
			scoare(s);
		}
		// System.out.println(jsso);
	}

	public static void jsonss(Object s) {
		JSONObject jsonObject = (JSONObject) s;
		String name = (String) jsonObject.get("code");

		try {
			FileWriter fw = new FileWriter("D:\\jsonfile\\hrllos+" + cnt + ".java");
			cnt++;
			fw.write(name);
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}

	public static void scoare(Object ss) {
		JSONObject jsonObject = (JSONObject) ss;
		double name = (double) jsonObject.get("score");

		System.out.println(name);
	}

}
