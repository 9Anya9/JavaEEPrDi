package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//       Music music = context.getBean("musicBean", Music.class);
//       MusicPlayerConstructorSetter musicPlayer = new MusicPlayerConstructorSetter(music);

       // Constructor Based Injection
       MusicPlayerConstructorSetter musicPlayer = context.getBean("musicPlayerConstructor", MusicPlayerConstructorSetter.class);
       musicPlayer.playMusic();

       //Setter-Based Injection
        MusicPlayerConstructorSetter musicPlayer1 = context.getBean("musicPlayerSetter", MusicPlayerConstructorSetter.class);
        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());

        //List Based Injection
        MusicPlayerList musicPlayerList = context.getBean("musicPlayerList", MusicPlayerList.class);
        musicPlayerList.playMusicList();

        context.close();
    }
}
