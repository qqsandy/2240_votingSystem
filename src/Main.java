import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Initiate prompt message for the user
        System.out.println("Welcome to the newly built beta version of the voting system!");

        // Creation of a new object VotePersonalIndentificiation, in this case our 'voters' that are the
        // user that will input their information that will correspond with our private fields in that class
        VotePersonalIdentification voters = new VotePersonalIdentification();

        // Creation of a scanner to take user input
        Scanner scan = new Scanner(System.in);

        // Additional confirmation in case one of the fields were incorrect.
        // It uses a do while loop that will perform the task of asking for user input for their information
        // until all user input is validated as true and the final confirmation is agreed upon by the user.
        // This do-while loop contains a bunch of other do-while loops for each user input information.
        Boolean confirmation = false;
        do {

            // boolean declaration of 'check' to be used to validate user information.
            // string input is for the scanner, user input will be stored in this variable
            // int confirm is used in the last confirmation step in the switch case to verify
            // all user input is correct.
            Boolean check = false;
            String input;
            int confirm;

            // This do-while loop will take the user input(First Name) and store it into 'check' that will be used
            // to call the method 'validate' to validate the credentials of the user input
            // if user input matches the credentials listed in the validation method using regex
            // then and only then will the loop end
            do {
                System.out.println("Please enter your first name: ");
                input = scan.nextLine();
                check = voters.validateFirstName(input);
                if (check == false) {
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterFirstName(input);

            // This do-while loop will take the user input(Last Name) and store it into 'check' that will be used
            // to call the method 'validate' to validate the credentials of the user input
            // if user input matches the credentials listed in the validation method using regex
            // then and only then will the loop end
            do {
                System.out.println("Please enter your Last name: ");
                input = scan.nextLine();
                check = voters.validateLastName(input);
                if (check == false) {
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterLastName(input);

            // This do-while loop will take the user input(Address) and store it into 'check' that will be used
            // to call the method 'validate' to validate the credentials of the user input
            // if user input matches the credentials listed in the validation method using regex
            // then and only then will the loop end
            do {
                System.out.println("Please enter your address: ");
                input = scan.nextLine();
                check = voters.validateAddress(input);
                if (check == false) {
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterAdress(input);

            // This do-while loop will take the user input(City) and store it into 'check' that will be used
            // to call the method 'validate' to validate the credentials of the user input
            // if user input matches the credentials listed in the validation method using regex
            // then and only then will the loop end
            do {
                System.out.println("Please enter your city: ");
                input = scan.nextLine();
                check = voters.validateCity(input);
                if (check == false) {
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterCity(input);

            // This do-while loop will take the user input(Postal Code) and store it into 'check' that will be used
            // to call the method 'validate' to validate the credentials of the user input
            // if user input matches the credentials listed in the validation method using regex
            // then and only then will the loop end
            do {
                System.out.println("Please enter your postal code: ");
                input = scan.nextLine();
                check = voters.validatePostalCode(input);
                if (check == false) {
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            voters.setVoterPostalCode(input);

            // This do-while loop will take the user input(SIN) and store it into 'check' that will be used
            // to call the method 'validate' to validate the credentials of the user input
            // if user input matches the credentials listed in the validation method using regex
            // then and only then will the loop end
            do {
                System.out.println("Please enter your SIN (no spaces): ");
                input = scan.nextLine();
                check = voters.validateSIN(input);
                if (check == false) {
                    System.out.println("*** Error! Invalid input ***");
                }
            } while (check == false);
            int intString = Integer.parseInt(input);
            voters.setVoterSIN(intString);


            // This switch case is in the overall do-while loop and will act as a final confirmation
            // stage, as Although the validation method can catch credential error the methods cannot tell
            // user error such as a typo with names/address/etc. This is the final confirmation to ensure all
            // information is correct.
            // If there are error(s) then the whole do while loop will loop until this confirmation is true.
                System.out.println("Is following information correct? \n 1 = Yes, 2 = No");
                confirm = scan.nextInt();
                switch (confirm){
                    case 1:
                        confirmation = true;
                        voters.successfullyRegistered();
                        System.out.println("Your unique ID is "+voters.voterID());
                        break;
                    case 2:
                        System.out.println("Let's start over then!");
                        confirmation = false;
                        break;
                }
        } while (confirmation == false);



        // The creation of an obect array within the Candidate class
        // This uses the class that had inherited from Ballot > VotePersonalIdenficication.
        // These 5 arrays will act as candidates for the election/voting system.
        Candidate[] candidates = new Candidate[5];
        candidates[0]= new Candidate("John Cena", "You can't see me!, (Green Party)");
        candidates[1]= new Candidate("Leroy Jenkins", "LEEEEROOOOOYYYY JENNNKINSSS!, (Liberal Party)");
        candidates[2]= new Candidate("Aubrey Graham", "Musician turned politician, (New Democratic Party)");
        candidates[3]= new Candidate("Joe Rogen", "Original podcast pioneer, (PC Party)");
        candidates[4]= new Candidate("Justin Trudeau", "The second best Trudeau Prime Minister, (Liberal Party)");

        // A creation of a new object that will create a new ballot for the candidates above, needed to be created
        // after the declaration of the array candidates above.
        // This will create a ballot with the name 43rd Federal election and take the candidates array along with the voters.
        BallotCreation voteBallot = new BallotCreation(voters,"43rd Canadian Federal Election", candidates);

        // Using the object created above we can now use voteBallot to call a method within the same class
        // that being displayBallot which will display the candidates of the array stored into voteBallot above
        voteBallot.displayBallot();

        // This will prompt the user to submit a vote for the candidates printed above
        // By calling the methos submitBallot a case switch is executed to take user input
        System.out.println(voteBallot.submitBallot());

        // Confirmation message for the voter that their votes had been registered.
        System.out.println("Thank you " +voters.getVoterFirstName() +" "+voters.getVoterLastName() + ". Your vote has successfully been registered into our systems.");
    }
}