package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelData {
	//References to private attributes which hold Excel objects
	private static HSSFWorkbook WORK_BOOK;
	private static HSSFSheet SHEET;
	private static HSSFCell CELL;
	private static HSSFRow ROW;
	private static FileInputStream FILE_INPUT;
	private static FileOutputStream FILE_OUTPUT;
		
	//Turns any data into String
	private static DataFormatter FORMATTER;

	//Method that sets Excel file and sheet name
	public static void setFile(String filePath, String sheetName) throws Exception {
		try {
			FILE_INPUT = new FileInputStream(filePath); //Loads path to the file			
			WORK_BOOK = new HSSFWorkbook(FILE_INPUT); //Opens Excel file
			SHEET = WORK_BOOK.getSheet(sheetName); //Takes the particular sheet
			FORMATTER = new DataFormatter(); //Initializes DataFormatter object
		} catch (Exception e) {
			throw (e);
		}
	}
	
	//Method that gets the data from Excel table for rowNum row and colNum column
	public static String getData(int rowNum, int colNum) {
		try {
			CELL = SHEET.getRow(rowNum).getCell(colNum);
			String CellData = FORMATTER.formatCellValue(CELL); //Turns cell data into string
			return CellData;
		} catch (Exception e) {
			return "";
		}
	}
	
	//Method that sets the string into Excel table for rowNum row and colNum column
	public static void setData(String data, int rowNum, int colNum) throws Exception {
		try {
			ROW = SHEET.getRow(rowNum); 
			CELL = ROW.getCell(colNum); 

			//Creates the cell if it's empty or null and sets a value
			if (CELL == null) {
				CELL = ROW.createCell(colNum);
				CELL.setCellValue(data);
			} else {
				CELL.setCellValue(data); //or overwrites the old value
			}
			
			//Enters the changes into Excel file
			FILE_OUTPUT = new FileOutputStream(Constant.PATH_TESTDATA + Constant.FILE_TESTDATA);
			WORK_BOOK.write(FILE_OUTPUT);
			
			FILE_OUTPUT.close(); //Closes FileOutputStream
		} catch (Exception e) {
			throw (e);
		}
	}

	//Method that sets the double into Excel table for rowNum row and colNum column
	public static void setDoubleData(double data, int rNum, int cNum) throws Exception {
		ROW = SHEET.getRow(rNum);
		CELL = ROW.getCell(cNum);

		if (CELL == null) {
			CELL = ROW.createCell(cNum);
			CELL.setCellValue(data);
		} else {
			CELL.setCellValue(data);
		}
		FILE_OUTPUT = new FileOutputStream(Constant.PATH_TESTDATA + Constant.FILE_TESTDATA);
		WORK_BOOK.write(FILE_OUTPUT);
		FILE_OUTPUT.close();
	}

	//Method that returns the reference to worksheet
	public static int rowCount() {
		return SHEET.getLastRowNum()+1;
	}

}
