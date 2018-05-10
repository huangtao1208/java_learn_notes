package cn.huangt.java_learn_notes.multithread;

/**
 * Runnable接口实现多线程
 * @author huangtao
 */
public class RunnableImpl implements Runnable {

	private String acceptStr;
	
	public RunnableImpl(String acceptStr) {
        this.acceptStr = acceptStr;
    }

    public void run() {
        try {
            // 线程阻塞1秒，此时有异常产生，只能在方法内部消化，无法上抛
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 最终处理结果无法返回
        System.out.println("hello : " + this.acceptStr);
    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableImpl("Runable测试");
        long beginTime = System.currentTimeMillis();
        new Thread(runnable).start();
        long endTime = System.currentTimeMillis();
        
        // endTime 和 beginTime是一样的，线程并不会阻塞主线程
        System.out.println("cast : " + (endTime - beginTime) / 1000 + " second!");
    }
}

/*
输出内容===
cast : 0 second!
hello : Runable测试
*/
