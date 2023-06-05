import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point2D> points = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("points.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                Point2D point = new Point2D(x, y);
                points.add(point);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }

        double minDistance = Double.MAX_VALUE;
        Point2D closest1 = null;
        Point2D closest2 = null;

        for (int i = 0; i < points.size() - 1; i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double distance = points.get(i).distance(points.get(j));
                if (distance < minDistance) {
                    minDistance = distance;
                    closest1 = points.get(i);
                    closest2 = points.get(j);
                }
            }
        }
        System.out.println("En yakın iki nokta: " + closest1 + " ve " + closest2);
        System.out.println("Öklid mesafesi: " + minDistance);
    }
}
