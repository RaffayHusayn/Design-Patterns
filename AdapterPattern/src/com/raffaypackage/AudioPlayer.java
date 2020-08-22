package com.raffaypackage;



public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaadapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing file using audio players filename: "+ fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaadapter = new MediaAdapter(audioType);
            mediaadapter.play(audioType, fileName);
        }
    }
}
