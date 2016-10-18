import java.util.*;

public class Studienberatung{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hast du Abitur?");

		String answer = scanner.next();
		if(answer.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			if(answer.equalsIgnoreCase("n")){
				System.out.println("Hast du Berufserfahrung?");	
			}
		}
		else if(answer.equalsIgnoreCase("j")){
			System.ou.println("Auf jeden Fall Studieren");
		}
		else{
			System.out.println("Nicht studieren");
		}
	}
}