package week3.MovieAndCollectionFiltering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieCollection {

    // Tüm filmleri saklayan liste--
    private final List<Movie> movieList;

    // Constructor
    public MovieCollection() {
        movieList = new ArrayList<>();
        createMovies();
    }

    // Film nesnelerini oluşturup listeye ekler--
    private void createMovies() {
        movieList.add(new Movie("Inception", 2010, "Bilim Kurgu", 8.8));
        movieList.add(new Movie("The Dark Knight", 2008, "Aksiyon", 9.0));
        movieList.add(new Movie("Forrest Gump", 1994, "Drama", 8.8));
        movieList.add(new Movie("Pulp Fiction", 1994, "Suç", 8.9));
        movieList.add(new Movie("The Shawshank Redemption", 1994, "Drama", 9.3));

    }

    // IMDb puanına göre filmleri büyükten küçüğe sıralar ve yazdırır--
    public void sortByImdbRating() {
        System.out.println("=== IMDb Puanına Göre Sıralama (Büyükten--Küçüğe) ===");
        movieList.stream()
                .sorted((m1, m2) -> Double.compare(m2.getImdbRating(), m1.getImdbRating()))
                .forEach(System.out::println);
        System.out.println(); // Bir satır boşluk bırakır--
    }

    // Yayın yılına göre filmleri eskiden yenie sıralar ve yazdırır--
    public void sortByReleaseYear() {
        System.out.println("=== Yayın Yılına Göre Sıralama (Eskiden--Yeniye) ===");
        movieList.stream()
                .sorted(Comparator.comparingInt(Movie::getReleaseYear))
                .forEach(System.out::println);
        System.out.println(); // Bir satır boşluk bırakır--
    }

    // Belirli bir tür'deki filmleri filtreler ve yazdırır--
    public void filterByGenre(String genre) {
        System.out.println("=== '" + genre + "' Türdeki Filmler === ");
        List<Movie> filteredMovies = movieList.stream()
                .filter(movie -> movie.getMovieGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());

        if (filteredMovies.isEmpty()) {
            System.out.println("Bu türde film bulunamadı.");
        } else {
            filteredMovies.forEach(System.out::println);
        }

        System.out.println(); // Bir satır boşluk bırakır--
    }

    // Tüm filmleri listeler ve yazdırır--
    public void listAllMoveis() {
        System.out.println("=== Tüm Filmler ===");
        movieList.forEach(System.out::println);
        System.out.println(); // Bir satır boşluk bırakır--
    }

    // Ana method - Program buradan başlar--
    public static void main(String[] args) {

        //MovieCollection nesnesi oluştur--
        MovieCollection collection = new MovieCollection();

        // Tüm filmleri listele--
        collection.listAllMoveis();

        // IMDb puanına göre sırala--
        collection.sortByImdbRating();

        // Yayın yılına göre sırala--
        collection.sortByReleaseYear();

        // Farklı türlere göre filtrele--
        collection.filterByGenre("Drama");
        collection.filterByGenre("Aksiyon");
        collection.filterByGenre("Komedi"); // Bu türde film olmadığı için "bulunamadı" mesajı çıkıcak--
    }
}
