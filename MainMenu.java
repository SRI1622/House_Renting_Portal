package assignment5;
import java.util.*;


class Registering {
	ArrayList<UserRegister> User = new ArrayList<>();
	ArrayList<UserRegister> registers = new ArrayList<>();
	ArrayList<UserRegister> displayRegister = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	public void DisplayUser(UserRegister l) {
		User.add(l);
		System.out.println("Registered Completely.");
		System.out.println("You want to display User History : \n1.Yes \n2.No");
		int number = sc.nextInt();
		if(number==1) {
			for(UserRegister user : User) {
				System.out.println(user);
				System.out.println("-----------------------------------------------------------------");
			}
		}
		else
			System.out.println("-----------------------------------------------------------------");
			
	}
	
	public void addRegisters(UserRegister k) {
		registers.add(k);
	}
	public void DisplayRegisters() {
		
		System.out.println("You want to display Register History : \n1.Yes \n2.No");
		int number = sc.nextInt();
		if(number==1) {
			for(UserRegister u : registers) {
				System.out.println(u);
	
				System.out.println("-----------------------------------------------------------------");
			}
		}
		else
			System.out.println("-----------------------------------------------------------------");
		
	}
}

class NewUserRegister extends Registering {
	
	String User_Type;
	static int User_Id=3;
	
	public UserRegister userregisterprocess() {
		System.out.println("Enter Your Full Name : ");
		String Name = sc.next();
		System.out.println("Enter Your Email Id : ");
		String EmailId = sc.next();
		System.out.println("Enter Your Phone Number : ");
		String PhoneNumber = sc.next();
		System.out.println("Create New Password : ");
		String Password = sc.next();
		System.out.println("Enter The Type : \n1. Admin\n2. Owner\n3. Tenant\n4. Approver");
		int Type = sc.nextInt();
		switch(Type) {
		case 1:
			User_Type = "Admin";
			break;
		case 2:
			 User_Id++;
			 User_Type = "Owner";
			break;
		case 3:
			 User_Type = "Tenant";
			break;
		case 4:
			 User_Type = "Approver";
			break;
		}
		
		UserRegister NewuserRegister = new UserRegister(Name,EmailId,Password,PhoneNumber,User_Type,User_Id);
		return NewuserRegister;
	}
}

class MenuOption extends NewUserRegister{
	public void RegisterOption() {
		MenuOption menu = new MenuOption();
		boolean loop = true;
		while(loop) {
		System.out.println("Choose You are....\n1. New User\n2. Already Register\n3. Exit");
		int choice = sc.nextInt();
		
		switch(choice) {
			
			case 1 : {
				UserRegister e =menu.userregisterprocess();
				DisplayUser(e);
				addRegisters(e);
				break;
				}
		
			case 2: {
				UserRegister Register1 = new UserRegister("Lucifer","lucifer@gmail.com","9876543210","luci@123","Owner",1);
				addRegisters(Register1);
				
				UserRegister Register2 = new UserRegister("Peter Parker","perterparker@gmail.com","1234567890","peter@123","Owner",2);
				addRegisters(Register2);
				
				UserRegister Register3 = new UserRegister("Tony Stark","tonystark@gmail.com","1234509876","tony@123","Owner",3);
				
				
				System.out.println("Enter Your EmailId : ");
				String EmailId = sc.next();
				System.out.println("Enter Your PassWord : ");
				String Password = sc.next();
				System.out.println("Enter The Type : \n1. Admin\n2. Owner\n3. Tenant\n4. Approver");
				int UserType = sc.nextInt();
				PortalApplication portal = new PortalApplication();
				switch(UserType) {
					case 1:
						portal.Admin_Menu();
						break;
					case 2:
						portal.Owner_Menu();
						break;
					case 3:
						portal.Tenant_Menu();
						break;
					case 4:
						portal.Approver_Menu();
						break;
					}
				DisplayRegisters();
				break;
				}
		
			case 3: {
				loop = false;
				break;
				}
		
			}
		} 
		
	}
}

public class MainMenu {

	public static void main(String[] args) {
		MenuOption menuoption = new MenuOption();
		menuoption.RegisterOption();
		
	}

}
