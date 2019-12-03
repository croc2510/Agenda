package com.softtek.java.temporal;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServiceDataMemoryImp;
public class Contacts {
	private Contact contact;
	private Contact friend;

	public static void main(String[] args) {
		Contacts p = new Contacts();
		p.crearContactos();
		
		ContactServiceData csd = new ContactServiceDataMemoryImp();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);
		
		Contact[] contacts = csd.findAll();
		for(Contact c: contacts) {

			System.out.println(c);
		}
	}
	public void crearContactos(){
		contact = new Contact();
		contact.setFirstName("Jose");
		contact.setLastName("Amatitla");
		contact.setMotherName("Diaz");
		contact.setPhoneNumber("10000000");
		contact.setEmail("jose.amatitla@softtek.com");
		friend = new Contact("1","Derian","Rodriguez", "Ramirez",
				"derian.rodriguez@softtek.com","00000000",ContactType.FRIEND);
		System.out.println(contact);
		System.out.println(friend);
	}
}