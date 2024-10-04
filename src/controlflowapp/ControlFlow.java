package controlflowapp;

public class ControlFlow {

	public static void main(String[] args) {
		// control flow statement
//		
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(i);
//			if(i==3) {
//				i++;
//				continue;
//				
//				
//			}
//			 
//		} 
//		
		
		String[] student_names= {"jorome","daphine","moses","mosh"};
		System.out.println(student_names.length);
		for(int i=0; i<student_names.length;i++) {
			System.out.println(student_names[i]);
		}
		
	}

}
