package utilitties;

import java.io.IOException;

public class ExcelDataProvider {

	public Object[][] testData(String excellPath, String sheetName) throws IOException {
		ExcelUtilis excel = new ExcelUtilis(excellPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellValue = excel.getCellData(i, j);
				System.out.println(cellValue);
				data[i - 1][j] = cellValue;
			}
		}
		return data;
	}

}
