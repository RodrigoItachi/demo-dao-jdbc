package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramTwo {
	public static void main(String[] args) {
		Department department = new Department(null, "Builder");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		departmentDao.insert(department);
		System.out.println("Department inserted! New Id: "+department.getId());
	}
}