public class VotePersonalIdentification {

    // Private fields from class diagram
    private String voterLastName, voterFirstName, voterAddress, voterCity, voterPostalCode;
    private int voterSIN;


    // An no argument constructor
    VotePersonalIdentification() {
        this.voterLastName = "Jenkins";
        this.voterFirstName = "Leroy";
        this.voterAddress = "1600 West Bank Drive";
        this.voterCity = "Peterborough";
        this.voterPostalCode = "K9J 0G2";
        this.voterSIN = 000000000;
    }

    // An arg constructor that is overloaded as their are two constructors. Used when initlized to given parameter value
    VotePersonalIdentification(String voterLastName, String voterFirstName, String voterAddress, String voterCity, String voterPostalCode, int voterSIN) {
        this.voterLastName = voterLastName;
        this.voterFirstName = voterFirstName;
        this.voterAddress = voterAddress;
        this.voterCity = voterCity;
        this.voterPostalCode = voterPostalCode;
        this.voterSIN = voterSIN;
    }

    // An override toString, where overwritten in the subclasses, returns/displays the voters credentials.
    @Override
    public String toString() {
        String vString = "Voter(s) Information: ";
        vString += ("First name: " + this.voterFirstName + "Last name: " + this.voterLastName + "Address: " + this.voterAddress + "City: " + this.voterCity + "Postal Code: " + this.voterPostalCode);
        return vString;
    }


    // ALL VALIDATION USED WITH REGEX TO VALIDATE FORMAT STRING OF THE VOTER'S INFORMATION.

    // In this validate method regex allows for alphabets a-z caps and lower case and -.
    public boolean validateFirstName(String voterFirstName) {
        return voterFirstName.matches("^[a-zA-Z-]+$");
    }

    // In this validate method regex allows for a-z caps/uncaps and -.
    public boolean validateLastName(String voterLastName) {
        return voterLastName.matches("^[-a-zA-Z-]+$");
    }

    // In this validate method regex allows for lettera and numbers but must contain atleast one of each
    public boolean validateAddress(String voterAddress) {
        return voterAddress.matches("^(([a-zA-z]+.*[0-9]+.*)|[0-9]+.*([A-Za-z]+.*)(\\w\\d]*))+$");
    }

    // In this validate method regex allows for digits&letters + whitespace, needs to be at least 6 characters long.
    // Assuming canadian postal codes.
    public boolean validatePostalCode(String voterPostalCode) {
        return voterPostalCode.matches("^[\\w\\s]{6,}+$");
    }

    // In this validate method regex allows for all letters and white spaces
    public boolean validateCity(String voterCity) {
        return voterCity.matches("^[a-zA-Z\\s]+$");
    }

    // In this validate method regex allows for all digits and needs to be 9 digits long.
    public boolean validateSIN(String voterSIN) {
        return voterSIN.matches("^[\\d+]{9,}+$");
    }

    // Just a message used to notify user that they have successfully registered.
        public String successfullyRegistered () {
            return "Successfully Registered";
        }

    // Should return a unique Id per voter starting at 1000 adding +1 for each new voter.
    public String voterID(){
        int counter = 1000;
        Integer unique = new Integer(counter);
        String uniqueID = unique.toString(counter++);
        return uniqueID;
    }


        // Setters and Getters for each of the private fields in this class.
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