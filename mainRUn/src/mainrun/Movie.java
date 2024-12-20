/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainrun;

/**
 *
 * @author TECHNICAL
 */
abstract class Movie {
    protected String title;

    public String getTitle() {
        return title;
    }
}

class ActionMovie extends Movie {
    public ActionMovie() {
        title = "Action Movie";
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie() {
        title = "Comedy Movie";
    }
}

class DramaMovie extends Movie {
    public DramaMovie() {
        title = "Drama Movie";
    }
}

class MovieFactory {
    public static Movie createMovie(String genre) {
        switch (genre) {
            case "Action":
                return new ActionMovie();
            case "Comedy":
                return new ComedyMovie();
            case "Drama":
                return new DramaMovie();
            default:
                throw new IllegalArgumentException("Unknown genre: " + genre);
        }
    }
}