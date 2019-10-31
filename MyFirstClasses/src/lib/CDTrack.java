package lib;

public class CDTrack {
	//Fields
	private String title;
	private String artist;
	private int duration;
	//Constructors
	
	public CDTrack() {
		this.title = "";
		this.artist = "";
		this.duration = 0;
	}
	
	public CDTrack(String title, String artist, int duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	
	//Methods
	
	/** Returns the title of the CD track
	 * 
	 * @return The title of this CD Track as a string.
	 */
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist =  artist;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return "[title = " +title+ " artist = " +artist+ " duration= "+duration + "]";
	}

}
