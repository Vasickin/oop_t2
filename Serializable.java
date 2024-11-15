import java.io.IOException;

public interface Serializable {
    void saveToFile(String filename, Object obj) throws IOException;
    Object loadFromFile(String filename) throws IOException, ClassNotFoundException;
}
