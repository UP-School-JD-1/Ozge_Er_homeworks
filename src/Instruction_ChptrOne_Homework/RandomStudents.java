package ChapterOne_Homework;

public class RandomStudents {
	public Students getAStudent() {
		Students s=null;
		int i =(int) (6*Math.random());
		
		switch(i) {
		case 0:
			s=new Students(374, 2, "science","melike");
			break;
		case 1:
			s=new VocationalStudent(178, 1, "electric machines","anil");
			break;
		case 2:
			s=new GraduateStudent(1256, 3, "computer science","ozge", "ugur arifoglu","oop");
			break;
		case 3:
			s=new UndergraduateStudents(16000027, 4, "feyza", "iclal yilmaz","there is no minor");
			break;
		case 4:
			s=new MasterStudents(45670023, 2,"electronics","veli","image processing","fatih korkmaz");
			break;
			
		case 5:
			s=new PhdStudent(456892, 3, "motor drives","ugur gokmen","design motor drives", "ayhan turk", false);
			break;
		}
		
		return s;	
	}

}
