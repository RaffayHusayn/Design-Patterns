package com.raffaypackage;




// -----------this is not a builder pattern, it's adapter pattern





public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "something1");
        audioPlayer.play("mp4", "soemthing2");
    }
}
