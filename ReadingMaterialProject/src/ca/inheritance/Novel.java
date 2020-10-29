package ca.inheritance;

public class Novel extends ReadingMaterial {
	
	private String mainCharacterName;
	private String theme;
	public final String DEFAULT_STRING = "Unknown";
	
	
	//CONSTRUCTOR
	
	public Novel(String title, int numOfPages, String mainCharacterName, String theme) {
		super(title, numOfPages);
		setMainCharacterName(mainCharacterName);
		setTheme(theme);
	}
	
	
	//GETTER
	
	/*
	 * @return mainCharacterName
	 */
	public String getMainCharacterName() {
		return mainCharacterName;
	}
	/*
	 * @return theme
	 */
	public String getTheme() {
		return theme;
	}
	
	
	// SETTER

	/*
	 * @param mainCharacterName
	 */
	public void setMainCharacterName(String mainCharacterName) {	
		if (!mainCharacterName.isEmpty() && !mainCharacterName.equalsIgnoreCase(null)) {
			this.mainCharacterName = mainCharacterName;
		} else {
			this.mainCharacterName = DEFAULT_STRING;
		}	
	}
	/*
	 * @param theme
	 */
	public void setTheme(String theme) {
		if (!theme.isEmpty() && !theme.equalsIgnoreCase(null)) {
			this.theme = theme;
		} else {
			this.theme = DEFAULT_STRING;
		}	
	}
}
