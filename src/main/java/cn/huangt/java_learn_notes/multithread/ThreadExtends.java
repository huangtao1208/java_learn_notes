package cn.huangt.java_learn_notes.multithread;

/**
 * 继承Thread实现多线程
 * @author huangtao
 */
public class ThreadExtends {
	public static void main(String[] args) {
		new MyThread("Thread测试").start();
		new MyThread("Thread测试").start();
	}
}

class MyThread extends Thread{
	
	private String acceptStr;
	
	public MyThread(String acceptStr) {
		this.acceptStr = acceptStr;
	}
	
	public void run() {
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("这个传给我的值："+acceptStr+",加上一个变量，看看是什么效果："+i);
		}
	}
}

/*
输出内容===
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：0
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：0
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：1
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：2
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：3
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：4
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：1
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：2
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：3
这个传给我的值：Thread测试,加上一个变量，看看是什么效果：4
*/