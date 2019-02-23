public class Candidate extends BallotCreation{

    private String candidateName;
    private String candidateBiography;

     Candidate(){
        this.candidateName="Leroy Jenkins";
        this.candidateBiography="Great voice";
    }

    public Candidate(String candidateName, String candidateBiography){
         this.candidateName=candidateName;
         this.candidateBiography=candidateBiography;
    }

    public void setCandidateName(String candidateName){
         this.candidateName=candidateName;
    }
    public String getCandidateName(){
         return candidateName;
    }
    public void setCandidateBiography(String candidateBio){
         this.candidateBiography=candidateBio;
    }
}
