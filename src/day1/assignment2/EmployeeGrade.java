package day1.assignment2;
/*
 * This Java file is a program to calculate the average feedback
 * of 5 employees and determine their grade
 */
/*
 * This class will display the grade of 5 employees according 
 * to their feedback.
 * Date: <<06/16/2019>>\
 * @author <<Tara>>
 * @version 1.0
 */
public class EmployeeGrade {
/*
 * Calculates the average feedback of 5 employees and determines
 * their grade
 * @param args: Command line arguments
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int employeeId[]= {1001,1002,1003,1004,1005};
		float customer1Feedback[]= {4.1f,3.8f,2.5f,4.9f,3.9f};
		float customer2Feedback[]= {3.1f,4.8f,2.5f,3.9f,4.1f};
		float customer3Feedback[]= {3.8f,3.48f,2.5f,4.1f,3.2f};
		//float customer4Feedback[]= {3.1f,3.8f,3.5f,3.9f,3.9f};
		//float customer5Feedback[]= {4.1f,4.8f,4.5f,4.9f,4.9f};
		float averageFeedback[]= new float[5];
		char grade[]=new char[5];
		for(int i = 0;i<customer1Feedback.length;i++) {
			averageFeedback[i]=(float) ((customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3.0);
			if(averageFeedback[i]>=4.0) {
				grade[i]='A';
			}
			else if(averageFeedback[i]>3.5) {
				grade[i]='B';
			}
			else if(averageFeedback[i]>3.0) {
				grade[i]='C';
			}
			else {
				grade[i]='D';
			}
			System.out.println("Average feedback of employee number "+employeeId[i]+" is "+averageFeedback[i]+" and grade is "+grade[i]);
		}
		

	}

}

