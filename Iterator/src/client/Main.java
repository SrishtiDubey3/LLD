package client;

import playlist.Playlist;
import playlist.Song;
import iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Mai Agr Kahoon"));
        playlist.addSong(new Song("Blue Birds"));
        playlist.addSong(new Song("Dandelions"));

        System.out.println("Now Playing:");

        Iterator<Song> iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("🎵 " + song.getTitle());
        }
    }
}