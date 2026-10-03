import java.util.Scanner;
  class Hackathon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter VehicleNumber: ");
        int vehicleNumber = scan.nextInt();
        System.out.println("Vehicle Number: " + vehicleNumber);

        System.out.print("Enter WasteCollected: ");
        int WasteCollected = scan.nextInt();
        System.out.println("Waste Collected: " + WasteCollected);

        System.out.print("Enter CollectionPoints: ");
        int CollectionPoints = scan.nextInt();
        System.out.println("Collection Points: " + CollectionPoints);

        System.out.print("Enter VehicleStatus: ");
        String VehicleStatus = scan.nextLine();
        System.out.println("Vehicle Status: " + VehicleStatus);

    }
  }
