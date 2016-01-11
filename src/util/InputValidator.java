package util;

public class InputValidator {

	public static boolean isValidNumberOfPlayers(String s){
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e){
			return false;
		}
		if (i<2 || i > 6) return false;
		return true;
	}

}
