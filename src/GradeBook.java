import java.util.Scanner;
public class GradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Studentname[]= new String [100];

		String Grades [] =new String [100];

		String Gender []= new String [100];
		String Major [] = new String [100];

		String Origin [] = new String [100];
		int score []= new int[100];

		Scanner keyboard = new Scanner(System.in);

		double sumMales =0;
		double sumFemales =0;

		int counter =0;

		double AverageFemale =0.00;
		double AverageMale =0.00;
		int sumState=0;
		int sumMajor=0;
		double sumStateDC=0;
		double sumStateVA=0;
		double sumStateMD=0;
		int sumMajorCS=0;
		int sumMajorEE=0;
		int sumMajorEco=0;
		double AverageStateVA =0;
		double AverageStateDC=0;
		double AverageStateMD=0;
		double AverageEco=0;
		double AverageCS=0;
		double AverageEE=0;
		int Totalrecords=0;
		
		
		for (int i=0; i <= counter; i++){

			System.out.println("Would you like to enter records");
			String answer = keyboard.next();

			if( answer .equalsIgnoreCase("Yes")) {
				System.out.println("Enter the Student Name ");

				Studentname[i] = keyboard.next();

				System.out.println("Enter the student Gender");
				Gender[i]= keyboard.next();

				System.out.println("Enter the student grade ");
				Grades[i]= keyboard.next();

				System.out.println("Enter the Major ");
				Major [i]=keyboard.next();

				System.out.println("Enter the origin");
				Origin[i]= keyboard.next();

				System.out.println("Enter the score");
				score[i]= keyboard.nextInt();


			}

			else if (answer .equalsIgnoreCase("No")) {
				int numberofMales=0;
				int numberofFemales=0;
				int stateMD =0;
				int stateVA=0;
				int stateDC=0;
				int majorE =0;
				int majorCS =0;
				int majorEE=0;
						
				
				for (int j=0; j < counter; j++){
					if (Gender[j] .equalsIgnoreCase("M")){
						sumMales += score[j];
						numberofMales++;
					}
					else if (Gender[j] .equalsIgnoreCase("F")){
						sumFemales += score[j];
						numberofFemales++ ;
					}

					if (Origin[j] .equalsIgnoreCase("MD")){
						sumStateMD += score[j];
								stateMD++;		
					}
					else if (Origin[j] .equalsIgnoreCase("DC")) {
						sumStateDC += score [j];
						stateDC++;
					}
					else if (Origin[j] .equalsIgnoreCase("VA")){
						sumStateVA += score [j];
						stateVA++;
					}
						

						if (Major[j] .equalsIgnoreCase("Eco")) {
							sumMajorEco += score[j];
							majorE++;
						}
						else if (Major[j] .equalsIgnoreCase("CS")){
							sumMajorCS += score[j];
							majorCS++;
						}
						else if (Major[j] .equalsIgnoreCase("EE")){
							sumMajorEE += score[j];
							majorEE++;
						}
			

					}
				
				Totalrecords =counter;
				System.out.println("Totalrecords= " + Totalrecords);
				if (numberofMales != 0) {
				AverageMale = sumMales/numberofMales;
				System.out.println("The average score of Males is" + AverageMale);				
				}
				if ( numberofFemales != 0){
				AverageFemale = sumFemales/numberofFemales;
				System.out.println("The average score of Female is" + AverageFemale);
				
				}
				
				
				if (stateVA !=0){
					AverageStateVA=sumStateVA/stateVA;
					System.out.println("The average of states VA is  " + AverageStateVA);
				}
					
					if (stateDC !=0){
				
				AverageStateDC=sumStateDC/stateDC;
				System.out.println("The average of state DC is " + AverageStateDC);
					}
				if (stateMD !=0) {
					AverageStateMD=sumStateMD/stateMD;
					System.out.println("The average of MD is " + AverageStateMD);
				}
				
				
				if (majorCS !=0) {
					AverageCS =sumMajorCS/majorCS;
				System.out.println("The average of  CS " + AverageCS);
				}
				
				if (majorEE !=0){
					AverageEE=sumMajorEE/majorEE;
				System.out.println("The average of EE " + AverageEE);
				
				}
				
				if (majorE !=0){
					AverageEco =sumMajorEco/majorE;
			
					System.out.println("The average of Economics " + AverageEco);
				}
			}
			counter ++;		
		}

		

	}
}


