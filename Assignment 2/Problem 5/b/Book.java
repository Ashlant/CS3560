public class Book {
	private String name;
	private String author;
	private Course course;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	public Book(String name, String author, Course course) {
		this.name = name;
		this.author = author;
		this.course = course;
	}
}
