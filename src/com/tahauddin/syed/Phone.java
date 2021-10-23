package com.tahauddin.syed;

/**
 * 
 * @author Syed Tahauddin
 * Marked the constructor as private
 * so that Phone object cannot be created by using new keyword.
 * phone object can only be created by calling buildPhone() of PhoneBuilder class
 */
public class Phone {
	
	private Integer phoneId;
	
	private String phoneName;
	
	private Double phonePrice;
	
	private Double phoneScreen;
	
	private String phoneOS;
	
	private Phone() {
	}

	public Integer getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Integer phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public Double getPhonePrice() {
		return phonePrice;
	}

	public void setPhonePrice(Double phonePrice) {
		this.phonePrice = phonePrice;
	}

	public Double getPhoneScreen() {
		return phoneScreen;
	}

	public void setPhoneScreen(Double phoneScreen) {
		this.phoneScreen = phoneScreen;
	}

	public String getPhoneOS() {
		return phoneOS;
	}

	public void setPhoneOS(String phoneOS) {
		this.phoneOS = phoneOS;
	}


	
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneName=" + phoneName + ", phonePrice=" + phonePrice
				+ ", phoneScreen=" + phoneScreen + ", phoneOS=" + phoneOS + "]";
	}



	/**
	 * 
	 * @author Syed Tahauddin
	 *
	 *having the same number of instane variables as same as Phone Class
	 *generating only setter methods but instead returning PhoneBuilder Object instead of void
	 * and calling buildPhone() in the end to create Phone object.
	 */
	public static class PhoneBuilder{
		
		
		private Integer phoneId;
		
		private String phoneName;
		
		private Double phonePrice;
		
		private Double phoneScreen;
		
		private String phoneOS;
		

		public PhoneBuilder setPhoneId(Integer phoneId) {
			this.phoneId = phoneId;
			return this;
		}

		public PhoneBuilder setPhoneName(String phoneName) {
			this.phoneName = phoneName;
			return this;
		}

		public PhoneBuilder setPhonePrice(Double phonePrice) {
			this.phonePrice = phonePrice;
			return this;
		}

		public PhoneBuilder setPhoneScreen(Double phoneScreen) {
			this.phoneScreen = phoneScreen;
			return this;
		}

		public PhoneBuilder setPhoneOS(String phoneOS) {
			this.phoneOS = phoneOS;
			return this;
		}
		
		
		/**
		 * 
		 * creating the Phone() object by new keyword and setting the values to phone 
		 * object and returning phone object
		 */
		public Phone buildPhone() {
			
			Phone phone = new Phone();
			// setting the values to phone object
			phone.setPhoneId(phoneId);
			phone.setPhoneName(phoneName);
			phone.setPhoneOS(phoneOS);
			phone.setPhonePrice(phonePrice);
			phone.setPhoneScreen(phoneScreen);
			
			return phone;
		}
		
		
	}
}
