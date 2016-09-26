import java.util.Scanner;


public class lab_03a {

	/**
	 * @param args
	 */
	
	private Scanner in;
	
	public static void main(String[] args) {
        
		new lab_03a();
		
	}
	
	public lab_03a() {
		
		System.out.println("Upto");
		
		this.in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		in.nextLine();
		
		int i = 0;

		while ( i < n) {
			
			System.out.print(this.Fib(i));
			
			if ( i != n-1)
				System.out.print(", ");
			
			i++;
		}
		
		
		
		in.close();
	}
	
	
	private int Fib(int n) {
		
		if (n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return Fib (n-1) + Fib (n-2);
		
	}
	
	

}
