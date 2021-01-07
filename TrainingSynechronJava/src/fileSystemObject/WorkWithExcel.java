package fileSystemObject;

import xls.ShineXlsReader;

public class WorkWithExcel {

	public static void main(String[] args) {

		ShineXlsReader xls=new ShineXlsReader(".\\Files\\TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int columnCount = xls.getColumnCount("Sheet1");

		System.out.println("Row count ="+rowCount);
		System.out.println("col count ="+columnCount);

		xls.addSheet("Sheet4");
		xls.addColumn("Sheet4", "DOB");
		xls.setCellData("Sheet4", "DOB", 2, "24/10/1989");


		for(int i=1;i<=rowCount;i++){
			for(int j=0;j<columnCount;j++){
				String cellData = xls.getCellData("Sheet1", j, i);
				System.out.println(cellData);
			}
		}
	}

}
