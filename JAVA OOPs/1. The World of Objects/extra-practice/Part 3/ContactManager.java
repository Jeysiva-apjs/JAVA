public class ContactManager {

    private Contact[] contacts;

    public ContactManager(Contact[] inputContact){
        int length = inputContact.length;
        this.contacts = new Contact[length];
        for(int i=0; i<length; i++){
            this.contacts[i] = new Contact(inputContact[i]);
        }
    }

    public Contact getContact(int index){
        return new Contact(this.contacts[index]);

    }

    public void setContact(Contact contact, int index){
        this.contacts[index] = new Contact(contact);
    }

    
}
