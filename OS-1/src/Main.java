import java.io.*;

public class Main {

    public Main() throws IOException, ClassNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Nayan.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person = new Person();
        objectOutputStream.writeObject(person);

        // object deserelize


    }
    FileInputStream fileInputStream = new FileInputStream("Nayan.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Person p2 = (Person) objectInputStream.readObject();
}