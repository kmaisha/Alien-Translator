//Maisha Nabila
//Section: 6753
//February 1st, 2016
//This program translates Alien languages (Beaumondian & Reginaian) to Earth English.

import java.util.Scanner;
public class AlienTranslator {
	/**
	 * This main method creates an AlienTranslator and then calls the
	 * translateInput method. Students should not modify this method.
	 * @param args
	 */
	public static void main(String[] args) {
		AlienTranslator a = new AlienTranslator();
		Scanner s = new Scanner(System.in);
		a.translateInput(s);
	}

	/**
	 * This method gets the necessary input from the user regarding planet 
	 * and the message to be translated. 
	 * Students should fill in the missing code in this method.
	 * @param in A Scanner created on the appropriate stream of input. 
	 */
	public String translateInput(Scanner in) {

		//TODO: Get from user which planet the inter-galactic message is from.
		//1=Beaumonde and 2=Regina
		//Store value in an int variable named planet. If it is not valid, print
		//an error to the user and exit the program. Otherwise (a valid planet)
		//Get the inter-galactic message that needs to be translated.
		//Store it in a String variable named message

		//---- > Fill in Student Code Here < ------
		System.out.println("What planet?");
		int planet = in.nextInt();
		Scanner s = new Scanner(System.in);
		int Beaumonde = 1;
		int Regina = 2;
		
		String translateInput = "";
		String message = "";
		
		
		if(planet==1){
			System.out.println("What message?");
				message = s.nextLine();
		}
		if(planet==2){
			System.out.println("What message?");
				message = s.nextLine();
		
		}
		else if(planet>=3){
			System.out.println("Not a valid planet!");
				System.exit(0);
		}
		
		//---- > End Student Code < -----

		//Teaching staff code - STUDENTS DO NOT MODIFY - extracts characters
		//one at a time from the String message and stores each character in
		//the char variable named charToTranslate

		//The result variable is used to build and store the translated message
		// which will be sent back when this method is finished.
		
		String result = "";
		for (int i=0; i < message.length(); i++) {
			
			char charToTranslate = message.charAt(i);

			//End teaching staff code

			//TODO: translate the character stored in variable charToTranslate
			//and append the translated character to the result variable

			//----- >  Fill in Student Code Here < -----
			
			if(planet==1){
				translateInput = "Beaumondian";
					char elements = charToTranslate;
					if((elements >= 'a' && elements <= 'z') || (elements >= 'A' && elements <= 'Z')){
					charToTranslate -=2;
						if(elements=='a'){
							charToTranslate = 'y';
							}
						if(elements=='b'){
							charToTranslate = 'z';
							}
						if(elements=='A'){
							charToTranslate = 'Y';
							}
						if(elements=='B'){
							charToTranslate = 'Z';
							}
					}	
			}
			else if(planet==2){
				translateInput = "Reginaian";
					char elements = charToTranslate;
					if((elements >= 'a' && elements <= 'z') || (elements >= 'A' && elements <= 'Z')){
					charToTranslate +=2;
						if(elements=='y'){
							charToTranslate = 'a';
							}
						if(elements=='z'){
							charToTranslate = 'b';
							}
						if(elements=='Y'){
							charToTranslate = 'A';
							}
						if(elements=='Z'){
							charToTranslate = 'B';
							}
					}	
			}
			
			result += charToTranslate;
			//----- >  End Student Code < -----



		} //ends the for loop


//TODO: perform the necessary output as specified in the requirements
// **** This TODO was added to this starter code on Mon 1/25 2:55pm ****
//------> Fill in Student Code < -------
		
		System.out.println("Original message in " + translateInput + ": " + message);
		System.out.println("Translation in Earth English: " + result);
		
		s.close();
//------> End Student Code < -------

		//Sends back the value of the result variable 
		
		return result;

	} //ends the translateInput method

} //ends the AlienTranslator class




