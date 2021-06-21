package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramTwo {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Department department = new Department(null, "Builder");
		System.out.println("### TEST 1: department findById ### ");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
//		departmentDao.insert(department);
//		System.out.println("Department inserted! New Id: "+department.getId());

		System.out.println("### TEST 2: department findById ### ");
		department = departmentDao.findById(7);
		System.out.println(department);

		System.out.println("\n### TEST 3: department findAll ###");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);

		System.out.println("\n### TEST 4: department update ###");
		department = departmentDao.findById(7);
		department.setName("Software");
		departmentDao.update(department);
		System.out.println("Update completed!");

		System.out.println("\n### TEST 5: department delete ###");
		System.out.print("Enter id for delete test: ");
		int id = read.nextInt();

		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		read.close();
	}
}