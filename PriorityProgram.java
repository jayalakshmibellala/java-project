package xyz;

public class PriorityProgram {
	public static void main(String[] args ) {
		Thread lowPriorityThread=new Thread(()->{;
		for(int i=1;i<=5;i++) {
			System.out.println("low Priority Thread"+i);
		}
		});
           Thread highpriorityThread=new Thread(()->{
	       for(int i=1;i<=5;i++) {
		System.out.println("High priority Thread "+i);
	}
	});
       
           lowPriorityThread.setPriority(Thread.MIN_PRIORITY);    
           highpriorityThread.setPriority(Thread.MAX_PRIORITY);
           lowPriorityThread.start();
           highpriorityThread.start();
}
}