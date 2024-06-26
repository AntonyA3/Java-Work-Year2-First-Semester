package main;

import lib.iterable_comparable.PlayList;
import lib.iterable_comparable.Song;

/* Program to informally test, create and populate a PlayList object. */
public class PlayListApp {

    public static void main(String[] arg) {

    	//Create a new PlayList object
        PlayList playlist = new PlayList("My Favourites");

        //add some new Song objects
        playlist.addSong( new Song("Only Girl (In The World)", 235, "Rhianna") );
        playlist.addSong( new Song("Thinking of Me", 206, "Olly Murs") );
        playlist.addSong( new Song("Raise Your Glass", 202,"P!nk") );
        playlist.addSong( new Song("Beat it", 150,"M Jackson") );        
        playlist.addSong( new Song("Bad", 210,"M Jackson") );
        
        //output some details
        System.out.println(playlist.toString() + "\n");
        
        System.out.println("Number of Songs: " + playlist.numberOfSongs());
        System.out.println("Total time: " + playlist.getTotalTime() + " seconds\n");

        System.out.println("Playing each song...");
        for (int i = 0; i < playlist.numberOfSongs(); i++) {
            playlist.getSong(i).play();
        }

        //find the song at index 4 
        Song s = playlist.getSong(4);
        System.out.println("\nSong at index 4 is: " + s + "\n");
      
        //remove a Song 
        System.out.println("Removing a song...");
        playlist.removeSong(1);
        System.out.println(playlist.getTrackListings()); 
        
        //move up
        System.out.println("Moving a song...");
        playlist.moveUp(3);
        System.out.println(playlist.getTrackListings());   
        
        //shuffle
        System.out.println("Shuffling playlist...");
        playlist.shufflePlaylist();
        System.out.println(playlist.getTrackListings());   
        
        
        for (Song track : playlist) {
        	System.out.println(track.toString());
        }
        System.out.println();
        //add some more songs
        
        Song newSong1 = new Song("Love will tear us Apart", 198, "Joy Division");
        Song newSong2 = new Song("Love will tear us Apart", 198, "The Cure");
        System.out.println(newSong1.compareTo(newSong2));
        playlist.addSong(newSong1);
        playlist.addSong(newSong2);
        playlist.sortPlaylist();
        
        for (Song track : playlist) {
        	System.out.println(track.toString());
        }
        
    }
}
