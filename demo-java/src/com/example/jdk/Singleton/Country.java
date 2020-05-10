package com.example.jdk.Singleton;
public class Country {
	public static void main(String[] args) {
//		ChairMan c = new ChairMan();//由于构造函数被私有化了，所以无法实例化，因此此句将报错
		
		//由于构造函数被私有化了，所以无法实例化，因此通过类调用静态函数来输出
		ChairMan haiYang = ChairMan.getChairMan();//静态的方法可以直接被类调用,通过静态方法里面的if语句来创建对象
		ChairMan wuDan = ChairMan.getChairMan();
		
		haiYang.name = "海阳";
		ChairMan.getChairMan().name = "吴丹";//由于静态对象共用一份拷贝，所以输出的结果为后面
		
		System.out.println(haiYang.name);//输出语句
		System.out.println(wuDan.name);
	}
}
