public class Student {
  private String name;
  private Transcript transcript;
  
  public Student(String name) {
	  this.name = name;
  }
  public Student(String name, Transcript transcript) {
	  this.name = name;
	  this.transcript = transcript;
  }
}