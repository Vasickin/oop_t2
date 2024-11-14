import java.io.*;

public class FileOperations implements Serializable{
    public void saveToFile(String filename, Object obj) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {  
        oos.writeObject(obj);
        System.out.println("Данные успешно загружены в файл: " + filename);
        }
    }   

    public Object loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            System.out.println("Данные успешно выгружены из файла: " + filename);
            return ois.readObject();
        }
    }
}
