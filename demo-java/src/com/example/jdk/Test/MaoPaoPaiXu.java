package com.example.jdk.Test;
/**
 * 冒泡模板：
 * **随便写出一个数学的例子，然后找规律
 * 1.外层一共要循环的次数为:a = 数组长度  - 1；
 * 2.内层每次循环的次数为:b = a - i；
 * @author Administrator
 *
 */
public class MaoPaoPaiXu {
	public void paiXu() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		int temp = 0;
		// 冒泡排序的外层循环数比数字总个数少一
		for (int i = 0; i < a.length - 1; i++) {
			// 冒泡排序的内层循环数(n = a.length - 1 - i) + i = 总个数减一(即a.length - 1)
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];//此处和下面切记不可以对调，因为下边的并不是空的元素，即此处一定要看清楚谁导完了为空
					a[j + 1] = temp;
				}
			}
		}
		//将每次内层循环的结果输出
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {
		MaoPaoPaiXu maopao = new MaoPaoPaiXu();
		maopao.paiXu();
	}
}
