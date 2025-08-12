package participantPack;
import register.Registration;
import java.util.Scanner;
public class Participant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("#######################################");
        System.out.println("WELCOME TO SUKANEKA TAMAN CAHAYA SURIA");
        System.out.println("#######################################");

        Registration reg = new register.Registration();
        reg.register(scan);
        
        char answ;
        do {
            answ = participant(scan, reg);
        } while (answ == 'y' || answ == 'Y');
    }
    public static char participant(Scanner scan, Registration reg) {
        char answ;
        System.out.println("\n**********************************************");
        System.out.println("The number of registration participant today " + reg.parCount);
        System.out.println("**********************************************");
        
        System.out.print("\nNext Registration Y/N ? ");
        answ = scan.next().charAt(0);
        
        if (answ == 'y' || answ == 'Y') {
            reg.register(scan);
        } 
        else if (answ == 'n' || answ == 'N') {
            
            System.out.println("---------------------");
            System.out.println("** LIST OF PARTICIPANTS FOR SUKANEKA TAMAN CAHAYA SURIA " + reg.parCount + " **");

            System.out.println("No\t\tName\t\tMyKID");

            for (int i = 0; i < reg.parCount; i++) {
                System.out.println((i + 1) + "\t\t" + reg.parName[i] + "\t\t" + reg.parMykid[i]);
            }
            System.out.println("THANK YOU :)");
        }
    return answ;
    }
}

/*package participantPack;
import register.Registration;
import java.util.Scanner;
public class Participant {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("#######################################");
        System.out.println("WELCOME TO SUKANEKA TAMAN CAHAYA SURIA");
        System.out.println("#######################################");
        Registration reg = new register.Registration();
        reg.register();
    }
    public char participant() {

        Scanner scan = new Scanner(System.in);
        char answ;
        Registration reg = new register.Registration();
        do {
        
            System.out.println("Next Registration Y/N ?");
            answ = scan.next().charAt(0);
            if (answ == 'y' || answ == 'Y') {
                reg.register();
                
            }
            else if (answ == 'n' || answ == 'N') {
            System.out.println("**********************************************");
            System.out.println("The number of registration participant today " + reg.parCount);
            System.out.println("**********************************************");

            System.out.println("---------------------");
            System.out.println("** LIST OF PARTICIPANTS FOR SUKANEKA TAMAN CAHAYA SURIA " + reg.parCount+ "**");

            System.out.println("No\t\tName\t\tMyKID");
            
                for (int i = 0; i < reg.parCount; i++) {
                System.out.println((i + 1) + "\t\t" + reg.parName[i] + "\t\t" + reg.parMykid[i]);
                }
            System.out.println("THANK YOU :)");
            }
        } while (answ == 'y' || answ == 'Y');
        return 'n';
    }
}*/



