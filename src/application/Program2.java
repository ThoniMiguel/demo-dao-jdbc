package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {
        DepartmentDao depDao = DaoFactory.createDepartmentDao();
        Department dep = depDao.findById(1);
        System.out.println(dep);
    }
}
