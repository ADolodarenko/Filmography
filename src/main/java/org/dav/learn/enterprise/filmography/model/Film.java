package org.dav.learn.enterprise.filmography.model;

public class Film {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id);
        builder.append(' ');
        builder.append(title);
        builder.append(' ');
        builder.append(year);
        builder.append(' ');
        builder.append(genre);
        builder.append(' ');
        builder.append(watched);

        return builder.toString();
    }
}
