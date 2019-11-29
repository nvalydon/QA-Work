package net.codejava.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * A very simple program that writes some data to an Excel file using the Apache
 * POI library.
 * 
 * @author www.codejava.net
 *
 */
public class SimpleExcelWriterExample {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Java Books");

		Object[][] bookData = { { "Trainer_name", "Trainer_grade" }, { "John Gordon", "A+" },
				{ "Jordan Harrison", "A" }, { "Matt", "C" }, { "Tadas", "F" } };

		int rowCount = 0;

		for (Object[] aBook : bookData) {
			Row row = sheet.createRow(++rowCount);

			int columnCount = 0;

			for (Object field : aBook) {
				Cell cell = row.createCell(++columnCount);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}

		}

		try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\JavaBooks.xls")) {
			workbook.write(outputStream);
		}
	}

}