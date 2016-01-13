package util;
import java.util.ResourceBundle;

public class GameConstants {
	private static final String BUNDLE_NAME = "gameConstants"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private GameConstants() {
	}

	public static int getInt(String key) {
		return Integer.parseInt(RESOURCE_BUNDLE.getString(key));
	}
	public static String getString(String key) {
		return RESOURCE_BUNDLE.getString(key);
	}

	public static int getMinSpiller(){ return getInt("minSpillere"); }
	public static int getMaxSpillere(){ return getInt("maxSpillere"); }
	public static int getStartPenge(){ return getInt("startPenge"); }
	public static int getStartPosition() { return getInt("startPosition"); }
	public static int getMaxAllowedSameRolls() { return getInt("maxAllowedSameRolls"); }
	public static int getErrorInt() { return getInt("errorInt"); }
	public static String getDefaultPicture() { return getString("defaultPicture"); }

	public static int getJailPosition() {
		return getInt("jailPosition");
	}

	public static int getMaxJailTurns() { return getInt("maxJailTurns");}

	public static int getGetOutofJailPrice() {	return getInt("getOutOfJailPrice");	}

	


}
