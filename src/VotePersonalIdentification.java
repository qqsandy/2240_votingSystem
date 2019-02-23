public class VotePersonalIdentification {
    private String voterLastName, voterFirstName, voterAddress, voterCity, voterPostalCode;
    private int voterSIN, voterID;


    VotePersonalIdentification() {
        this.voterLastName = "Jenkins";
        this.voterFirstName = "Leroy";
        this.voterAddress = "1600 West Bank Drive";
        this.voterCity = "Peterborough";
        this.voterPostalCode = "K9J 0G2";
        this.voterSIN = 000000000;
    }

    // arg constructor that allows for subclasses to take the super of this.
    VotePersonalIdentification(String voterLastName, String voterFirstName, String voterAddress, String voterCity, String voterPostalCode, int voterSIN) {
        this.voterLastName = voterLastName;
        this.voterFirstName = voterFirstName;
        this.voterAddress = voterAddress;
        this.voterCity = voterCity;
        this.voterPostalCode = voterPostalCode;
        this.voterSIN = voterSIN;
    }

    // Might switch to this.XXX??
    @Override
    public String toString() {
        String vString = "Voter(s) Information: ";
        vString += ("First name: " + voterFirstName + "Last name: " + voterLastName + "Address: " + voterAddress + "City: " + voterCity + "Postal Code: " + voterPostalCode + "ID: " + voterID);
        return vString;
    }

    // ALL VALIDATION USED WITH REGEX TO VALIDATE FORMAT STRING OF THE VOTER'S INFORMATION.
    public boolean validateFirstName(String voterFirstName) {
        return voterFirstName.matches("^[a-zA-Z-]+$");
    }

    public boolean validateLastName(String voterLastName) {
        return voterLastName.matches("^[-a-zA-Z-]+$");
    }

    public boolean validateAddress(String voterAddress) {
        return voterAddress.matches("^[\\w\\s]+$");
    }

    public boolean validatePostalCode(String voterPostalCode) {
        return voterPostalCode.matches("^[\\w\\s]{0,7}+$");
    }

    public boolean validateCity(String voterCity) {
        return voterCity.matches("^[a-zA-Z\\s]+$");
    }

    // comment later ( might need to fix. ) ***
    public boolean validateSIN(String voterSIN) {
        return voterSIN.matches("^[\\d+]{9,}+$");
    }
        public String successfullyRegistered () {
            return "Successfully Registered";
        }

   /* // Should return a unique Id per voter
    public String voterID(){
        int i =0;
        voterID=Integer.toString(i++);
        return this.voterID;
    }
*/

        // Setters and Getters for each of the private fields

        public void setVoterID (String voterID){
            this.voterLastName = voterID;
        }
        public void setVoterLastName (String voterLastName){
            this.voterLastName = voterLastName;
        }

        public String getVoterLastName () {
            return voterLastName;
        }

        public void setVoterFirstName (String voterFirstName){
            this.voterFirstName = voterFirstName;
        }

        public String getVoterFirstName () {
            return voterFirstName;
        }

        public void setVoterAdress (String voterAddress){
            this.voterAddress = voterAddress;
        }

        public String getVoterAdress () {
            return voterAddress;
        }

        public void setVoterCity (String voterCity){
            this.voterCity = voterCity;
        }

        public String getVoterCity () {
            return voterCity;
        }

        public void setVoterPostalCode (String voterPostalCode){
            this.voterPostalCode = voterPostalCode;
        }

        public String getVoterPostalCode () {
            return voterPostalCode;
        }

        public void setVoterSIN (Integer voterSIN){
            this.voterSIN = voterSIN;
        }

        public Integer getVoterSIN () {
            return voterSIN;
        }
    }