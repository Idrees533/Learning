package com.interview;

public class ABC {

	


		public void method1 (int num1,float num2) {

		     System.out.println("int-float method");
		}

		public void method1(float num1,int num2){
		     System.out.println("float-int method");
		}

		public static void main(String[] args) {
		ABC abc=new ABC ();
		//abc.method1(40,20);
		
		 try 
	      {     
	         System.out.print("A");       
	         throw new Exception(); 
	      } catch (Exception e) {
	         System.out.print("B");
	      } finally { 
	         System.out.print("C");
	          int num = 7/0; 
	         System.out.print("D");
	      }
	     System.out.print("E");

		
		
		}
		

}
