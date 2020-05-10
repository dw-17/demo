package com.example.jdk.Test;
public class QiPaoXunHuan {
	public int[] arr ={8,9,25,7,1,5,7,11,5,4,1,7,1,1,4,11,5,20,47,52,1,3};
	
	public void paiXu() {
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("数组元素从小到大依次为：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		QiPaoXunHuan qiPao = new QiPaoXunHuan();
		qiPao.paiXu();
	}
}
