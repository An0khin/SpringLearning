package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music musicBean = context.getBean("musicBean", Music.class);
        MusicPlayer player = new MusicPlayer(musicBean);

        player.playMusic();

        context.close();
    }
}
