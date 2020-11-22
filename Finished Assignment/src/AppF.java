
public class AppF {

	public static void main(String[] args) {
		int penPrice = 5;
		int applePrice = 2;
		   
		
		double  Bank = 45.10;  //money in variable 
		double  Wallet = 30.25;	
	
		int friendsA = 10;  //Friends in High-school 	
		int friendsB = 15; //Friends in College
	
		int ageA = 23;
		int ageB = 30;
	
		String firstNameA = "Fernando";
		String firstNameB = "Billy";
	
		String lastNameA = "Bustillos";
		String lastNameB = "Bob";
	
		String middleInitialA = " "; // no middle initial
		String middleInitialB = "Jam"; 
		
		//Concatenations of firsNamesA&B, middleInitialA&B, and latsNameA&B
		String fullNameA = firstNameA + middleInitialA  + lastNameA; 
		String fullNameB = firstNameB +" "+ middleInitialB + " "+lastNameB; 
	
		
		double changeInWallet =Bank - penPrice; 
		System.out.println("Money left after purchasing Pen with Wallet  $" + changeInWallet); // Money left in wallet
		System.out.println("Full name of imaginary friend  " + fullNameB); 	                   //Full name
	
		double friendsPerYear = ageA / friendsA;
		System.out.println("Friends made per year " +friendsPerYear);   // Friends / Age

	}
}
