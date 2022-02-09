import java.util.Scanner;

public class Atm_Project {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Main_Balance = 10000, Deposit, Withdrow, Balance_Enquiry;
        while (true) {
            System.out.println("===WELCOME===");
            System.out.println("Choose 1 for Withdraw ");
            System.out.println("Chhose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit ");
            System.out.println("Choose the Operation you want to perfom");

            int choise = in.nextInt();
            switch (choise) {
                case 1:
                    System.out.print("Enter money to be withdrow");
                    Withdrow = in.nextInt();
                    if (Main_Balance >= Withdrow) {
                        Main_Balance = Main_Balance - Withdrow;
                        System.out.print("collect your money");
                    } else {
                        System.out.print("Insufficient  balance ");
                    }
                    System.out.println("");
                    break;
                    case 2:
                    System.out.print("Enter money to be deposit ");
                    Deposit=in.nextInt();
                    Main_Balance=Main_Balance+Deposit;
                    System.out.println("Your momey Successfully deposit ");
                    System.out.print(Main_Balance);
                    System.out.println("");
                    break;
                    case 3:
                    System.out.print("Main Balance : "+ Main_Balance);
                    System.out.println("");
                    break;
                    case 4:
                    System.exit(0);;


            }

        }
    }
}