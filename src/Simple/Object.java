package Simple;
/*
public class Object {
		void method() {
			 System.out.println("call the method");
		}
		public static void main(String[] args) {
			Object sc= new Object();
			sc.method();
		}
}
*/


	class Prent {
		void p() {
			System.out.println("Super class program call");
		}
	}
	class Object extends Prent{
		void c() {
			System.out.println("child class program will call");
		}
		public static void main(String[] args) {
			//Object sc= new Object();
			//sc.c();
			//sc.p();
			
			//Prent sd = new Prent();
			//sd.p();
			//sd.c();        //Error
			
			Object b= new Object();
			Prent sf=(Object) ;
			sf
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
