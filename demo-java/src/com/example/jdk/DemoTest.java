package com.example.jdk;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoTest {
	private static Map<String, Integer> result = new HashMap<String, Integer>();
	private static Integer MAXNUM = null;
	private static String world[] = null;
	private static Integer num[] = null;

	public static void main(String arg[]) {
		// 读取文本，统计单词数量
		DemoTest.getWords();
		// 冒泡排序
		DemoTest.maoPaoPaiXu();
		// 控制台展示
		DemoTest.getInfo();
	}

	private static void getWords() {
		File f = new File("C:/Users/dw/Desktop/text.txt");
		String s = "";
		StringBuffer sb = new StringBuffer();
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			while ((s = br.readLine()) != null) {
				sb.append(s + '\n');
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Pattern p = Pattern.compile("\\b[a-zA-Z]+\\b");
		Matcher m = p.matcher(sb.toString());
		while (m.find()) {
			if (result.containsKey(m.group())) {
				result.put(m.group(), result.get(m.group()) + 1);
			} else {
				result.put(m.group(), 1);
			}
		}
	}

	private static void maoPaoPaiXu() {
		MAXNUM = DemoTest.result.size();
		world = new String[MAXNUM + 1];
		num = new Integer[MAXNUM + 1];

		for (int runNum = 0; runNum < MAXNUM; runNum++) {
			int account = 1;
			for (Map.Entry<String, Integer> it : DemoTest.result.entrySet()) {
				if (account == 1) {
					world[runNum] = it.getKey();
					num[runNum] = it.getValue();
					account = 2;
				}

				if (num[runNum] < it.getValue()) {
					world[runNum] = it.getKey();
					num[runNum] = it.getValue();
				}
//				System.out.println("英文单词: " + it.getKey() + " 该英文单词出现次数: " + it.getValue());
			}
			DemoTest.result.remove(world[runNum]);
		}
	}

	private static void getInfo() {
		System.out.println("ランキング		単語		出現回数" + "\r\n");
		int count = 1;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < MAXNUM; i++) {
			if (null == world[i])
				continue;
			if ("".equals(world[i]))
				continue;
//			sb.append((count) + "		" + world[i] + "		" + num[i] + "\r\n");
			System.out.println((count) + "		" + world[i] + "		" + num[i] + "\r\n");
			count++;
		}
	}
}
