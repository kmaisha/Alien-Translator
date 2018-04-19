# Alien-Translator
Project 1
COP 3502
Spring 2016

Alien Translation
Scientists in a secret lab on Earth have intercepted alien communication between two planets. Evidence suggests that the aliens are involved in some kind of intergalactic argument. The scientists have asked for your help to write a program that decodes the messages automatically so that they can keep up with this war-of-words in space as it unfolds. 
The scientists have discovered that aliens on the planet Beaumonde seem to be wealthy and privileged, and their intergalactic messages tend to insult aliens on the planet Regina which is primarily populated by miners. Actually, doctors on Beaumonde have been researching cures for a disease that plagues residents of Regina, but because of their intergalactic feud, nobody has realized this important connection. If Earth scientists can decode the conversation quickly enough and contribute to it, the entire population of the planet Regina, from its youngest to its oldest residents, could be spared great suffering. 
To date, Earth scientists have figured out that Beaumonde and Regina, while they have different planetary native languages, utilize a shared inter-galactic form of communication. In a very unlikely turn of events that probably involves settlers using a wormhole bridge thousands of years ago, this inter-galactic language has the same number of letters as Earth English, and shares exactly the same 0-9 decimal number system. All of their punctuation is exactly the same too. 
While Beaumonde and Regina are "speaking the same language" in a way, they encode their messages differently. Here is what Earth scientists have figured out:
On Beaumonde, messages are encoded in a way that is two letters "farther" down the alphabet than their letter in English. In other words, a Beaumonde 'c' is Earth English 'a'. The encoding "wraps around" the alphabet, so a Beaumonde 'a' is Earth English 'y'. Capitals and lowercase follow this same pattern. For example, uppercase 'G' from Beaumonde is an 'E' in Earth English. Digits, punctuation, and any other characters do not get shifted for Beaumonde messages.
On Regina, messages translate the opposite direction: a letter in Reginian is two letters "earlier" in the alphabet than its letter in English. For example, the letter 'b' is Earth English 'd' and the letter 'Y' is Earth English 'A'. Digits, punctuation, and any other characters do not get shifted for Regina messages.
Requirements:

Create the necessary file, AlienTranslator.java. Copy and paste the starter code provided at the end of this project description into your AlienTranslator.java file. Complete the file AlienTranslator.java so that it functions as follows. Places that you need to fill in code are marked with a comment beginning in //TODO:
Your program must prompt the user "What planet?" and read in a digit. 1=Beaumonde and 2=Regina. Any other digit should result in the error message, "Not a valid planet." and then the program should quit executing.
After getting a valid planet your program must prompt the user, "What message?" and then read in a string.
Your program must then print out the original message followed by its translation in Earth English.

Here is sample output from executing the completed program. YOUR PROGRAM’S OUTPUT MUST BE IDENTICAL TO THIS OUTPUT DOWN TO EVERY WHITE SPACE AND PUNCTUATION MARK, IN ORDER TO RECEIVE FULL CREDIT. 
Example A:
What planet?
1
What message?
Aqw cnkgpu ctg uewo.
Original message in Beaumondian: Aqw cnkgpu ctg uewo.
Translation in Earth English: You aliens are scum.

Example B:
What planet?
3
Not a valid planet.

Example C:
What planet?
2
What message?
G'jj egtc wms 42 kglsrcq rm pcqnmlb, mp gr'q yjj-msr uyp.
Original message in Reginian: G'jj egtc wms 42 kglsrcq rm pcqnmlb, mp gr'q yjj-msr uyp.
Translation in Earth English: I'll give you 42 minutes to respond, or it's all-out war.

Example D: (Runtime error)
What planet?
a
Exception in thread "main" java.util.InputMismatchException

The teaching staff will run many tests on your program to ensure that it works for all cases as described in the requirements. You should test your program on many combinations of input and you should try fringe cases to make sure the program works under those. 

Here are the contents of AlienTranslator.java, which you may copy-and-paste into your eclipse project. 
import java.util.Scanner;

/**
 * This class translates messages from aliens on planets
 * Beaumonde and Regina into Earth English. 
 * @author Kristy Boyer
 *
 */
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






			//----- >  End Student Code < -----



		} //ends the for loop


//TODO: perform the necessary output as specified in the requirements
// **** This TODO was added to this starter code on Mon 1/25 2:55pm ****
//------> Fill in Student Code < -------


//------> End Student Code < -------

		//Sends back the value of the result variable 
		return result;

	} //ends the translateInput method

} //ends the AlienTranslator class

