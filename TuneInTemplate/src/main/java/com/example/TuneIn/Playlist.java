package com.example.TuneIn;

import java.util.List;

public interface Playlist {

   /** This method adds a song to the "songsList" and increments the value of the count variable. **/ 
    void addSong(Song song);

    /**  This method returns the "songsList" associated with the class. **/
    List<Song> getPlaylistSongs();

    /** This method returns the count of songs in the "songsList", returns an integer value. **/
    Integer getCount();

}


