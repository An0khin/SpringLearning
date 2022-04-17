package com.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //without dependency injection

        //Music music = context.getBean("Music", Music.class);
        //MusicPlayer player = new MusicPlayer(music);

        //player.playMusic();


        //DI using constructor

        //MusicPlayer player = context.getBean("MusicPlayer", MusicPlayer.class);
        //player.playMusic();

        //DI using setter
        MusicPlayer player = context.getBean("MusicPlayer", MusicPlayer.class);
        player.playMusic();
        System.out.println(player.getName() + " " + player.getVolume());

        player.playMusicList();

        context.close();
    }
}
