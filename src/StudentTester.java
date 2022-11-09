
public class StudentTester {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setStudentId(1001);
		stu1.setName("Jacob");
		stu1.setQualifyingExamMarks(80);
		stu1.setResidentialstatus('H');
		stu1.setYearOfEngg(3);
		
		System.out.printf("Output:\n\n%-20s:\t%s\n%-20s:\t%d\n%-20s:\t%.1f\n%-20s:\t%d\n%-20s:\t%s\n"
				,"Student Name",stu1.getName(),"Student Id",stu1.getStudentId(),
				"Qualifying marks",stu1.getQualifyingExamMarks(),"Year of Engineering",stu1.getYearOfEngg()
				,"Residential status",stu1.getResidentialstatus());
	}
}
