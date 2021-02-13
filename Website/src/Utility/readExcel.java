package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readExcel {
	HSSFWorkbook wb;
	HSSFSheet sheet1;

	public readExcel(String path) throws Throwable {
		File src = new File(path);
		FileInputStream fis = new FileInputStream(src);
		wb = new HSSFWorkbook(fis);

	}

	public String readdata(int index, int row, int column) {
		sheet1 = wb.getSheetAt(index);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

	public int getlastrow(int index) {
		int lastrow = wb.getSheetAt(index).getLastRowNum();

		return lastrow;

	}

}
