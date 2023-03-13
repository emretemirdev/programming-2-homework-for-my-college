package org.example;

import org.json.JSONArray;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main{
    public static void main(String[] args) {

        String path = "C:/Users/Emre/Desktop/Java Projeler/Programlama101/HomeWork2/hw5.1/src/main/resources/time.json";
        File file = new File(path);
        String content = null;
        if (!file.exists()) {
            System.out.println(path + " Dosyanız Mevcut Değil");   // Dosya yoksa hata mesajı verdim.
            return;
        }

        try {
            content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8); // Dosyayı okudum.
        } catch (IOException e) { // Dosya okunurken hata oluşursa
            e.printStackTrace(); // Hata mesajı verdim.
        }

        // JSON dizisine dönüştürdüm.
        JSONArray jsonArray = new JSONArray(content);

        // Her satırı dolaşarak haftalık çalışma saatlerini hesaplayın ve bir Map'te saklayan bir döngü oluşturdum.
        Map<Integer, Integer> totalHoursMap = new HashMap<>(); // Map oluşturdum
        for (int i = 0; i < jsonArray.length(); i++) { // Her satırı dolaşan bir döngü oluşturdum.
            JSONArray row = jsonArray.getJSONArray(i); // Satırı JSONArray'e dönüştürdüm.
            int totalHours = 0; // Her satır için toplam çalışma saatini tutan bir değişken oluşturdum.
            for (int j = 0; j < row.length(); j++) { // Her satırı dolaşan bir döngü oluşturdum.
                totalHours += row.getInt(j); // Her satırın toplam çalışma saatini hesapladım.
            }
            totalHoursMap.put(i, totalHours); // Map'e ekledim.
        }

        // Toplam çalışma saatlerine göre Map'i sıralayan bir döngü oluşturdum.
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(totalHoursMap.entrySet());// Map'i listeye dönüştürdüm.
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {// Listeyi sıraladım.
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // Sıralama işlemini yaptım.
            }
        });

        // Sıralanmış Map'teki verileri yazdıran bir döngü oluşturdum.
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println("Çalışan " + (entry.getKey() + 1) + " Toplam Çalışma Saati: " + entry.getValue());
        }
    }
}
