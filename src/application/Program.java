package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo de origem: ");
        String strPath = sc.nextLine();
        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
            String line = br.readLine();
            while (line != null) {
                String[] lineList = line.split(",");
                products.add(new Product(lineList[0], Double.valueOf(lineList[1]), Integer.valueOf(lineList[2])));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        

        sc.close();
    }
}
