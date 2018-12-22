package classes;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	
	private String name;
	private String artistName;
	private ArrayList<Song> album;
	
	public Album(String name) {
		this.name = name;
		this.album = new ArrayList<Song>();
	}
	
	public String getName() {
		return this.name;
	}
	
	private Song findSong(String nameSong) {
		for(int i = 0;i < album.size();i++) {
			if(album.get(i).getName().equals(nameSong)) {
				return album.get(i);
			}
		}
		return null;
	}
	
	public boolean addSong(String nameSong, int seconds) {
		Song newSong = findSong(nameSong);
		if(newSong == null) {
			album.add(new Song(nameSong, seconds));
			return true;
		}
		return false;
	}

	public boolean deleteSong(String nameSong) {
		Song newSong = findSong(nameSong);
		if(newSong == null) {
			for(int i = 0;i < album.size();i++) {
				if(album.get(i).getName().equals(nameSong)) {
					album.remove(i);
					return true;
				}
			}
		
		}
		return false;
	}
	
	public void printAlbumSongs() {
		System.out.println("---Songs on " + this.name +
							"album---");
		for(int i = 0;i < album.size();i++) {
			System.out.println(album.get(i).toString());
		}
	}
	
	//goes over entire arraylist named album and adds song to linkedList playlist
	public boolean addToPlayList(String songName, LinkedList<Song> linkedList) {
		if (findSong(songName) != null) {
			for(Song item: album) {
				if (item.getName().equals(songName)) {
					linkedList.add(item);
					return true;
				}
			}
		}
		return false;
	}
	
}
