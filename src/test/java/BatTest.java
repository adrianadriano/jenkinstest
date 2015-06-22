import org.junit.Test;

public class BatTest {

    @Test
    public void bat() throws Exception {
        for (Id id : Id.values()) {
            System.out.println(id.name());
            System.out.println(id);
            System.out.println(String.format("[%s] - %s", id.name(), id));
        }
    }
}
