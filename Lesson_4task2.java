public class Lesson_4task2 {

    public static void main(String[] args) {
        int[] ints = {1, -1, 2, -1};
        System.out.println(isArrayAlternating(ints));
    }

    // Описываем метод
    public boolean isArrayAlternating(int[] ints) {
        if (ints == null || ints.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] != ints[i + 1]*(-1)) {
                return false;
            }
        }
    }
}