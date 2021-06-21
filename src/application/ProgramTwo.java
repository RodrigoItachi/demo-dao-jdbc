package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramTwo {
	public static void main(String[] args) {
		Department department = new Department(null, "Builder");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
//		departmentDao.insert(department);
//		System.out.println("Department inserted! New Id: "+department.getId());

		System.out.println("### TEST 1: department findById ### ");
		department = departmentDao.findById(7);
		System.out.println(department);

		System.out.println("\n### TEST 2: department findAll ###");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
	}
}