package util;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class GameConstants {
	private static final String BUNDLE_NAME = "gameConstants"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private GameConstants() {
	}

	public static int getInt(String key) {
			return Integer.parseInt(RESOURCE_BUNDLE.getString(key));

	}
	
	
}
