package assignment5;

import java.util.*;

class UserRegister {
	String Name;
	String EmailId;
	String PassWord;
	String PhoneNumber;
	String UserType;
	int OwnerId;
	Scanner sc = new Scanner(System.in);

	public UserRegister(String name,String emailId,String password,String phonenumber,String usertype,int ownerid) {
		this.Name = name;
		this.EmailId=emailId;
		this.PassWord=password;
		this.PhoneNumber=phonenumber;
		this.UserType=usertype;
		this.OwnerId=ownerid;
		
		
	}

	
	public String toString() {
		if(UserType=="Owner") {
		return "Name		: " + Name + 
				"\nEmailId		: " + EmailId + 
				"\nPassWord	: " + PassWord + 
				"\nPhoneNumber	: " + PhoneNumber + 
				"\nUserType	: " + UserType +
				"\nOwnerId		: " + OwnerId ;
		}
		else {
			return "Name		: " + Name + 
					"\nEmailId		: " + EmailId + 
					"\nPassWord	: " + PassWord + 
					"\nPhoneNumber	: " + PhoneNumber + 
					"\nUserType	: " + UserType ;
		}
	}
}


class LandReg{
	 String location;
	 String city;
	 int squareFeet;
	 String type;
	 String  rent;
	 int ownerId;
	public LandReg(String Location,String City,int SquareFeet,String Type,String Rent,int OwnerId) {
		location=Location;
		city=City;
		squareFeet=SquareFeet;
		type=Type;
		rent=Rent;
		ownerId=OwnerId;
		
	}
	
	public String toString() {
		return "Location: " + this.location + 
				"\nCity	: " + this.city + 
				"\nSquareFeet: " + this.squareFeet+ 
				"\nType	: "+ this.type + 
				"\nRent	: "+ this.rent + 
				"\nOwnerId	: " + this.ownerId ;
	}

}
