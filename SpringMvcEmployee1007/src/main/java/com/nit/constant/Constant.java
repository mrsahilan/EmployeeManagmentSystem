package com.nit.constant;

public class Constant 
{
	public static final String GET_ALL = "SELECT *FROM EMPLOYEE";
	public static final String GET_ONE = "SELECT *FROM EMPLOYEE WHERE ID=?";
	public static final String INSERT = "INSERT INTO EMPLOYEE (NAME, ADDRESS, SALARY) VALUES(?,?,?)";
	public static final String UPDATE = "UPDATE EMPLOYEE SET NAME=?, ADDRESS=?, SALARY=? WHERE ID=?";
	public static final String DELETE = "DELETE FROM EMPLOYEE WHERE ID=?";
}
