package com.company;

/**
 * Created by lenoubun16 on 6/27/16.
 */
public class Song {
    String mSongName;
    String mArtistName;
    String mAlbumName;

    public User(String songName, String artistName, String albumName) {
        mSongName = songName;
        mAlbumName = artistName;
        mAlbumName = albumName;
    }

    public void play() {
        System.out.println(mSongName);
        System.out.println(mArtistName);
        System.out.println(mAlbumName);
    }
}
