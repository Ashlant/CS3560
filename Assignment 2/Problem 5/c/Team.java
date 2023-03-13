public class Team {
	private int code;
	private Player player;
  
  public Team() {
    //...
  }
	public Team(int code) {
		this.code = code;
	}
	public Team(int code, Player player) {
		this.code = code;
		this.player = player;
	}
}
