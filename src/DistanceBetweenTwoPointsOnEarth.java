import java.util.Scanner;

public class DistanceBetweenTwoPointsOnEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the coardinates (x1,y1);(x2,y2): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double rad = 6371.01;
        double dis = rad * (Math.acos(Math.sin(x1) * Math.sin(x2) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
        System.out.println("THE DISTANCE IS " + ":" + dis);

    }
}
