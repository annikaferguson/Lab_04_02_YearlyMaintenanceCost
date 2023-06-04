public class Main {
    public static void main(String[] args) {
        double summerCost = 1000.0;
        double fallCost = 892.54;
        double winterCost = 1234.5;
        double springCost = 899.29;
        double yearlyCost = 0;

        yearlyCost = summerCost + fallCost + winterCost + springCost;
        System.out.println("The yearly home maintenance cost is " + yearlyCost);
    }
}