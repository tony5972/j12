class share
  {
  	public synchronized  void avg(String msg,int n)
  	  {
  	  	  System.out.println("The sum of 20 numbers of "+msg+" is :"+n);   
  	  	  System.out.println("The average of 20 numbers of "+msg+" is :"+(float)n/20);
  	  }
  }	  
class mythread extends Thread
  {
  	String msg;
  	int n,i;
  	share s;
  	mythread(share s,String msg,int n)
  	 {
  	   super(msg);
  	   this.s=s;
  	   this.msg=msg;
  	   this.n=n;
  	   start();
  	 } 
  	public void run()
  	 {
  	    s.avg(msg,n);        
     }
  }	   
class prg
  {
   public static void main(String args[])
  	  {
  	  	//prg2 p=new prg2();
  	  	int i,j,sum;
  	  	int a[]=new int[100];
  	  	Thread t;
  	  	share s=new share();
  	  	for(i=sum=0;i<20;i++)
  	  	  {
  	  	  	a[i]=i+1;
  	  	  	sum=sum+a[i];
  	  	  }	
  	  	mythread m1=new mythread(s,"First thread",sum);
  	  	
  	  	for(j=i,sum=0;j<=40;j++)
  	  	  {
  	  	  	a[j]=j;
  	  	  	sum=sum+a[j];
  	  	  }   
  	  	mythread m2=new mythread(s,"Second thread",sum);
  	  	
  	  	for(i=j-1,sum=0;i<=60;i++)
  	  	  {
  	  	  	a[i]=i;
  	  	  	sum=sum+a[i];
  	  	  }	
  	    mythread m3=new mythread(s," Third thread",sum);
  	  	
  	  	for(j=i-1,sum=0;j<=80;j++)
  	  	  {
  	  	  	a[j]=j;
  	  	  	sum=sum+a[j];
  	  	  }	
  	  	mythread m4=new mythread(s,"Fourth thread",sum);
  	  
  	  	for(i=j-1,sum=0;i<100;i++)
  	  	  {
  	  	  	a[i]=i+1;
  	  	  	sum=sum+a[i];
  	  	  }	
  	  	mythread m5=new mythread(s,"Fifth thread",sum);
  	  
  	  }
  }	
