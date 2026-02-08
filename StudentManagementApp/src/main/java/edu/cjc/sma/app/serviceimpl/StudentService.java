package edu.cjc.sma.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import edu.cjc.sma.app.model.Student;
import edu.cjc.sma.app.repository.StudentRepository;
import edu.cjc.sma.app.service.StudentServiceI;

@Service
public class StudentService implements StudentServiceI{
	
	@Autowired
	StudentRepository sr;
	
	@Override
	public void saveStudent(Student s) {
		sr.save(s);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> all = sr.findAll();
		return all;
	}

	@Override
	public List<Student> deleteStudentData(int studentId) {
		sr.deleteById(studentId);
		List<Student> all = sr.findAll();
		return all;
	}

	@Override
	public List<Student> searchStudentData(String batchNumber) {
		List<Student> bnumber = sr.findByBatchNumber(batchNumber);
		return bnumber;
	}

	@Override
	public List<Student> pagingStudent(int pageNo, int size) {
		List<Student> list = sr.findAll(PageRequest.of(pageNo, size)).getContent();
		return list;
	}

	@Override
	public Student payStudentFees(int studentId) {
		Optional<Student> optional = sr.findById(studentId);
		if(optional.isPresent())
		{
			Student student = optional.get();
			return student;
		}
		return null;
	}

	@Override
	public List<Student> payFees(int id, int amount) {
		Student student = sr.findById(id).get();
		student.setFeesPaid(student.getFeesPaid()+amount);
		sr.save(student);
		List<Student> list = sr.findAll();
		return list;
	}

	@Override
	public Student shiftBatch(int studentId) {
		Optional<Student> optional = sr.findById(studentId);
		if(optional.isPresent())
		{
			Student student = optional.get();
			return student;
		}
		return null;
	}

	@Override
	public List<Student> updateBatchShift(int studentId, String batchNumber) {
		Student student = sr.findById(studentId).get();
		student.setBatchNumber(batchNumber);
		sr.save(student);
		List<Student> list = sr.findAll();
		return list;
	}

}
