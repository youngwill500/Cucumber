package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;

public class PageInitiliazer extends BaseClass {

	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static PersonalDetailsPageElements pdetails;

	public static void initializeAllPage() {

		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
	}
}