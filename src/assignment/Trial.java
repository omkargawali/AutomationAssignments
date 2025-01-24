package assignment;

public class Trial {
	
	public static void main(String [] args) {
		
//		String [] name = {"o","m","k","a","r"};
//		
//		for(int i=name.length-1; i>=0; i--) {
//			
//			System.out.print(name[i]); 
//		}
		
		//-----------------------------------------
		
		int n = 5;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=n; j>i; j--) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++ ) {
			
				System.out.println(j+ " ");
			}
			System.out.println(" ");
		}
		
		
	} 

}
