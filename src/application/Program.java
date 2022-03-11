package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
