/**
 * 
 */
package com.star.sud.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.star.sud.model.orphanRemoval.AccountOR;
import com.star.sud.model.orphanRemoval.EmployeeOR;
import com.star.sud.util.HibernateConfigUtil;

/**
 * @author Sudarshan
 *
 */
public class MainClassOrphanRemoval {

	public static void main(String[] args) {

		Session session = HibernateConfigUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		// Save the EmployeeOR
		EmployeeOR employee = new EmployeeOR("Sudarshan", "sudarshan@gmail.com");
		session.save(employee);

		// Save the AccountOR
		AccountOR account = new AccountOR("ADMIN");
		account.setEmployee(employee);
		session.save(account);

		transaction.commit();

		// Session 2 - Fetching Employees
		Session session2 = HibernateConfigUtil.getSessionFactory().openSession();
		Transaction transaction2 = session.beginTransaction();
		EmployeeOR employee2 = (EmployeeOR) session2.load(EmployeeOR.class, 1);
		System.out.println("Employeer Name - " + employee2.getEmpName());

		for (AccountOR account2 : employee2.getAccounts())
			System.out.println("AccountOR Name - " + account2.getAccnName());
		transaction2.commit();

		// Session 3 - Removing EmployeeOR Entry with orphanRemoval enabled
		// Note orphanRemoval will do the same operation as CascadeType
		Session session3 = HibernateConfigUtil.getSessionFactory().openSession();
		Transaction transaction3 = session3.beginTransaction();

		EmployeeOR account3 = (EmployeeOR) session3.get(EmployeeOR.class, 1);
		session3.delete(account3);
		transaction3.commit();
		System.out.println("Success");

		HibernateConfigUtil.destroy();

	}

}
