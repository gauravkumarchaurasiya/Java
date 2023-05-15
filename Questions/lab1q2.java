// WAP ot capture command line arguments and print the same on scree.
public class lab1q2 {
    public static void main(String[] args) {
        // System.out.println(" Hello Gaurav!");
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments provided.");
        }
    }
}
