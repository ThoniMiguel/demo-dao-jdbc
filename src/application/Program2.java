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

    }
}
