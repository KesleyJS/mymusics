package br.com.mymusics.models;

public class Favorited {
    public void add(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " é um sucesso!");
        } else {
            System.out.println(audio.getTitle() + " é muito curtido!");
        }
    }
}
