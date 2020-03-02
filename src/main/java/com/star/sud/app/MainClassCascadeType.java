/**
 * 
 */
package com.star.sud.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.star.sud.model.cascade.Account;
import com.star.sud.model.cascade.Employee;
import com.star.sud.util.HibernateConfigUtil;

/**
 * @author Sudarshan
 *
 */
public class MainClassCascadeType {

	public static void main(String[] args) {

		Session session = HibernateConfigUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		// Save the Employee
		Employee employee = new Employee("Sudarshan", "sudarshan@gmail.com");
		session.save(employee);

		// Save the Account
		Account account = new Account("ADMIN");
		account.setEmployee(employee);
		session.save(account);

		transaction.commit();

		// Session 2 - Fetching Employees
		Session session2 = HibernateConfigUtil.getSessionFactory().openSession();
		Transaction transaction2 = session.beginTransaction();
		Employee employee2 = (Employee) session2.load(Employee.class, 1);
		System.out.println("Employeer Name - " + employee2.getEmpName());

		for (Account account2 : employee2.getAccounts())
			System.out.println("Account Name - " + account2.getAccnName());
		transaction2.commit();

		// Session 3 - Removing Employee Entry with CascadeType enabled
		Session session3 = HibernateConfigUtil.getSessionFactory().openSession();
		Transaction transaction3 = session3.beginTransaction();

		// If we try to remove employee object with CascadeType.ALL - All the entities
		// associated to employee (account in our case) will also be deleted.
		// Note - Make sure the CascadeType should be ALL or REMOVE or else it will
		// throw exception
		Employee account3 = (Employee) session3.get(Employee.class, 1);
		session3.delete(account3);
		transaction3.commit();
		System.out.println("Success");

		HibernateConfigUtil.destroy();

	}

}
