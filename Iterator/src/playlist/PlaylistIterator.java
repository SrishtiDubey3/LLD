package playlist;

import iterator.Iterator;
import java.util.List;

public class PlaylistIterator implements Iterator<Song> {
    private List<Song> songs;
    private int position = 0;

    // constructor
    public PlaylistIterator(Playlist playlist) {
        this.songs = playlist.getSongs();
    }

    // Iteration Logic ->
    
    // deciding whether to move fwd or not
    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    // Get next song
    @Override
    public Song next() {
        return songs.get(position++);
    }
}