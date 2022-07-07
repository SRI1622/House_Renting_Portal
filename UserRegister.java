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
		System.out.println("Registered Completely.");
		
	}

	
	@Override
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
	static String location;
	static String city;
	static int squareFeet;
	static String type;
	static String  rent;
	static int ownerId;
	static String i;
	public LandReg(String a,String b,int c,String d,String e,int f) {
		location=a;
		city=b;
		squareFeet=c;
		type=d;
		rent=e;
		ownerId=f;
		
	}
	@Override
	public String toString() {
		return "Location: " + location + 
				"\nCity	: " + city + 
				"\nSquareFeet: " + squareFeet+ 
				"\nType	: "+ type + 
				"\nRent	: "+ rent + 
				"\nOwnerId	: " + ownerId ;
	}
	


}
