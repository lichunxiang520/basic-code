import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("person.txt"));
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("person.txt"));
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        os.writeObject(list);;
        Object o = is.readObject();
        List<Person> ps = (List<Person>)o;
        os.close();
        is.close();
        for (Person p : ps) {
            System.out.println(p);
        }
    }
}
