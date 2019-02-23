public class Candidate extends BallotCreation{

    // Private field from class diagram
    private String candidateName;
    private String candidateBiography;

    // An no arg constructor that takes super.
     Candidate(){
         super();
         this.candidateName="Leroy Jenkins";
         this.candidateBiography="Great voice";
    }

    // An argument constructor that is used to iniltalize the instance of the candidate class
    public Candidate(String candidateName, String candidateBiography){
         this.candidateName=candidateName;
         this.candidateBiography=candidateBiography;
    }

    // An toString method that overrides a method in BallotCreation. Used to display candidate's name.
    @Override
    public String toString(){
        return candidateName;
    }

    // Setters and getters of the private fields in this Candidate class
    public void setCandidateName(String candidateName){
         this.candidateName=candidateName;
    }
    public String getCandidateName(){
         return candidateName;
    }
    public void setCandidateBiography(String candidateBio){
         this.candidateBiography=candidateBio;
    }
    public String getCandidateBiography(){
         return this.candidateBiography;
    }

}
