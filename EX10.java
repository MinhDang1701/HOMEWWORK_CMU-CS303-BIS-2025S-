/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class EX10 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap sl ten:");
        int n = scanner.nextInt();
        System.out.println("Nhap ten:");
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }
    }
}

