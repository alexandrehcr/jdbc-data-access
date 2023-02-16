package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("===== TEST 1: DepartmentDaoJDBC::insert =====");
//        Department department = new Department(null, "Engineering");
//        departmentDao.insert(department);
//        System.out.println("Inserted! New department id = " + department.getId() + ".");

//        System.out.println("\n===== TEST 2: DepartmentDaoJDBC::update =====");
//        Department department2 = departmentDao.findById(3);
//        department2.setName("Cleaning");
//        departmentDao.update(department2);

//        System.out.println("\n===== TEST 3: DepartmentDaoJDBC::deleteById =====");
//        departmentDao.deleteById(6);

//        System.out.println("\n===== TEST 4: DepartmentDaoJDBC::findById =====");
//        department2 = departmentDao.findById(3);
//        System.out.println(department2);

        System.out.println("\n===== TEST 5: DepartmentDaoJDBC::findAll =====");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);
    }
}
