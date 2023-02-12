package utilitties;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilis {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtilis(String excellPath, String sheetName) throws IOException {
		workbook = new XSSFWorkbook("./test data/loginData.xlsx");
		sheet = workbook.getSheet("Sheet1");
	}

	public int getRowCount() throws IOException {

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No pof rows:" + rowCount);
		return rowCount;
	}

	public int getColumnCount() throws IOException {

		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of columns:" + columnCount);
		return columnCount;
	}

	public String getCellData(int rowNum, int cellNum) throws IOException {

		String cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return cellData;
	}
}