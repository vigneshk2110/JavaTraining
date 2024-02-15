import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError{
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
            while (true) {
                list.add(new Object());
                System.out.println("I am in while Block");
            }
    }
}
