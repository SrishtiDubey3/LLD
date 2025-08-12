package playlist;

import iterator.IterableCollection;
import iterator.Iterator;
import java.util.ArrayList;
import java.util.List;

// Concrete Collection
public class Playlist implements IterableCollection<Song> {
	// initialize space for list of songs
    private List<Song> songs = new ArrayList<>();

    // add song
    public void addSong(Song song) {
        songs.add(song);
    }

    // Create Iterator
    @Override
    public Iterator<Song> createIterator() {
        return new PlaylistIterator(this);
    }

    // return stored list of songs
    public List<Song> getSongs() {
        return songs;
    }

}
