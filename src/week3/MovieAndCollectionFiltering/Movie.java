package week3.MovieAndCollectionFiltering;

class Movie {

    // Film Class'ı
    private String movieTitle;
    private int releaseYear;
    private String movieGenre;
    private double imdbRating;

    // Constructor
    public Movie(String movieTitle, int releaseYear, String movieGenre, double imdbRating) {
        this.movieTitle = movieTitle;
        this.releaseYear = releaseYear;
        this.movieGenre = movieGenre;
        this.imdbRating = imdbRating;
    }

    // Getter metodları
    public String getMovieTitle() {
        return movieTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    // toString metodu - Filmleri yazdırmak için
    @Override
    public String toString() {
        return String.format("Movie %s | Year: %d | Genre: %s | IMDb: %.1f",
                movieTitle, releaseYear, movieGenre, imdbRating);
    }
}