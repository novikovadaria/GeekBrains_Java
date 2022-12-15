package module.Tovar_complex;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import module.Tovar_complex;

public class Lesson_3main_hometask2 {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar('средний', '2', 5, 'country1', 23);
        Tovar tovar2= new Tovar('высший', '2', 6, 'country2', 34);
        Tovar tovar3 = new Tovar('высший', '1', 7, 'country3', 26 );
        List<Tovar> ListTovar = new ArrayList<>();
        ListTovar.add(tovar1);
        ListTovar.add(tovar2);
        ListTovar.add(tovar3);


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт: ");
        String qual = sc.nextInt();
 
        String search = qual;
        Integer totalExportVolume = 0;
        
        List<Double> ListGeneral = new ArrayList<>();
        List<Double> ListProduct = new ArrayList<>();
        
        for (int i=0; i <ListTovar.size(); i++) {
            List<Double> ListProduct = new ArrayList<>();
            if (ListTovar.get(1).getQuality().equals(search)) {
                ListProduct.add(ListTovar.get(i).getName());
                ListProduct.add(ListTovar.get(i).getPrice());
                listGeneral.addAll(ListProduct);
            }
        }
        
        List<Double> ListResult = new ArrayList<>();
        for (int i = 0; i < setGeneral.length+1; i++) {
            if (ListGeneral[i].getPrice() > ListGeneral[i+1].getPrice()) {
                ListResult.add(ListGeneral[i])
            }
        }
        for (int i = 0; i < ListResult.length; i++) {
            System.out.println(ListResult[i])
    }
}
