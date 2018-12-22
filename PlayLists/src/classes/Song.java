package classes;

public class Song {
	private String name;
	private int seconds;
	
	public Song(String name) {
		this.name = name;
		this.seconds = 0;
	}
	public Song(String name, int seconds) {
		this.name = name;
		this.seconds = seconds;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public int getSeconds() {
		return this.seconds;
	}
	
	public String toString() {
		return this.getName() + " " + this.getSeconds();
	}
	
	

}
