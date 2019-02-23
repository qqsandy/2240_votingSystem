import java.util.Scanner;

public class BallotCreation extends VotePersonalIdentification{

    // Private fields from the class diagram
    private String ballotName;
    private Candidate[] candidates = new Candidate[0];

    // No argument constrcutor
    BallotCreation(){
        this.ballotName="Ballot name";
        this.candidates= new Candidate[0];
    }


    // Constructor that takes the super of the super class
    BallotCreation(VotePersonalIdentification voters, String ballotName, Candidate[] candidates){
        this.ballotName=ballotName;
        this.candidates=candidates;
        super.setVoterLastName(voters.getVoterLastName());
        super.setVoterFirstName(voters.getVoterFirstName());
        super.setVoterAdress(voters.getVoterAdress());
        super.setVoterCity(voters.getVoterCity());
        super.setVoterPostalCode(voters.getVoterPostalCode());
        super.setVoterSIN(voters.getVoterSIN());
    }

    // Use to call & print the overwritten toString method
    public void displayBallot(){
        System.out.println(this.toString());
    }

    // This method is used to ask user input for the candidates they wish to vote for by
    // using a do while loop until 'i' which is just a condition based integer used to end the loop
    // is set to 1, whenever a valid vote is submitted. Otherwise will run until user inputs a valid vote.
    public String submitBallot() {
       Scanner userinput = new Scanner(System.in);
       int i = 0;
       do{
           System.out.println("Who would you like to vote for?\n[Vote by entering the number corresponding to the candidates]");
           int vote = userinput.nextInt();
       switch (vote) {
           case 0:
               System.out.println("You've voted for " + candidates[0]);
               i = 1;
               break;
           case 1:
               System.out.println("You've voted for " + candidates[1]);
               i = 1;
               break;
           case 2:
               System.out.println("You've voted for " + candidates[2]);
               i = 1;
               break;
           case 3:
               System.out.println("You've voted for " + candidates[3]);
               i = 1;
               break;
           case 4:
               System.out.println("You've voted for " + candidates[4]);
               i = 1;
               break;
           default:
               System.out.println("Invalid input! Try again.");
               break;
       }
       }while (i == 0);
       return "Thank you for your vote!";
    }

    // A toString method that is overwritten in candidate, this is used to display each of the candidates bio/names
    // to string and allows for print in string until the condition is met; end of candidates list.
    @Override
    public String toString(){
        String ballot = (this.ballotName + "\n");
        for (int i= 0; i < this.candidates.length; i++){
            ballot += ("\n"+ i +".)" + this.candidates[i].getCandidateName() + "\n[Biography]: " + this.candidates[i].getCandidateBiography()+"\n");
        }
        return ballot;
    }

    // Getters  Setters for the private field of BallotCreation
    public void setBallotName(String ballotName){
        this.ballotName=ballotName;
    }
    public String getBallotName(){
        return ballotName;
    }
    public void setCandidates(Candidate[] candidates){
        this.candidates=candidates;
    }
    public Candidate[] getCandidates(){
        return candidates;
    }


}

