package sample;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelfilePractice {
	public static void main(String[]args) throws Exception {
	ExcelUtility eUtil=new ExcelUtility();
	String value=eUtil.getDataFromExcelFile("leads", 1, 1);
	String value1=eUtil.getDataFromExcelFile("contacts", 4, 1);
	System.out.println(value);
	System.out.println(value1);
}}
