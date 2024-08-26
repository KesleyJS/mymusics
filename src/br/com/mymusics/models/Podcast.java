package br.com.mymusics.models;

public class Podcast extends Audio {
    String host;
    String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRating() {
        if (this.getTotalLikes() > 1000) {
            return 10;
        } else {
            return 8;
        }
    }
}
