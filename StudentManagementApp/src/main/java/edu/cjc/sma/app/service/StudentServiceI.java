package edu.cjc.sma.app.service;

import java.util.List;

import edu.cjc.sma.app.model.Student;

public interface StudentServiceI {

	public void saveStudent(Student s);
	public List<Student> getAllStudent();
	public List<Student> deleteStudentData(int studentId);
	public List<Student> searchStudentData(String batchNumber);
	public List<Student> pagingStudent(int pageNo, int size);
	public Student payStudentFees(int studentId);
	public List<Student> payFees(int id,int amount);
	public Student shiftBatch(int studentId);
	public List<Student> updateBatchShift(int studentId, String batchNumber);;
}
