import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamanager.domain.MovieManager;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();

    @BeforeEach
    public void setup() {
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");
    }

    @Test
    public void shouldFindLastWithDefaultLimit() {
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
