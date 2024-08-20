package com.example.TuneIn;



public interface User {

    /** This method sets the name and age of a user. **/
    void setUserDetail(String name,Integer age);

    /** This function returns a playlist object associated with the class. **/
    Playlist getPlaylist();
}

