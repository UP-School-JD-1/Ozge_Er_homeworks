package hwrk1_abstract;
import java.util.*;
import java.util.Collections;

public class RegistrationOffice {

    public static void main(String[] args) {
        RegistrationOffice rOffice = new RegistrationOffice();
        List<Students> students= new ArrayList<>();
        students.add(new PhdStudent(3, "Hardware Design" ,"Feyza", "Motor Drivers", "Yilmaz", 111, true));
        students.add(new MasterStudents(2, "Artifical Intelligent", "Cemil", "Halime Karakuzu", "Artifical Neural Networks", 222));
        students.add(new MasterStudents(2, "Artifical Intelligent", "Fatma", "Halime Karakuzu", "Artifical Neural Networks", 333));
        students.add(new VocationalStudent(1, "Electrics","Taha", 555));
        students.add(new UndergraduateStudents(452, "OTOMATIC CONTROL","KORAY","NO MINOR",444));
        Comparator<Students> st=new StudentsComparator();
        Collections.sort(students,st);
        students.forEach(System.out::println);
//        Iterator i=students.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        rOffice.registerStudent(masterStudents);
//        space();
//        System.out.println("compare PhdStudent and Master Student:"+phdStudent.compareTo(masterStudents)+"\nPhd no:"+phdStudent.getNo()+"\nMaster no:"+masterStudents.getNo());
//        space();
//        System.out.println("compare MasterStudent2 and MasterStudent1:"+masterStudents2.compareTo(masterStudents)+"\nMaster2 no:"+masterStudents2.getNo()+"\nMaster1 no:"+masterStudents.getNo());
//        space();
//        System.out.println("compare same things:"+vocationalStudent.compareTo(vocationalStudent)+"\nVocational student no:"+vocationalStudent.getNo());
//        space();
//        rOffice.registerStudent(masterStudents2); //hashcode ların farklı oldugu gormek için iki tane aynı tip nesne gonderdim.
//        space();
//        rOffice.registerStudent(vocationalStudent);
//        space();
//        rOffice.registerStudent(undergraduateStudents);
//        space();
//        rOffice.registerStudent(phdStudent);
    }

    public static void space(){
        System.out.println("\n******************");
    }

    public void registerStudent(Students student) {
        //downcasting. burada ozelden genele gitmeliyiz.
        if (student instanceof VocationalStudent) {
            VocationalStudent v1 = (VocationalStudent) student;
            v1.register();
            System.out.println(v1.getName() + " is a vocational student.");
            System.out.println(v1.toString());


        } else if (student instanceof UndergraduateStudents) {
            UndergraduateStudents u1 = (UndergraduateStudents) student;
            u1.register();
            System.out.println(u1.getName() + " is a undergraduate student.");
            System.out.println(u1.toString());

        }
        //***** BURASI ONEMLI. SUBCLASS IN SUBCLASS LARI.
        else if (student instanceof GraduateStudent) {
            if (student instanceof PhdStudent) {
                PhdStudent p1 = (PhdStudent) student;
                if (p1.qualifyingExamTaken) {
                    p1.register();
                    System.out.println(p1.toString());
                    System.out.println(p1.equals(p1));

                } else {
                    System.out.println("Registration of student who have NOT " + p1.getName() + " name has completed.");
                }
            } else if (student instanceof MasterStudents) {
                MasterStudents m1 = (MasterStudents) student;
                m1.register();
                System.out.println(m1.getName() + " is a master student.");
                System.out.println(m1.toString());
                System.out.println(m1.equals(m1));
            }

            else if (student instanceof Students) {
                System.out.println("Registration of student who have " + student.getName() + " name has completed.");
            }

        }
    }
}

