
public class MonkeyTrouble {

	public static void main(String[] args) {
		/*
		 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
		 * if each is smiling. We are in trouble if they are both smiling or if neither
		 * of them is smiling. Return true if we are in trouble.
		 */

		/*
		 * monkeyTrouble(true, true) → true monkeyTrouble(false, false) → true
		 * monkeyTrouble(true, false) → false
		 */

		boolean areWeInTrouble = monkeyTrouble(true, true);
		System.out.println(areWeInTrouble); // expect true
		areWeInTrouble = monkeyTrouble(true, false);
		System.out.println(areWeInTrouble);
		areWeInTrouble = monkeyTrouble(false, false);
		System.out.println(areWeInTrouble);
		areWeInTrouble = monkeyTrouble(false, true);
		System.out.println(areWeInTrouble);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		if (aSmile == true && bSmile == true) {  // could be one long line if we want
			return (true);
		}
		if (aSmile == false && bSmile == false) {
			return(true);
		}

		return (false);
		
		
		
		
		
		
		
	}

	
	
	
}