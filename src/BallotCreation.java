import java.util.Scanner;

public class BallotCreation extends VotePersonalIdentification{
    private String ballotName;
    private Candidate[] candidates = new Candidate[10];



    BallotCreation(){
        this.ballotName="Ballot name";
        this.candidates= new Candidate[0];
    }

    BallotCreation(String voterLastName, String voterFirstName, String voterAddress, String voterCity, String voterPostalCode, int voterSIN, String ballotName, Candidate[] candidates){
        super(voterLastName, voterFirstName, voterAddress, voterCity, voterPostalCode, voterSIN);
        this.ballotName= ballotName;
        this.candidates = candidates;
    }

    BallotCreation(VotePersonalIdentification voters, String ballotName, Candidate[] candidates){
        super.setVoterLastName(voters.getVoterLastName());
        super.setVoterFirstName(voters.getVoterFirstName());
        super.setVoterAdress(voters.getVoterAdress());
        super.setVoterCity(voters.getVoterCity());
        super.setVoterPostalCode(voters.getVoterPostalCode());
        super.setVoterSIN(voters.getVoterSIN());
        // this.ballot && candidates? needed????
    }



    public void displayBallot(String ballotName, Candidate candidates[]){
        System.out.println("Ballot Name: "+ballotName+"\nCandidate: "+candidates);
        System.out.println(this.toString());
    }



    public String submitBallot() {
        Scanner vote = new Scanner(System.in);
        String a = "y";
        do {
            System.out.println("Who would you like to vote for?\n" + this.ballotName + "Yes or No?");
            a = vote.nextLine();
            if (a.equals("Yes") || a.equals("yes") || a.equals("YES")) {
                System.out.println("Thank you for voting for" + this.ballotName);
            } else if (a.equals("No") || a.equals("no") || a.equals("NO")) {
                System.out.println("Thank you for your vote");
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }while (a.equalsIgnoreCase("y"));
        return "Thank you for using the voting system!";
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

