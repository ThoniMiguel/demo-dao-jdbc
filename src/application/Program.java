package application;

import db.DB;
import db.DbException;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        Department obj = new Department(1, "Books");
        System.out.println(obj);
        Seller seller = new Seller(2,"Thoni", "thoni@gmail.com", new Date(), 3000.0, obj);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}
