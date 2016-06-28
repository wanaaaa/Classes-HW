package com.company;

import java.util.ArrayList;

/**
 * Created by lenoubun16 on 6/27/16.
 */
public class Playlist {
    String mName;
    ArrayList<Song> mSongs;

    public Playlist(String name, ArrayList<Song> songs) {
        mName = name;
        mSongs = songs;
    }

    public String getName() {
        return mName;
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public void playAll() {
       //play();
    }

}
