import java.util.ArrayList;
import java.util.Iterator;
public class Side19Chuong4 {
    public static void main(String[] args) {
        
    
    ArrayList<Float> arrListFloat = new ArrayList<>();
    arrListFloat.add(0.7f);
    arrListFloat.add(0,7.26f);
    arrListFloat.add(1.02f);
    arrListFloat.add(1,9.3f);
    Iterator<Float> iterator = arrListFloat.iterator();
    System.out.println("Cac phan tu co trong ArrList la: ");
while(iterator.hasNext())
        System.out.println(iterator.next());
    }
}
    

