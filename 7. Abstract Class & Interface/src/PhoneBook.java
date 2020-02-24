
import java.util.ArrayList;
import java.util.Comparator;

public class  PhoneBook extends Phone implements PhoneFunction{
    private ArrayList<Phone> phoneBook;
    public PhoneBook(){
        this.phoneBook = new ArrayList<>();
    }

    public void displayPhoneBook(){
        for (Phone phone : phoneBook){
            System.out.println("name:"+ phone.getName() +"Phone Number:" + phone.getPhoneNumber());
        }
    }


    @Override
    public void insertPhone(String name, String phoneNumber) {
        Phone newPhone = new Phone(name, phoneNumber);
        phoneBook.add(newPhone);
        System.out.println("Add Complete");

    }

    @Override
    public void removePhone(String name, String phoneNumber) {
        boolean isHasPhone = false;
        for (Phone phone : phoneBook) {
            if (phone.getName().equals(name)) {
                phoneBook.remove(phone);
                System.out.println("has been remove ^^");
                isHasPhone = true;

                break;
            }
        }
        if (!isHasPhone) {
            System.out.println("Your phone Exist! please try again!");
        }
    }


    @Override
    public void updatePhone(String name, String phoneNumber) {
        boolean isHasPhone = false;
        for (Phone phone : phoneBook) {
            if (phone.getName().equals(name)) {
                phone.setName(name);
                phone.setPhoneNumber(phoneNumber);
                System.out.println("Update complete :3");
                isHasPhone = true;
                break;
            }
        }
        if (!isHasPhone) {
            System.out.println(" Your phone Exist! :(( ");
        }
    }



    @Override
    public void searchPhone(String name) {
        boolean isHasPhone = false;
        for (Phone phone : phoneBook) {
            if (phone.getName().equals(name)) {
                System.out.println("Your phone: \n" + phone.toString());
                isHasPhone = true;
                break;
            }
        }
        if (!isHasPhone) {
            System.out.println("Sorry, your phone Exist! ");
        }
    }



    @Override
    public void sortPhone() {
        if (phoneBook.size() > 0) {
            phoneBook.sort(
                    new Comparator<Phone>() {
                        @Override
                        public int compare(final Phone object1, final Phone object2) {
                            return object1.getName().compareTo(object2.getName());
                        }
                    }
            );
        }
        System.out.println("Sort Complete !");
    }
}



