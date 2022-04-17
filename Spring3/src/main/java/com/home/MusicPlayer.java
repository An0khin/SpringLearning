package com.home;


import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    Music music;
    List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    //for DI with constructor
    MusicPlayer(Music music) {
        this.music = music;
    }

    MusicPlayer() {
        this.music = null;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Now playing " + music.getName());
    }

    public void playMusic(Music music) {
        System.out.println("Now playing " + music.getName());
    }

    public void playMusicList() {
        musicList.forEach((e) -> playMusic(e));
        //System.out.println(musicList);
    }
}
