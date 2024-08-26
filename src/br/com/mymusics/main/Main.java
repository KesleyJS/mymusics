package br.com.mymusics.main;

import br.com.mymusics.models.Favorited;
import br.com.mymusics.models.Music;
import br.com.mymusics.models.Podcast;

public class Main {
    public static void main(String[] args) {

        Music music = new Music();
        music.setTitle("Holiday");

        for (int i = 0; i < 1054; i++) {
            music.play();
        }

        for (int i = 0; i < 387; i++) {
            music.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("DevCast");
        podcast.setHost("Kesley");

        for (int i = 0; i < 3879; i++) {
            podcast.play();
        }

        for (int i = 0; i < 1154; i++) {
            podcast.like();
        }

        System.out.println(music.getTotalPlays());

        Favorited favorited = new Favorited();
        favorited.add(podcast);
        favorited.add(music);
    }
}
