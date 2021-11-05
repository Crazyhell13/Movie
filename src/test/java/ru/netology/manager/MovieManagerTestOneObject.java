package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTestOneObject {
    private Movie first = new Movie(6, "Harry Potter", "Fantasy", "URL", false);

    @Test
    public void shouldAddMoviesDefaultOneObject (){
        MovieManager manager = new MovieManager ();
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddMoviesOneObject (){
        MovieManager manager = new MovieManager (5);
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldAddMoviesNullLengthOneObject (){
        MovieManager manager = new MovieManager (0);
        manager.addMovie(first);
        int expected = 1;
        int actual = manager.getFilms().length;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesDefaultOneObject (){
        MovieManager manager = new MovieManager();
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesOneObject (){
        MovieManager manager = new MovieManager(5);
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldShowLastMoviesNullLengthOneObject (){
        MovieManager manager = new MovieManager(0);
        manager.addMovie(first);
        Movie[]expected = new Movie[]{first};
        Movie[]actual = manager.showLastMovies();
        assertArrayEquals(expected,actual);
    }
}