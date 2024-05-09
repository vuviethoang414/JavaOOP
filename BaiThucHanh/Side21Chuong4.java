
import java.util.ArrayList;
public class Side21Chuong4 {
    public static void main(String[] args) {
        ArrayList<String> fullName = new ArrayList<>();
        fullName.add("Nguyen Van A");
        fullName.add("Tran Thi B");
        fullName.add("Le Van C");
        fullName.remove("Tran Thi B");
        fullName.add("Luu Tra D");

        System.out.println(fullName.get(2));
        System.out.println(fullName.contains("Le Van D"));
        System.out.println(fullName.size());
        System.out.println(fullName);
    }   
}

