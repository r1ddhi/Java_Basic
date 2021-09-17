import java.util.Scanner;

public class NumOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first three letters of the month and year : ");
        String month = sc.next();
        int year = sc.nextInt();
        if (year % 4 == 0) {
            switch (month) {
                case "january": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "feb": {
                    System.out.println("THERE ARE 29 DAYS IN" + month + " " + year);
                    break;
                }
                case "mar": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "apr": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "may": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "jun": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "jul": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "aug": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "sep": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "oct": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "nov": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "dec": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
            }
        } else {
            switch (month) {
                case "january": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "feb": {
                    System.out.println("THERE ARE 28 DAYS IN" + month + " " + year);
                    break;
                }
                case "mar": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "apr": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "may": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "jun": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "jul": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "aug": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "sep": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "oct": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
                case "nov": {
                    System.out.println("THERE ARE 30 DAYS IN" + month + " " + year);
                    break;
                }
                case "dec": {
                    System.out.println("THERE ARE 31 DAYS IN" + month + " " + year);
                    break;
                }
            }
        }
    }
}
