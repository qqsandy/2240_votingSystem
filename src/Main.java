import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the newly built beta version of the voting system!");
        VotePersonalIdentification voters = new VotePersonalIdentification();
        Scanner scan = new Scanner(System.in);



            Boolean check = false;
            String input;

            // First name
            do {
                System.out.println("Please enter your first name: ");
                input = scan.nextLine();
                check = voters.validateFirstName(input);
                if (check == false){
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterFirstName(input);

            // Last name
            do {
                System.out.println("Please enter your Last name: ");
                input = scan.nextLine();
                check = voters.validateLastName(input);
                if (check == false){
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterLastName(input);

            // Address
            do {
                System.out.println("Please enter your address: ");
                input = scan.nextLine();
                check = voters.validateAddress(input);
                if (check == false){
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterAdress(input);

            // City
            do {
                System.out.println("Please enter your city: ");
                input = scan.nextLine();
                check = voters.validateCity(input);
                if (check == false){
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterCity(input);

            // postal caode
            do {
                System.out.println("Please enter your postal code: ");
                input = scan.nextLine();
                check = voters.validatePostalCode(input);
                if (check == false){
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterPostalCode(input);

            // Last name
            do {
                System.out.println("Please enter your SIN (no spaces): ");
                input = scan.nextLine();
                check = voters.validateSIN(input);
                if (check == false){
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            int intString = Integer.parseInt(input);
            voters.setVoterSIN(intString);

        // Voting
        Candidate[] candidates = new Candidate[]{
                new Candidate("John Cena", "You can't see me!, Green Party"),
                new Candidate("Leroy Jenkins", "LEEEEROOOOOYYYY!, Liberal Party"),
                new Candidate("Aubrey Graham", "Musician turned politician, New Democratic Party"),
                new Candidate("Joe Rogen", "Original podcast pioneer, PC Party"),
                new Candidate("Justin Trudeau", "Secound best Trudeau Prime Minister, Liberal Party")
        };
        BallotCreation voteBallot = new BallotCreation(voters,"Prime Minister", candidates);
        voteBallot.displayBallot("Prime Ministers", candidates);
        System.out.println(voteBallot.submitBallot());
    }
}
