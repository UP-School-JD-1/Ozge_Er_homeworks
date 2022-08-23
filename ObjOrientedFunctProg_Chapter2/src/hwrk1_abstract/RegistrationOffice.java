package hwrk1_abstract;

public class RegistrationOffice {

	public static void main(String[] args) {
		RegistrationOffice rOffice = new RegistrationOffice();
		PhdStudent phdStudent = new PhdStudent(3, "hardware" ,"feyza", "motor drivers", "Yılmaz", 852, true);
		MasterStudents masterStudents = new MasterStudents(2, "Artifical Intelligent", "Cemil", "Halime Karakuzu", "Artifical Neural Networks", 789);
		MasterStudents masterStudents2 = new MasterStudents(2, "Artifical Intelligent", "Fatma", "Halime Karakuzu", "Artifical Neural Networks", 788);
		VocationalStudent vocationalStudent = new VocationalStudent(1, "Electrics","Taha", 152);
		UndergraduateStudents undergraduateStudents = new UndergraduateStudents(452, "OTOMATIC CONTROL","KORAY","NO MINOR",563);
		rOffice.registerStudent(masterStudents);
		space();
		rOffice.registerStudent(masterStudents2); //hashcode ların farklı oldugu gormek için iki tane aynı tip nesne gonderdim.
		space();
		rOffice.registerStudent(vocationalStudent);
		space();
		rOffice.registerStudent(undergraduateStudents);
		space();
		rOffice.registerStudent(phdStudent);
	}

	public static void space(){
		System.out.println("\n");
	}

	public void registerStudent(Students student) {
		//downcasting. burada ozelden genele gitmeliyiz.
		if (student instanceof VocationalStudent) {
			VocationalStudent v1 = (VocationalStudent) student;
			v1.register();
			System.out.println(v1.getName() + " is a vocational student.");
			System.out.println("His area: " + v1.getMajor());
			System.out.println("HashCode:"+v1.hashCode());

		} else if (student instanceof UndergraduateStudents) {
			UndergraduateStudents u1 = (UndergraduateStudents) student;
			u1.register();
			System.out.println(u1.getName() + " is a undergraduate student.");
			System.out.println("His area: " + u1.getMajor());
			System.out.println("HashCode:"+u1.hashCode());

		}
		//***** BURASI ONEMLI. SUBCLASS IN SUBCLASS LARI.
		else if (student instanceof GraduateStudent) {
			if (student instanceof PhdStudent) {
				PhdStudent p1 = (PhdStudent) student;
				if (p1.qualifyingExamTaken) {
					p1.register();
					System.out.println("HashCode:"+p1.hashCode());
				} else {
					System.out.println("Registration of student who have NOT " + p1.getName() + " name has completed.");
				}
			} else if (student instanceof MasterStudents) {
				MasterStudents m1 = (MasterStudents) student;
				m1.register(); // burada subclass icine register yazmadim. override etmeyince topclasstan aldığını görmek için.
				System.out.println(m1.getName() + " is a undergraduate student.");
				System.out.println("HashCode:"+m1.hashCode());
				System.out.println(m1.equals(m1));
			}

			else if (student instanceof Students) {
				System.out.println("Registration of student who have " + student.getName() + " name has completed.");
			}

		}
	}
}

