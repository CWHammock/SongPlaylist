package classes;

public class Main {
	
	public static void main(String[] args) {
		Album album = new Album("The night");
		album.addSong("The one", 334);
		album.addSong("Second one", 223);
		album.printAlbumSongs();
		Album nextAlbum = new Album("Second Album");
		nextAlbum.addSong("Warren is the man", 555);
		nextAlbum.addSong("James is back", 89);
		nextAlbum.printAlbumSongs();
		PlayList playList = new PlayList("My Playlist");
		playList.addSongToPlayList(album, "The one");
		playList.printPlayList();
		playList.addSongToPlayList(nextAlbum, "Friday Nights");
		playList.addSongToPlayList(nextAlbum, "Warren is the man");
		playList.printPlayList();
		
		
	}
}
