
public class Student {
	private int studentId;
	private String name;
	private float qualifyingExamMarks;
	private char residentialstatus;
	private int yearOfEngg;
	public Student() {
		
	}
	
	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(float qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public String getResidentialstatus() {
		if(this.residentialstatus == 'H') {
			return "Hostellers";
		}else if(this.residentialstatus == 'D') {
			return "Day Scholar";
		}else{
			return "Other";
		}
	}

	public void setResidentialstatus(char residentialstatus) {
		this.residentialstatus = residentialstatus;
	}

	public int getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	
	
}
