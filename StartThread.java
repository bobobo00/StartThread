package thread;
/**
 * �����̷߳�ʽһ��
 * 1���̳�Thread,��run������
 * 2�������������+start��
 * �����̷߳�ʽ����
 * 1��ʵ��Runnable�ӿڣ���дrun������
 * 2������ʵ�������+Thread����.start������
 * 
 * �Ƽ������ⵥ�̳еľ����ԣ�����ʹ�ýӿ�
 * @author dell
 *
 */

public class StartThread extends Thread {
	/**
	 * �߳���ڵ�
	 */
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("һ������");
		}
	}
	
	
	public static void main(String[] args) {
		//�����������
		StartThread st=new StartThread();
		//����
		//st.start();//����֤����ִ�У���cpu���ð���ʱ��Ƭ��ÿ��ִ�й��̲�һ����ͬ
		//st.run()  ֻ����ͨ�������ã�����������߳�
		StartThread2 st2=new StartThread2();
		new Thread(st2).start();
		for(int i=0;i<20;i++) {
			System.out.println("һ��coding");
		}
		
		
		
	}
}

class StartThread2 implements Runnable{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println("һ������");
		}
	}
}
