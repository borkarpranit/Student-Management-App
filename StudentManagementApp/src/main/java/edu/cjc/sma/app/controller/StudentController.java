package edu.cjc.sma.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.sma.app.model.Student;
import edu.cjc.sma.app.service.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	
	@RequestMapping("login")
	public String loginAcc(@RequestParam("username")String un,@RequestParam("password")String ps,Model m)
	{
		if(un.equals("Admin") && ps.equals("Admin"))
		{
			List<Student> list = ssi.pagingStudent(0, 5);
			m.addAttribute("data", list);
			return "adminscreen";
		}
		else 
		{
			m.addAttribute("login_fail", "Enter valid Login Details");
			return "login";
		}	
	}
	
	
	@RequestMapping("save")
	public String saveStudent(@ModelAttribute Student stu,Model m)
	{
		ssi.saveStudent(stu);
		List<Student> list = ssi.getAllStudent();
		m.addAttribute("data", list);
		return "adminscreen";		
	}
	
	
	@RequestMapping("delete")
	public String deleteStudent(@RequestParam("id")int studentId, Model m)
	{
		List<Student> list = ssi.deleteStudentData(studentId);
		m.addAttribute("data", list);
		return "adminscreen";
	}
	
	
	@RequestMapping("search")
	public String searchStudent(@RequestParam("batchNumber")String batchNumber,Model m)
	{
		List<Student> list = ssi.searchStudentData(batchNumber);
		if(list.size() > 0)
		{
			m.addAttribute("data", list);		
		}
		else
		{
			List<Student> student = ssi.getAllStudent();
			m.addAttribute("data", student);
			m.addAttribute("message", "Records not found for batch"+ batchNumber);
		}
		return "adminscreen";
	}
	
	
	@RequestMapping("pagging")
	public String pagination(@RequestParam("pageNo")int pageNo, Model m)
	{
		int size=7;
		List<Student> list= ssi.pagingStudent(pageNo,size);
		m.addAttribute("data", list);
		return "adminscreen";		
	}
	
	
	@RequestMapping("fees")
	public String payFees(@RequestParam("id")int studentId,Model m)
	{
		Student s = ssi.payStudentFees(studentId);
		m.addAttribute("st", s);
		return "fees";	
	}
	
	
	@RequestMapping("payfees")
	public String payFeesStudent(@RequestParam("studentid")int studentId,@RequestParam("amount")int amount,Model m)
	{
		List<Student> list = ssi.payFees(studentId, amount);
		m.addAttribute("data", list);
		return "adminscreen";		
	}
	
	@RequestMapping("batch")
	public String shiftStudentBatch(@RequestParam("id")int studentId,Model m)
	{
		Student s = ssi.shiftBatch(studentId);
		m.addAttribute("st", s);
		return "batch";
	}
	
	
	@RequestMapping("shiftbatch")
	public String updateBatch(@RequestParam("studentid")int studentId,@RequestParam("batchNumber")String batchNumber,Model m)
	{
		List<Student> list = ssi.updateBatchShift(studentId, batchNumber);
		m.addAttribute("data", list);
		return "adminscreen";		
	}
	
}
