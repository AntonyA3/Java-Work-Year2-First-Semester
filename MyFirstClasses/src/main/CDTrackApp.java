package main;

import lib.CDTrack;
public class CDTrackApp {

	public static void main(String[] args) {
		CDTrack song = new CDTrack();
		System.out.println(song);
		
		CDTrack song2 = new CDTrack("Transmission", "Joy Division", 192);
		System.out.println(song2);
	}

}
