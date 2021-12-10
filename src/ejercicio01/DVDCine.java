package ejercicio01;

import java.util.Locale;

public class DVDCine {
    // atributos
    private String title, director, protagonists, summary, genre;
    private int movieLength;

    // constructores
    // constructor parametrado
    public DVDCine(String title, String director, String protagonists, String summary, String genre, int movieLength) {
        this.title = title;
        this.director = director;
        this.protagonists = protagonists;
        this.summary = summary;
        this.movieLength = movieLength;
        this.genre = genre;
    }

    // metodos
    public void muestraDVDCine() {
        System.out.print("\n"+ this.title.toUpperCase()+" De: "+ this.director+"\nCon: "+ this.protagonists+"\n"+ this.genre+" - "+ this.movieLength+" min.\nResumen: "+ this.summary);
    }

    public boolean esThriller() { // returns 'true' if genre is "thriller"
        return this.genre.equalsIgnoreCase("thriller");
    }

    public boolean tieneResumen() { // returns 'true' if the object has a summary
        return !this.summary.isEmpty();
    }

    public void muestraDuracion() { // shows movie duration
        System.out.print("\n"+this.movieLength+" min.\n");
    }

    // setters

    // getters
    public String getTitle() { // returns title as a string
        return this.title;
    }

    public String getGenre() { // returns genre as a string
        return this.genre;
    }

    public String getResumen() { // returns summary as a string
        return this.summary;
    }

    // otros

    // tostring

    @Override
    public String toString() {
        return "DVDCine{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", protagonists='" + protagonists + '\'' +
                ", summary='" + summary + '\'' +
                ", genre='" + genre + '\'' +
                ", movieLength=" + movieLength +
                '}';
    }
}
