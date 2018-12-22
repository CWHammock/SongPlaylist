package classes;

import java.util.Iterator;
import java.util.LinkedList;

public class PlayList {
	
	private String name;
	private LinkedList<Song> songsList;
	
	public PlayList(String name) {
		this.name = name;
		this.songsList = new LinkedList<Song>();
	}
	
	public void printPlayList() {
		Iterator<Song> iterator = songsList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
	
	public boolean addSongToPlayList(Album album, String song) {
		if(album.addToPlayList(song, songsList) == true) {
			System.out.println(song + " added to the playlist...");
			return true;
		}else {
			System.out.println("Error trying to add " + song + " to the playlist....");
			return false;
		}
	}
}
