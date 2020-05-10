package com.example.jdk.Test;
import java.text.DecimalFormat;

/**
 * 
 * @ClassName: formatTosepara
 * @Description: java代码实现会计数字格式
 * @author suyuyuan
 * @date 2016年10月12日 下午12:48:47
 * 
 */
public class FormatTosepara {
	public static String formatString(double data) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return df.format(data);
	}

	public static void main(String[] args) {
		System.out.println(FormatTosepara.formatString(113231131231.00));
	}
}