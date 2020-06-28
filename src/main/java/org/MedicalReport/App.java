package org.MedicalReport;

import org.MedicalReport.AppendExcel.DataIntoExcel;
import org.MedicalReport.AppendExcel.DataIntoExcelImpl;
import org.MedicalReport.Model.Information;
import org.MedicalReport.WordExtraction.WordDoc;
import org.MedicalReport.WordExtraction.WordTable;

/**
 *  Main class
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        int i = 1000;
        WordDoc wordTable = new WordTable("C:\\Users\\Yashleen Virk\\Documents\\MedicalDocs\\SANJU RAMDAS SAHU.docx",  i);
        Information info = wordTable.getTableFromFile();

        DataIntoExcel dataIntoExcel = new DataIntoExcelImpl("", info);
        dataIntoExcel.putDataIntoXML();

    }
}
