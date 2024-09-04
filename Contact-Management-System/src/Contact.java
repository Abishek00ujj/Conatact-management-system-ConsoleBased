public class Contact {
    String name;
    String phoneNumber;
    String eMail;
    Contact(String name,String phoneNumber,String eMail) {
        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
