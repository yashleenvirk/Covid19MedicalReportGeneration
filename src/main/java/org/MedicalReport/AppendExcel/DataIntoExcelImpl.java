package org.MedicalReport.AppendExcel;

import org.MedicalReport.Model.Information;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DataIntoExcelImpl implements DataIntoExcel {

    private String fileName;
    private Information information;
    private int patientNumber;

    public DataIntoExcelImpl() {
    }

    public DataIntoExcelImpl(String fileName, Information information) {
        this.fileName = fileName;
        this.information = information;
    }


    public  boolean isGetter(Method method){
        if(!method.getName().startsWith("get"))      return false;
        if(method.getParameterTypes().length != 0)   return false;
        if(void.class.equals(method.getReturnType())) return false;
        return true;
    }

    public List<String> listFromInformation(Information information){
        List<String> informationList = new ArrayList<>();

        patientNumber = information.fetchPatientNumber();

        Class infReflect = information.getClass();
        Method[] methods = infReflect.getMethods();

        for(Method m : methods){
            if(isGetter(m)) m.toString();
        }

        return informationList;
    }

    @Override
    public void putDataIntoXML()  throws Exception{

        if (!(fileName.endsWith(".xlsx"))) {
            throw new FileNotFoundException("File should be doc or docx");
        } else {
            try {

                List<String>  data = new ArrayList<>();
                FileInputStream inputStream = new FileInputStream(new File(fileName));
                Workbook workbook = WorkbookFactory.create(inputStream);

                List<String> informationList = listFromInformation(information);

                Sheet sheet = workbook.getSheetAt(0);
                int rowNumber = patientNumber;
                Row row = sheet.getRow(rowNumber);
                int cellnumber = 0;
                for(String inf : informationList){
                    Cell cell = row.getCell(cellnumber);
                    cell.setCellValue(inf);
                    cellnumber++;
                }

                inputStream.close();

                FileOutputStream outputStream = new FileOutputStream(new File(fileName));
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();




            } catch (Exception ex){
                throw new FileNotFoundException(ex.getMessage());
            }
        }
    }
}
