package com.bridgelabz.address_book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program.");
        Contact p1 = new Contact();
        p1.setFirstName("Naman");
        p1.setLastName("Srivastava");
        p1.setPhoneNumber("9651994479");
        p1.setCity("Varanasi");
        p1.setEmail("sri.naman.vastava@gmail.com");
        p1.setAddress("N 11/60 B-4 Mahamoorganj");
        p1.setState("Uttar Pradesh");
        p1.setZip("221010");
        System.out.println(p1);
    }
}
