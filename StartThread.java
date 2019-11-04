package thread;
/**
 * 创建线程方式一：
 * 1，继承Thread,重run方法。
 * 2，创建子类对象+start。
 * 创建线程方式二：
 * 1，实现Runnable接口，重写run方法。
 * 2，创建实现类对象+Thread对象.start方法。
 * 
 * 推荐：避免单继承的局限性，优先使用接口
 * @author dell
 *
 */

public class StartThread extends Thread {
	/**
	 * 线程入口点
	 */
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("一边听歌");
		}
	}
	
	
	public static void main(String[] args) {
		//创建子类对象
		StartThread st=new StartThread();
		//启动
		//st.start();//不保证立即执行，由cpu调用安排时间片故每次执行过程不一定相同
		//st.run()  只是普通方法调用，不会产生多线程
		StartThread2 st2=new StartThread2();
		new Thread(st2).start();
		for(int i=0;i<20;i++) {
			System.out.println("一边coding");
		}
		
		
		
	}
}

class StartThread2 implements Runnable{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("一边听歌");
		}
	}
}
