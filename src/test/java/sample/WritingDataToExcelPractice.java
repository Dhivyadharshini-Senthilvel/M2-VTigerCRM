package sample;

import genericUtility.ExcelUtility;

public class WritingDataToExcelPractice {
   public static void main(String[] args) throws Exception {
	ExcelUtility eUtil = new ExcelUtility();
	eUtil.writeDataToExcelFile("flower", 2, 4, "hibiscus");
}
}
