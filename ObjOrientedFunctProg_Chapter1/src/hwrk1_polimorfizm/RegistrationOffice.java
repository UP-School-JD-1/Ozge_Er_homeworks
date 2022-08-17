package hwrk1_polimorfizm;

public class RegistrationOffice {
	
	public static void main(String[] args) {
		RegistrationOffice rOffice = new RegistrationOffice();
		RandomStudents randomStudents= new RandomStudents();
		Students s1 = randomStudents.getAStudent();
		rOffice.registerStudent(s1);
		
	}
	
	 public void registerStudent(Students student) {
		 //downcasting. burada ozelden genele gitmeliyiz.
		 
		 if (student instanceof PhdStudent) {
			 PhdStudent p1=(PhdStudent) student;
			 if(p1.qualifyingExamTaken) {
			 System.out.println("Registration of student who have "+p1.getName()+" name has completed.");
			 }
			 else {
				 System.out.println("Registration of student who have NOT "+p1.getName()+" name has completed.");
			 }
		 }
		 
		 	else if(student instanceof GraduateStudent) {
				GraduateStudent g1= (GraduateStudent) student;
				System.out.println("Registration of student who have "+g1.getName()+" name has completed.");
				System.out.println("His thesis: "+g1.getThesis());
				System.out.println("His advisor's name: "+g1.getAdvisor());
				
			}
			else if(student instanceof VocationalStudent) {
				VocationalStudent v1=(VocationalStudent) student;
				System.out.println("Registration of student who have "+v1.getName()+ " name has completed.");
				System.out.println(v1.getName()+ " is a vocational student.");
				System.out.println("His area: "+v1.getMajor());
				
			}
			else if(student instanceof UndergraduateStudents) {
				UndergraduateStudents u1=(UndergraduateStudents) student;
				System.out.println("Registration of student who have "+u1.getName()+ " name has completed.");
				System.out.println(u1.getName()+ " is a undergraduate student.");
			}
			else if(student instanceof Students) {
				System.out.println("Registration of student who have "+student.getName()+ " name has completed.");
			}
		 	
	}

}
