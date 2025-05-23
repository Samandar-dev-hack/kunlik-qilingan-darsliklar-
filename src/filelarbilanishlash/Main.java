package filelarbilanishlash;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\samnadar\\OneDrive\\Desktop\\password123.txt");

        // Fayl mavjudligini tekshirish
        if (!file.exists()) {
            file.createNewFile();
        }

        // Faylni o'qish
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        System.out.println("Fayldagi mavjud ma'lumot:");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close(); // BufferedReader-ni yopish

        // Scanner obyektini yaratish
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yangi matnni kiriting:");
        String newText = scanner.nextLine();

        // Faylga yozish (Eski ma'lumotni o'chirmasdan, yangi ma'lumot qo'shish)
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.write(newText);
        bufferedWriter.newLine();
        bufferedWriter.close(); // BufferedWriter-ni yopish

        System.out.println("Ma'lumot faylga muvaffaqiyatli qo'shildi!");
    }
}