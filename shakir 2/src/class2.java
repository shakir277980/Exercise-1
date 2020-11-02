import java.util.*;

public class class2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	
		printName();
		printAge();
		printGrade();
		printGpa();
		printCitizen();
		printGender();
		printMarital();
		printWork();
		printHp();
		printLanguage();
		printSkill();
		printBirthday();
		printAward();
		printHomeAddress();
		input.close();
		
	}
	public static void printName() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Name: " + name);
		input.close();
	
		}
	public static void printAge() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.println("Age: " + age);
		input.close();
	
	    }  
		
	public static void printGrade() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your STIA1113: ");
		String str = input.nextLine();
		char grade = str.charAt(0);
		System.out.println("Grade STIA1113: " + grade);
		input.close();
	
		}  
	
	public static void printGpa() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter Gpa semester 1: ");
		double sem1 = input.nextDouble();
		System.out.print("Enter Gpa semester 2: ");
		double sem2 = input.nextDouble();
		
		double sum = sem1 + sem2;
		double totalgpa = sum/2	;	
				
		System.out.println("CGPA for current semester " + totalgpa);
		input.close();
		
	   }
	
	public static void printCitizen() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your citizen: ");
		String citizen = input.nextLine();
		System.out.println("Citizen: " + citizen);
		input.close();
		
	   }
	
	public static void printGender() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your Gender: ");
		String str = input.nextLine();
		char gender = str.charAt(0);
		System.out.println("Gender: " + gender);
		input.close();
	
	}
	
	public static void printMarital() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your marital: ");
		String marital = input.nextLine();
		System.out.println("Marital: " + marital);
		input.close();
	
	}
	
	public static void printWork() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your work: ");
		String work = input.nextLine();
		System.out.println("Work: " + work);
		input.close();
	
	}
	
	public static void printHp() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your hp: ");
		int hp = input.nextInt();
		System.out.println("Hp: " + hp);
		input.close();
	
    }  
	
	public static void printLanguage() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your language1: ");
		String language1 = input.nextLine();
		System.out.print("Enter your language2: ");
		String language2 = input.nextLine();
		System.out.println("language: " + language1 + language2);
		input.close();
	
	}
	
	public static void printSkill() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your skill1: ");
		String skill1 = input.nextLine();
		System.out.print("Enter your skill2: ");
		String skill2 = input.nextLine();
		System.out.print("Enter your skill3: ");
		String skill3 = input.nextLine();
		System.out.print("Enter your skill4: ");
		String skill4 = input.nextLine();
		System.out.println("skill: " + skill1 + skill2 + skill3 + skill4);
		input.close();
	
	}
	
	public static void printBirthday() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your birthday: ");
		String birthday = input.nextLine();
		System.out.println("Birthday: " + birthday);
		input.close();
	
		}
	
	public static void printAward() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your award1: ");
		String award1 = input.nextLine();
		System.out.print("Enter your award2: ");
		String award2 = input.nextLine();
		System.out.println("award: " + award1 + award2);
		input.close();
	
	}
	
	public static void printHomeAddress() {
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter your homeaddress: ");
		String homeaddress = input.nextLine();
		System.out.println("homeaadress: " + homeaddress);
		System.out.println();
		input.close();

		}
	
	
	
}
		
