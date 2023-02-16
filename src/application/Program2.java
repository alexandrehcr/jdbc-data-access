package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("===== TEST 1: DepartmentDaoJDBC::insert =====");
//        Department department = new Department(null, "Engineering");
//        departmentDao.insert(department);
//        System.out.println("Inserted! New department id = " + department.getId() + ".");

        // TODO: Test after implement findById()
//        System.out.println("===== TEST 2: DepartmentDaoJDBC::update =====");

        System.out.println("===== TEST 3: DepartmentDaoJDBC::deleteById =====");
        departmentDao.deleteById(6);
    }
}
