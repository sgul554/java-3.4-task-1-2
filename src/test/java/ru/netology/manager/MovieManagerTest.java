package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    @Test
    public void shouldShowLast10Movies() {
        MovieManager manager = new MovieManager();
        Movie first = new Movie(1, "http://1", "Raya and the Last Dragon", "cartoon");
        Movie second = new Movie(2, "http://2", "A couple from the future", "comedy");
        Movie third = new Movie(3, "http://3", "Dad", "comedy");
        Movie fourth = new Movie(4, "http://4", "Boss Level", "action movie");
        Movie fifth = new Movie(5, "http://5", "Tom and Jerry", "family movie");
        Movie sixth = new Movie(6, "http://6", "Humpback horse", "adventure");
        Movie seventh = new Movie(7, "http://7", "Ex-wife", "horror");
        Movie eighth = new Movie(8, "http://8", "Crisis", "thriller");
        Movie ninth = new Movie(9, "http://9", "White snow", "biography");
        Movie tenth = new Movie(10, "http://10", "Silk Road", "thriller");
        Movie eleventh = new Movie(11, "http://11", "Russian south", "comedy");
        Movie twelve = new Movie(12, "http://12", "Soul", "cartoon");
        manager.addMovie(first);
        manager.addMovie(second);
        manager.addMovie(third);
        manager.addMovie(fourth);
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        manager.addMovie(twelve);

        Movie[] actual = manager.getAllMovie();
        Movie[] expected = new Movie[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLess10Movies(){
        MovieManager manager = new MovieManager();
        Movie fifth = new Movie(5, "http://5", "Tom and Jerry", "family movie");
        Movie sixth = new Movie(6, "http://6", "Humpback horse", "adventure");
        Movie seventh = new Movie(7, "http://7", "Ex-wife", "horror");
        Movie eighth = new Movie(8, "http://8", "Crisis", "thriller");
        Movie ninth = new Movie(9, "http://9", "White snow", "biography");
        Movie tenth = new Movie(10, "http://10", "Silk Road", "thriller");
        Movie eleventh = new Movie(11, "http://11", "Russian south", "comedy");
        Movie twelve = new Movie(12, "http://12", "Soul", "cartoon");
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        manager.addMovie(twelve);

        Movie[] actual = manager.getAllMovie();
        Movie[] expected = new Movie[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLessMovies(){
        MovieManager manager = new MovieManager(3);
        Movie fifth = new Movie(5, "http://5", "Tom and Jerry", "family movie");
        Movie sixth = new Movie(6, "http://6", "Humpback horse", "adventure");
        Movie seventh = new Movie(7, "http://7", "Ex-wife", "horror");
        Movie eighth = new Movie(8, "http://8", "Crisis", "thriller");
        Movie ninth = new Movie(9, "http://9", "White snow", "biography");
        Movie tenth = new Movie(10, "http://10", "Silk Road", "thriller");
        Movie eleventh = new Movie(11, "http://11", "Russian south", "comedy");
        Movie twelve = new Movie(12, "http://12", "Soul", "cartoon");
        manager.addMovie(fifth);
        manager.addMovie(sixth);
        manager.addMovie(seventh);
        manager.addMovie(eighth);
        manager.addMovie(ninth);
        manager.addMovie(tenth);
        manager.addMovie(eleventh);
        manager.addMovie(twelve);

        Movie[] actual = manager.getAllMovie();
        Movie[] expected = new Movie[]{twelve, eleventh, tenth};
        assertArrayEquals(expected, actual);
    }
}