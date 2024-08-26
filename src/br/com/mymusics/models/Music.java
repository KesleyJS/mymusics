package br.com.mymusics.models;

public class Music extends Audio {
    String album;
    String artist;
    String genre;

    @Override
    public int getRating() {
        if (getTotalPlays() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
