package School;

public class ConstantData {
	/*
	 * * 1) Constant Data class; 
	 *  * there should be some data about school, like name, web address, phone number, address etc 
	 *  * Information could not be changeable
	 *  
	 *  Singleton class : In object-oriented programming, a singleton class is a class
	 * that can have only one object (an instance of the class) at a time.
	 *  No one reach that class by creating object 
	 */
	
	static final String NAME="Techproed";
	static final String WEB_ADDRESS= "https://www.techproeducation.com";
	static final String PHONE_NUMBER = "5551234567" ;
	static final String ADDRESS = "571 New York Ave, Lyndhurst, NJ 07071 USA";
	
	
	private ConstantData() {
		
	}
	
}