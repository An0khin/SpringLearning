package org.example;

public class MusicPlayer {
    private Music music;

    //Inversion of Control
    MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
