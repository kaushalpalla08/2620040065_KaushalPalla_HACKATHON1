import java.util.Scanner;
class Hackathon2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter WasteCollected: ");
        int WasteCollected = scan.nextInt();

        if (WasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        
    }
}