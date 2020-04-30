package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		/*SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findbyId(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findbyId(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update complete");

		System.out.println("=== TEST 6: seller delete ===");
		
		sellerDao.deleteById(7);
		System.out.println("Delete complete");*/
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findbyId(2);
		System.out.println(department);
			
		System.out.println("=== TEST 2: department findAll ===");
		List<Department>list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "Math");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
	
		System.out.println("=== TEST 4: department update ===");
		department = departmentDao.findbyId(5);
		department.setName("Portuguese");
		departmentDao.update(department);
		System.out.println("Update complete");

		System.out.println("=== TEST 5: department delete ===");
		
		departmentDao.deleteById(5);
		System.out.println("Delete complete");
	}

}
