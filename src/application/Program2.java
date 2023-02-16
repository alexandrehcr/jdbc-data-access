package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEST 1: DepartmentDaoJDBC::findAll =====");
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);


        System.out.println("\n===== TEST 2: DepartmentDaoJDBC::findById =====");
        //! Toggle input
        int searchDptID = 3;
//        System.out.print("ID: ");
//        searchDptID = sc.nextInt(); sc.nextLine();
        Department foundDepartment = departmentDao.findById(searchDptID);
        System.out.println(foundDepartment);


        System.out.println("\n===== TEST 3: DepartmentDaoJDBC::insert =====");
        //! Toggle input
        String insertedDepartmentName = "Human Resources";
//        System.out.print("Department name: ");
//        insDepartmentName = sc.nextLine();
        Department insertedDepartment = new Department(null, insertedDepartmentName);
        departmentDao.insert(insertedDepartment);
        int insertedDptId = insertedDepartment.getId();
        System.out.println("Inserted " + insertedDepartmentName + "! New department id = " + insertedDptId + ".");
        updatedDepartmentTable();


        System.out.println("\n===== TEST 4: DepartmentDaoJDBC::update =====");
        //! Toggle input
        insertedDepartmentName = "Human Resources and Administration";
//        System.out.print("New name to the department you inserted: ");
//        insDepartmentName = sc.nextLine();
        insertedDepartment.setName(insertedDepartmentName);
        departmentDao.update(insertedDepartment);
        updatedDepartmentTable();


        System.out.println("\n===== TEST 5: DepartmentDaoJDBC::deleteById =====");
        departmentDao.deleteById(insertedDptId);
        System.out.println("Deleted " + insertedDepartmentName);
        updatedDepartmentTable();

        sc.close();
    }

    private static void updatedDepartmentTable() {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("\nUpdated Department table: ");
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);
    }
}
