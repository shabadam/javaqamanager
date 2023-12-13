import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamanager.domain.MovieManager;

public class CustomMovieManagerTest {
    MovieManager manager = new MovieManager(7);

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
    public void shouldFindLastWithCustomLimit() {
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
