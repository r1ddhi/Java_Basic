import java.util.Arrays;
import java.util.Scanner;

class Hotel {
    String hotelName;
    String city;
    int roomCharge;

    void dataOfTheHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the hotel name , city and room charges:  ");
        hotelName = sc.next();
        city = sc.next();
        roomCharge = sc.nextInt();
    }

    void DisplayData() {
        System.out.println(hotelName + "\t" + city + "\t" + roomCharge);
    }
}

class Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int l = sc.nextInt();
        Hotel data[] = new Hotel[l];
        {
            for (int i = 0; i < l; i++) {
                data[i] = new Hotel();
                data[i].dataOfTheHotel();
            }
            System.out.println("~~~~~~~~~~~~~~~~~~HOTEL DATA~~~~~~~~~~~~~~~~~~");
            for (int i = 0; i < l; i++) {
                data[i].DisplayData();
            }
            Hotel tmp;
           for (int j = 0; j < l; j++) {
                for (int i = 0; i < l - 1; i++) {
                   if (data[i].roomCharge > data[i + 1].roomCharge) {
                        tmp = data[i];
                        data[i] = data[i + 1];
                        data[i + 1] = tmp;
                    }
                }
           }
            System.out.println("The sorted form of the hotels is : ");
            for (int i = 0; i < l; i++) {
                data[i].DisplayData();
            }
        }

    }
}


