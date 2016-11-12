package cl.test.registro;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BulkUserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try
	        {
			    System.out.println("INICIADO LECTURA DE FICHERO DE USUARIOS");
	            FileInputStream file = new FileInputStream(new File("D:\\henry\\listado de usuarios a ingresar.xlsx"));
	 
	            //Create Workbook instance holding reference to .xlsx file
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	            //Get first/desired sheet from the workbook
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //Iterate through each rows one by one
	            Iterator<Row> rowIterator = sheet.iterator();
	            rowIterator.next();
	            while (rowIterator.hasNext()) 
	            {
	                Row row = rowIterator.next();	              
	                Iterator<Cell> cellIterator = row.cellIterator();
	                if(row.getCell(0) != null){
	                System.out.println("*******************************************");
	                System.out.println("INICIADO REGISTRO DE USUARIO: " + row.getCell(0).getStringCellValue());
	                RegisterUserUtil register = new RegisterUserUtil();
	                boolean result = register.registerUser(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue(), row.getCell(2).getStringCellValue(), row.getCell(3).getStringCellValue(), row.getCell(4).getStringCellValue(),row.getCell(5).getStringCellValue());
	                System.out.println("TERMINACION DE REGISTRO DE USUARIO: " + row.getCell(0).getStringCellValue());
	                System.out.println("RESULTADO: " + (result ? "SATISFACTORIO" : "FALLIDO" ));
	                System.out.println("*******************************************");
	                System.out.println("********************---********************");
	                }
	            }
	            file.close();
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	}

}
