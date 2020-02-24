package org.example;

public class MusicPlayerConstructorSetter {
    private Music music;

    private String name;
    private int volume;

    public MusicPlayerConstructorSetter(Music music){
        this.music = music;
    }

    public MusicPlayerConstructorSetter(){ }

    public void setMusic(Music music){
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
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
}
