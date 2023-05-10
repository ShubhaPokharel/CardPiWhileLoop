import java.util.Scanner;
class CardPinWhileloop{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int pin = 4444;

	for(i = 1; i <=4; i++){
		System.out.println("Enter your pin number");
		int ipin = s.nextInt();
		if(ipin == pin){
			System.out.println("You pin is correct");
			break;
		}
		else{
			System.out.println("Your pin is wrong!!!!!!");
		}
		if(i == 4){
			System.out.println("your attempts are gone...");
			break;
		}
		}
	}
}