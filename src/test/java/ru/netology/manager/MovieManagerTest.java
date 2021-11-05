package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private Movie first = new Movie(6, "Гарри Поттер и философский камень", "Фэнтези", "URL", false);
    private Movie second = new Movie(7, "Властелин колец: Братство кольца", "Фэнтези", "URL", false);
    private Movie third = new Movie(8, "Звездные войны. Эпизод 1", "Фэнтези", "URL", false);
    private Movie fourth = new Movie(9, "Веном 2", "Фэнтези", "URL", false);
    private Movie fifth = new Movie(10, "Дюна", "Фэнтези", "URL", true);
    private Movie sixth = new Movie(11, "Головоломка", "Мультфильм", "URL", false);
    private Movie seventh = new Movie(12, "Один дома", "Комедия", "URL", false);
    private Movie eights = new Movie(13, "Кошмар на улице Вязов", "Ужасы", "URL", false);
    private Movie ninth = new Movie(14, "Мстители", "Фэнтези", "URL", false);
    private Movie tenth = new Movie(15, "Angry Birds в кино", "Мультфильм", "URL", false);
    private Movie eleventh = new Movie(7, "Помни меня", "Мелодрама", "URL", false);

    @Test
    public void shouldShowLastMoviesDefault() {
        MovieManager manager = new MovieManager();
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMovies() {
        MovieManager manager = new MovieManager(5);
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLastMoviesNullLength() {
        MovieManager manager = new MovieManager(0);
        Movie[] expected = new Movie[0];
        Movie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

}
