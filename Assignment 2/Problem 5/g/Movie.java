public class Movie {
  private String name, genre;
  private Watch watch;
  private Person person;

  public Movie(String name, String genre, Watch watch, Person person) {
    this.name = name;
    this.genre = genre;
    this.watch = watch;
    this.person = person;
  }
}
