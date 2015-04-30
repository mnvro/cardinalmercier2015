package tp13_les_threads_et_les_sockets;

public class Thread2 extends Thread {
	
	public void run(){
		System.out.println("Le Thread 2 est exécuté");
		for (int i = 0 ; i<10 ; i++){
			System.out.println("Dans le Thread 2, i = "+i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.run();
		Thread t2 = new Thread2();
		t2.run();
		
		
		t1 = new Thread1();
		t1.start();
		t2 = new Thread2();
		t2.start();
	}
}

