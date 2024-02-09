package Model.Entity;

import java.util.Objects;

public class Song extends Favs{
    private String artist;

    public Song(String name, String ID, String artist) {
        super(name, ID);
        this.artist = artist;
    }

    public Song(String artist) {
        this.artist = artist;
    }
    public Song(){
        this("");
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Cancion: " + "\n" +
                "Artista: " + artist + "\n" +
                "Nombre: " + name + "\n" +
                "ID: " + ID + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getArtist(), song.getArtist());
    }


}
