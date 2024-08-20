package com.example.TuneIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class MyPlaylist implements Playlist {

    private int count = 0;
    Song mySong; 

    private List<Song> hindiSongsList = new ArrayList<Song>();

    @Autowired
    public void setMySong(Song mySong) {
        this.mySong = mySong;
    }

    @Override
    public void addSong(Song song) {
        this.count++;
        this.hindiSongsList.add(song);
    }

    @Override
    public List<Song> getPlaylistSongs() {
        return this.hindiSongsList;
    }

    @Override
    public Integer getCount() {
        return count;
    }
}