public class Main {
    public static void main(String[] args)
    {
        double costSummer = 853.00;
        double costFall = 906.22;
        double costWinter = 136.90;
        double costSpring = 127.64;
        double totalCost = costFall + costSpring + costWinter + costSummer;
        totalCost = Math.round(totalCost * 100.00) / 100.00;

        System.out.println("Your maintenance cost for summer is " + costSummer);
        System.out.println("Your maintenance cost for spring is " + costSpring);
        System.out.println("Your maintenance cost for fall is " + costFall);
        System.out.println("Your maintenance cost for winter is " + costWinter);
        System.out.println("Your total maintenance cost for the year is " + totalCost);
    }
}