
import java.util.Scanner; // импорт сканера
import java.io.*;

class MyCalc {
	public static void main(String args[])
    {

        // Приглашение на ввод 1
		System.out.print("Введите число, которое надо возвести в степень: ");
		Scanner scan1 = new Scanner(System.in);
		int number = scan1.nextInt();

        // Приглашение на ввод 2
		System.out.print("Введите степень: ");
		Scanner scan2 = new Scanner(System.in);
		int power = scan2.nextInt();

        // Возведение в степень
		System.out.println(Math.pow(number, power));
        double result = Math.pow(number, power);
        File file = new File ("output.txt");
        try
        {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println (result);
            printWriter.close();       
        }
        catch (FileNotFoundException ex)  
    {
        System.out.println(result);
    }
    }
}



