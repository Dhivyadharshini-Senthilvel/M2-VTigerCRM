package sample;



import java.util.List;

import genericUtility.ExcelUtility;

public class FetchingMultipleDataFromExcelFile {
	public static void main(String[] args) throws Exception {
	/*	FileInputStream fis=new FileInputStream("C:\\Users\\Dhivya Dharshini\\OneDrive\\Desktop\\Flower.xlsx");
	    Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("flower");
		DataFormatter df = new DataFormatter();
		for(int i=0;i<=sh.getLastRowNum();i++) {
			Row r=sh.getRow(i);
			for(int j=0;j<r.getLastCellNum();j++) {
				Cell c=r.getCell(j);
				String value=df.formatCellValue(c);
				System.out.print(value+" ");
			}
			System.out.println();*/
		ExcelUtility eUtil=new ExcelUtility();
		List<String>value = eUtil.getMultipleDataFromExcelFile("flower", 0, 0);
		System.out.println(value);
	}
}
		
		