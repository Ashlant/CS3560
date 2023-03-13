public class Staff extends Employee {
  private int role;
  
  public Staff(String name, int hours) {
    super(name, hours);
  }
  public Staff(int role, String name, int hours) {
    super(name, hours);
    this.role = role;
  }
}
