import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int serialCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < serialCount; i++) {
            String serialName = scan.nextLine();
            double price = Double.parseDouble(scan.nextLine());

            switch (serialName) {
                case "Thrones":
                    price *= 0.5;
                    break;
                case "Lucifer":
                    price *= 0.6;
                    break;
                case "Protector":
                    price *= 0.7;
                    break;
                case "TotalDrama":
                    price *= 0.8;
                    break;
                case "Area":
                    price *= 0.9;
                    break;
            }
            budget -= price;
        }
        if (budget < 0) {
            System.out.println(String.format("You need %.2f lv. more to buy the series!", Math.abs(budget)));
        } else {
            System.out.println(String.format("You bought all the series and left with %.2f lv.", budget));
        }
    }
}
