package bscs;

public class Loops {

    public static void main(String[] args) {
        int ch = 3;
        switch (ch) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            default: {
                System.out.println("Invalid Day number");
            }
        }
        int sum = 0;
        for (int i = 1; i <= 40; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
// System.out.println(i);
        }
        System.out.println("Sum:" + sum);

        int j=10;
        
        while(j>=1)
        {
            System.out.println(j);
            j--;
        }
        
        
    }

}
