package ca.inheritance;

public class ReadingMaterial {
	
	private String title;
	private int numOfPages;
	public final String DEFAULT_STRING = "Unknown";
	
	
	//CONSTRUCTOR
	
	public ReadingMaterial(String title, int numOfPages) {
		setTitle(title);
		setNumOfPages(numOfPages);
	}
	
	
	//GETTER
	
	/*
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/*
	 * @return numOfPages
	 */
	public int getNumOfPages() {
		return numOfPages;
	}
	
	
	// SETTER

	/*
	 * @param title
	 */
	public void setTitle(String title) {	
		if (!title.isEmpty() && !title.equalsIgnoreCase(null)) {
			this.title = title;
		} else {
			this.title = DEFAULT_STRING;
		}	
	}
	/*
	 * @param numOfPages
	 */
	public void setNumOfPages(int numOfPages) {
		if (numOfPages > 0) {
			this.numOfPages = numOfPages;
		} else {
			this.numOfPages = 1;
		}		
	}
	
	
	@Override
	public String toString() {
		return "Title :" + getTitle() + 
				"Number of pages :" + getNumOfPages();
	}
}
