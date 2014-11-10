
public class BookImpl implements Book{
	private String author;
	private String title;
	
	public BookImpl(String inputAuthor, String inputTitle) {
		author = inputAuthor;
		title = inputTitle;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
	
	
}
