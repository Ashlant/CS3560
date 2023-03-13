public class Professor extends Employee {
  private String field;
  
  public Professor(String name, int hours) {
    super(name, hours);
  }
  public Professor(String field, String name, int hours) {
    super(name, hours);
    this.field = field;
  }
  
  @Override
  public double calculateSalary() {
    return hours * 30
  }
}
