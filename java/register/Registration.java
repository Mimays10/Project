package register;
import java.util.Scanner;
import participantPack.Participant;

public class Registration {
    public int parCount = 0;
    public String[] parName = new String[100];
    public String[] parMykid = new String[100];

    public void register(Scanner scan) { 
        System.out.print("Please enter participant age : ");
        int age = scan.nextInt(); 
        System.out.println("\nParticipant age : " + age);

        if (age >= 6 && age <= 10) {
            System.out.println("Allow to join the activities.");
            System.out.print("Please enter participant name : ");
            String name = scan.next(); 
            System.out.print("Participant MyKID : ");
            String mykid = scan.next();
            
            
            this.parName[parCount] = name;
            this.parMykid[parCount] = mykid;
            parCount++;

        } else if (age < 6 || age > 10) {
            System.out.println("Participant not allowed to join the activities.");
        } else {
            System.out.println("Please insert an integer value only.");
        }
    }
}

/*package register;
import java.util.Scanner;
import participantPack.Participant;
public class Registration {
        public int parCount = 0;
        public String parName[];
        public String parMykid[];
        public static void register() {
            Participant participant = new Participant();
            String[] parName = new String[10];
            String[] parMykid = new String[10];
            int parCount = 1;

            do {
            System.out.print("Please enter participant age: ");
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();
            System.out.println("\nParticipant age: " + age);
            
            if(age >= 6 && age <= 10) {
                System.out.println("Allow to join the activities.");
                System.out.print("Please enter participant name: ");
                String name = scan.next();
                System.out.print("Participant MyKID: " );
                String mykid = scan.next();
                parCount++;
                participant.participant();
                
                Registration reg = new register.Registration();
                System.out.println("**********************************************");
                System.out.println("The number of registration participant today " + reg.parCount);
                System.out.println("**********************************************");
                name = parName[parCount];
                mykid = parMykid[parCount];
                
            }
            else if(age < 6 || age > 10) {
                System.out.println("Participant not allowed to join the activities.");
                }
            else{
                System.out.println("Please insert an integer value only.");
                }
            }while (participant.participant() == 'n');
        }
}*/



