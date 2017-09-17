package muhrtitading;

class ThreadJoinDemo extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){System.out.println(e);}
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
	
	
	public static void main(String args[]){
		ThreadJoinDemo t1=new ThreadJoinDemo();
		ThreadJoinDemo t2=new ThreadJoinDemo();
		ThreadJoinDemo t3=new ThreadJoinDemo();
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t2.start();
		try{
			t2.join();
		}catch(Exception e){System.out.println(e);}
		

		t1.start();
		try{
			t1.join();
		}catch(Exception e){System.out.println(e);}

		t3.start();	
		

		
	}
}
