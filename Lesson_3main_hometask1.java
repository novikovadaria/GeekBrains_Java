package module.Tovar;
import java.util.List;
import java.util.ArrayList;
import module.Tovar;

public class Lesson_3main_hometask1 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar('средний', '2', 5);
        Tovar tovar2= new Tovar('высший', '2', 6);
        Tovar tovar3 = new Tovar('высший', '1', 7);
        List<Tovar> ListTovar = new ArrayList<>();
        ListTovar.add(tovar1);
        ListTovar.add(tovar2);
        ListTovar.add(tovar3);

        int max = 0;

        String search = 'высший';
        Integer totalExportVolume = 0;
        Set<String> setPrices = new HashSet<>();
        for (int i=0; i <ListTovar.size(); i++) {
            if (ListTovar.get(1).getName().equals(search)) {
                setPrices.add(ListTovar.get(i).getPrice());
            }
        }
        for (int i = 0; i < setPrices.length; i++) {
            if (setPrices[i] > max) {
                max = setPrices[i];
            }
        }
        System.out.println(max)
    }
}
