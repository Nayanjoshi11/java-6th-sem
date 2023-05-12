import java.io.Serializable;

public class Person implements Serializable {
    String name = "Nayan";

    void displayName(){
        System.out.println(name);
    }
}
