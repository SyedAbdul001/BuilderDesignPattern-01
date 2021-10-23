package com.tahauddin.syed;

/**
 * 
 * @author Syed Tahauddin
 *
 */
public class App {

	public static void main(String[] args) {
		
		
		// builder design pattern
		Phone phone = new Phone.PhoneBuilder()
		.setPhoneId(101)
		.setPhoneName("Samsung")
		.setPhoneOS("Android 9.0")
		.buildPhone();
		
		System.out.println(phone);
	}

}
