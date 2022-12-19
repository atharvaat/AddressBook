package com.bridgelabz.addressbooksystems;
import java.util.List;
public class AddressBookIF {
	void operation();
    void addContact();
    void deletePerson();
    void displayContents();
    void editPerson();
    void writeToAddressBookFile();
    List<String> readDataFromFile();
}