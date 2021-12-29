package builder;

public class Form {

    private String lastName;
    private String firstName;
    private String otherName;
    private String nextOfKin;
    private String mothersMaidenName;
    private String nationalId;
    private String phoneNumber;
    private String email;
    private String occupation;

    public Form(FormBuilder formBuilder) {
        this.lastName = formBuilder.lastName;
        this.firstName = formBuilder.firstName;
        this.otherName = formBuilder.otherName;
        this.nextOfKin = formBuilder.nextOfKin;
        this.mothersMaidenName = formBuilder.mothersMaidenName;
        this.nationalId = formBuilder.nationalId;
        this.phoneNumber = formBuilder.phoneNumber;
        this.email = formBuilder.email;
        this.occupation = formBuilder.occupation;
    }

    @Override
    public String toString() {
        return "Form{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", otherName='" + otherName + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                ", mothersMaidenName='" + mothersMaidenName + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public static class FormBuilder {
        private String lastName;
        private String firstName;
        private String otherName;
        private String nextOfKin;
        private String mothersMaidenName;
        private String nationalId;
        private String phoneNumber;
        private String email;
        private String occupation;

        public FormBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public FormBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public FormBuilder otherName(String otherName){
            this.otherName = otherName;
            return this;
        }
        public FormBuilder nextOfKin(String nextOfKin){
            this.nextOfKin = nextOfKin;
            return this;
        }
        public FormBuilder mothersMaidenName(String mothersMaidenName){
            this.mothersMaidenName = mothersMaidenName;
            return this;
        }
        public FormBuilder nationalId(String nationalId){
            this.nationalId = nationalId;
            return this;
        }
        public FormBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public FormBuilder email(String email){
            this.email = email;
            return this;
        }
        public FormBuilder occupation(String occupation){
            this.occupation= occupation;
            return this;
        }
        public Form build(){

            return new Form(this);
        }

    }
}
