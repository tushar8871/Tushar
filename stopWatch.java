package game;

import java.util.Scanner;

public class stopWatch {
	
	long start()
	{
		long startTime=System.currentTimeMillis();
		return startTime;
	}
	
	long stop()
	{
		long stopTime=System.currentTimeMillis();
		return stopTime;
	}
	


	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		stopWatch sw=new stopWatch();
		int n;
		
		System.out.println("\n Stop Watch ! ");
		
		System.out.println("Enter any key to start time : ");
		n=sc.nextInt();
		long startTime=sw.start();
		
		System.out.println("Enter any key to stop : ");
		n=sc.nextInt();
		long stopTime=sw.stop();
		
		long etime=stopTime-startTime;	
		
		System.out.println("\n Elapsed Time in milli second is  : "+etime);


		System.out.println("\n Elapsed Time in second is  : "+etime/1000);


		System.out.println("\n Elapsed Time in minute is  : "+etime/6000);

	}

}
