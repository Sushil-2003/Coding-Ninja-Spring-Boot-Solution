package com.example.TuneIn;

import java.util.List;

public interface Playlist {

    void addSong(Song song);

    List<Song> getPlaylistSongs();

    Integer getCount();

}


