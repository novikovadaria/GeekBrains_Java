
    
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
// Программа для обращения к ArrayList
public class Lesson_4task1 {
    public static<T> List<T> reverseList(List<T> list)
    {
        // Делаем копию и переворачиваем
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
 
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 
        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
}

