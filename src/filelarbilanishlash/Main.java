package filelarbilanishlash;

import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\samnadar\\OneDrive\\Desktop\\password.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line= bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
        bufferedWriter.write(scannerStr.nextLine());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}