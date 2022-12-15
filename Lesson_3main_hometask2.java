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

        // Спрашиваем нужный сорт         
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт: ");
        String qual = sc.nextInt();
 
        String search = qual;
        Integer totalExportVolume = 0;
        
        // Объявляем листы         
        List<Double> ListGeneral = new ArrayList<>();
        List<Double> ListProduct = new ArrayList<>();
        
        for (int i=0; i <ListTovar.size(); i++) {
            List<Double> ListProduct = new ArrayList<>();
            if (ListTovar.get(1).getQuality().equals(search)) {
                // Если товар подходит по сорту, добавляем инфу по нему его в лист ListProduct, который перезаписывается в цикле           
                ListProduct.add(ListTovar.get(i).getName());
                ListProduct.add(ListTovar.get(i).getPrice());
                // Лист добавляем в listGeneral для дальнейшего анализа
                listGeneral.addAll(ListProduct);
            }
        }
        
        // Объявляем лист для результата
        List<Double> ListResult = new ArrayList<>();
        for (int i = 0; i < setGeneral.length+1; i++) {
            if (ListGeneral[i].getPrice() > ListGeneral[i+1].getPrice()) {
                // Если цена из одного листа внутри ListGeneral больше цены другого листа, добавляем этот лист в ListResult
                ListResult.add(ListGeneral[i])
            }
        }
        
        // Выводим инфу о товаре
        for (int i = 0; i < ListResult.length; i++) {
            System.out.println(ListResult[i])
    }
}
