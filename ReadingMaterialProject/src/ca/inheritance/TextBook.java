package ca.inheritance;

public class TextBook extends ReadingMaterial {
	
	private String subject;
	private int editNumber;
	public final String DEFAULT_STRING = "Unknown";
	
	
	//CONSTRUCTOR
	
	public TextBook(String title, int numOfPages, String subject, int editNumber) {
		super(title, numOfPages);
		setSubject(subject);
		setEditNumber(editNumber);
	}
	
	
	//GETTER
	
	/*
	 * @return subject
	 */
	public String getSubject() {
		return subject;
	}
	/*
	 * @return editNumber
	 */
	public int getEditNumber() {
		return editNumber;
	}
	
	
	// SETTER

	/*
	 * @param subject
	 */
	public void setSubject(String subject) {	
		if (!subject.isEmpty() && !subject.equalsIgnoreCase(null)) {
			this.subject = subject;
		} else {
			this.subject = DEFAULT_STRING;
		}	
	}
	/*
	 * @param editNumber
	 */
	public void setEditNumber(int editNumber) {
		if (editNumber > 0) {
			this.editNumber = editNumber;
		} else {
			this.editNumber = 1;
		}		
	}
}
