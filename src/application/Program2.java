package application;

import jdk.swing.interop.SwingInterOpUtils;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {
        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("\n ==== TEST 1: findById");
        Department dep = depDao.findById(1);
        System.out.println(dep);

        System.out.println("\n ==== TEST 2: findAll");
        List<Department> list = depDao.findAll();
        for(Department depList : list){
            System.out.println(depList);
        }
//        System.out.println("\n ==== TEST 3: Insert");
//        Department tempDep = new Department(null, "bbbbb");
//        depDao.insert(tempDep);
//        System.out.println("Done! New department inserted!");

        System.out.println("\n ==== TEST 4: Delete");
        depDao.deleteById(0);
        System.out.println("Done! department deleted!");

        System.out.println("\n ==== TEST 5: Update");
        dep = depDao.findById(4);
        dep.setName("Books");
        depDao.update(dep);
        System.out.println("Done! Update complete");

    }
}
