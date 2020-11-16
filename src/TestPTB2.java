import java.util.Scanner;

public class TestPTB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter the c: ");
        double c = scanner.nextDouble();

        PTB2 ptb2 = new PTB2(a,b,c);

        if (ptb2.getDelta() > 0){
            System.out.println("Root 1: "+ptb2.getRoot1());
            System.out.println("Root 2: "+ptb2.getRoot2());
        }else if (ptb2.getDelta() == 0){
            System.out.println("Root 1 = root 2: "+ptb2.getRoot1());
        }else System.out.println("The equation has no roots");
    }
}
