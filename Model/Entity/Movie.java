package Model.Entity;

import java.util.Objects;

public class Movie extends Favs {
    private String gender;

    public Movie(String name, String ID, String gender) {
        super(name, ID);
        this.gender = gender;
    }

    public Movie(String gender) {
        this.gender = gender;
    }
    public Movie(){
        this("");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getGender(), movie.getGender());
    }


}
