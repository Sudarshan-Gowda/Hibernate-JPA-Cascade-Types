/**
 * 
 */
package com.star.sud.model.orphanRemoval;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "T_EMPLOYEE")
public class EmployeeOR {

	// Attributes
	////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID", nullable = false, unique = true)
	private int empId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_EMAIL")
	private String empEmail;

	// @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval =
	// false)
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, orphanRemoval = true)
	private Set<AccountOR> accounts;

	// Constructors
	/////////////////
	/**
	 * 
	 */
	public EmployeeOR() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param empId
	 * @param empName
	 * @param empEmail
	 */
	public EmployeeOR(String empName, String empEmail) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}

	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	/**
	 * @return the accounts
	 */
	public Set<AccountOR> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(Set<AccountOR> accounts) {
		this.accounts = accounts;
	}

}
