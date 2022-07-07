package assignment5;
import java.util.*;


class Registering {
	ArrayList<UserRegister> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void DisplayResult(UserRegister l) {
		list.add(l);
		System.out.println("You want to display User History : \n1.Yes \n2.No");
		int number = sc.nextInt();
		if(number==1) {
			for(UserRegister user : list) {
				System.out.println(user);
				System.out.println("-----------------------------------------------------------------");
			}
		}
	}
	
}
class NewUserRegister extends Registering {
	String User_Type;
	static int owner_Id=0;
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
			 owner_Id++;
			 User_Type = "Owner";
			break;
		case 3:
			 User_Type = "Tenant";
			break;
		case 4:
			 User_Type = "Approver";
			break;
		}
		
		UserRegister NewuserRegister = new UserRegister(Name,EmailId,PhoneNumber,Password,User_Type,owner_Id);
		return NewuserRegister;
	}
}

class MenuOption extends NewUserRegister{
	public void RegisterOption() {
		MenuOption menu = new MenuOption();
		System.out.println("Choose You are....\n1. New User\n2. Already Register");
		int n = sc.nextInt();
		if(n==1) {
			UserRegister e =menu.userregisterprocess();
			DisplayResult(e);
			RegisterOption();
		}
		else {
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
				portal.Owner_Menu(1);
				break;
			case 3:
				portal.Tenant_Menu();
				break;
			case 4:
				portal.Approver_Menu(1);
				break;
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
