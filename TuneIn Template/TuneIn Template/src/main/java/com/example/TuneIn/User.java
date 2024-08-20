package com.example.TuneIn;


import com.example.TuneIn.Playlist;

public interface User {

    void setUserDetail(String name,Integer age);

    Playlist getPlaylist();
}

