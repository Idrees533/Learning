package com.learn.java.tricky;

public class JavaTricky1 {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		
	//	System.out.println(a++ + ++b);
		
	//instanceOf is used to check whether specified Object is instance Of the class
		 String str = null;
		  if (str instanceof String) {
		   System.out.println("True");
		  } else {
		   System.out.println("False");
		  }
	//System.out.println(a+=(a=5)*(a/5)); 
		
	int i=0;
	int j=i++ + ++i;
	
//	System.out.println("J = "+j);
	a^=b ^=a ^=b;
		//System.out.println(a +"-" +b ) ;
		
	//	System.out.println(10+20+"30"+40+50);
		
		
		Integer a1=126;
		Integer b1=126;
		System.out.println(a1==b1);
		
		int x = 2;
		  int y = 0;
		 for(;y<10;++y) {
			 if(y%x==0)
				 continue;
			 
				 System.out.print(y+" ");
		 }
System.out.println("----------------------------");		 
		int d=5;
		int f=10;
	//assign the value right to left variable	
		if((d=3)==f) {
			System.out.println(d);
		}
		else {
			System.out.println(d+f);
		}
System.out.println("-------------");		 
	int p=5;
	System.out.println(p++==++p);
		 
		 //
	System.out.println("--------------------");
	
	int arr[]= {1,2,3,4,5};
	
	int sum=0;
	
	for(int k=0;k<arr.length;k++) {
		sum+=(arr[k]%2==0)?arr[k]:0;
	}
	
	System.out.println(sum);
		 
	System.out.println("=============");
		 int g=10;
		 int h=20;
		 int k= g +=h -=g +=h;
		// int k2= 10 +=20 -=10 +=20;
		 System.out.println(k);
		System.out.println("-------------------"); 
		 int[] nums = { 1, 2, 3, 4, 5 };
		  for (int num : nums) {
		   if (num % 2 == 0) {
		    break;
		   }
		   System.out.print(num + " ");
		  } 
		 
		 
		 
		 
		 
		  
	}

}
