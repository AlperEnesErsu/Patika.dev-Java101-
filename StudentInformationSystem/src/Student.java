
public class Student {
	Course c1;
	Course c2;
	Course c3;
	
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;
	
	Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0.0;
		this.isPass = false;
		
	}
	
	void addBulkExamNote(int note1, int note2, int note3) {
		if (note1 >= 0 && note1<=100) {
			this.c1.note = note1;
		}
		if (note2 >= 0 && note2<=100) {
			this.c2.note = note2;
		}
		if (note3>=0 && note3<=100) {
			this.c3.note = note3;
		}
	}
	
	void isPass() {
		System.out.println("**********************");
		this.avarage = (this.c1.calculateAverage() + this.c2.calculateAverage() + this.c3.calculateAverage())/3.0;
		if (this.avarage> 55) {
			System.out.println("Hababam Sınıfı Uyanıyor !");
			this.isPass = true;
		}else {
			System.out.println("Hababam Sınıfı Sınıfta Kaldı");
			this.isPass = false;
		}
		printNote();
	}
	
	void printNote() {
		System.out.println(c1.name+" Notu:"+c1.calculateAverage());
		System.out.println(c2.name+" Notu:"+c2.calculateAverage());
		System.out.println(c3.name+" Notu:"+c3.calculateAverage());
		System.out.println("Ortalamanız : "+this.avarage);
	}
	
	
}
