package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("===== TEST 1: SellerDao::findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n===== TEST 2: SellerDao::findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n===== TEST 3: SellerDao::findAll =====");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n===== TEST 4: SellerDao::insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New seller id = " + newSeller.getId() + "\n");

        System.out.println("\n===== TEST 5: SellerDao::update =====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        seller.setEmail("marthaW@gmail.com");
        sellerDao.update(seller);
        System.out.println("Seller updated.");
    }
}
