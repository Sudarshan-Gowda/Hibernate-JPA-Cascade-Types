/**
 * 
 */
package com.star.sud.model.orphanRemoval;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "T_ACCOUNT")
public class AccountOR {

	// Attributes
	/////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACCN_ID", nullable = false, unique = true)
	private int accnId;

	@Column(name = "ACCN__ID")
	private String accnName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_ID")
	private EmployeeOR employee;

	
	/**
	 * 
	 */
	public AccountOR() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accnId
	 * @param accnName
	 * @param employee
	 */
	public AccountOR(String accnName) {
		this.accnName = accnName;
	}

	// Properties
	////////////////
	/**
	 * @return the accnId
	 */
	public int getAccnId() {
		return accnId;
	}

	/**
	 * @param accnId the accnId to set
	 */
	public void setAccnId(int accnId) {
		this.accnId = accnId;
	}

	/**
	 * @return the accnName
	 */
	public String getAccnName() {
		return accnName;
	}

	/**
	 * @param accnName the accnName to set
	 */
	public void setAccnName(String accnName) {
		this.accnName = accnName;
	}

	/**
	 * @return the employee
	 */
	public EmployeeOR getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(EmployeeOR employee) {
		this.employee = employee;
	}

}
