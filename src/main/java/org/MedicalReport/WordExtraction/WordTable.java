package org.MedicalReport.WordExtraction;

import com.sun.org.apache.xml.internal.serializer.ToXMLSAXHandler;
import com.sun.xml.internal.ws.util.xml.ContentHandlerToXMLStreamWriter;
import javafx.scene.control.Cell;
import org.MedicalReport.Model.Information;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xslf.usermodel.XSLFFontInfo;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.ToXMLContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class WordTable implements WordDoc {
    private String fileName;
    private int patientNumber;

    public WordTable() {
    }

    public WordTable(String fileName, int patientNumber) {
        this.fileName = fileName;
        this.patientNumber = patientNumber;
    }

    @Override
    public Information getTableFromFile() throws FileNotFoundException {
        if (!(fileName.endsWith(".doc") || fileName.endsWith(".docx"))) {
            throw new FileNotFoundException("File should be doc or docx");
        } else {
            try {
                InputStream inputStream = new FileInputStream(fileName);

                ContentHandler handler   = new ToXMLContentHandler();
                AutoDetectParser parser           = new AutoDetectParser();
                Metadata metadata            = new Metadata();
                ParseContext parseContext        = new ParseContext();

                parser.parse(inputStream, handler, metadata);

                handler.toString();

//                XWPFDocument doc = new XWPFDocument(new FileInputStream(fileName));
//                List<XWPFTable> table = doc.getTables();
//                Information information = new Information();
//                information.setPatientNumber(patientNumber);
//
//                for (XWPFTable xwpfTable : table) {
//                    List<XWPFTableRow> row = xwpfTable.getRows();
//                    for (XWPFTableRow xwpfTableRow : row) {
//                        List<XWPFTableCell> cell = xwpfTableRow.getTableCells();
//
//                        for (XWPFTableCell xwpfTableCell : cell) {
//                            if(xwpfTableCell!=null) {
//                                System.out.println(xwpfTableCell.getText());
//
//                                information.setPatientName(getField(xwpfTableCell, "Name of patient:"));
//                                if(xwpfTableCell.getText().contains("Age:")){
//                                    String yrs = "#EMPTY";
//                                    String mon = "#EMPTY";
//                                    String dob = "#EMPTY";
//                                    String gender = "#EMPTY";
//
//                                    information.setYearsAge(yrs);
//                                    information.setMonthsAge(mon);
//                                    information.setDob(dob);
//                                    if(xwpfTableCell.getText().split(":")[2] != null) {
//                                        if (xwpfTableCell.getText().split(":")[2].toUpperCase().startsWith("M"))
//                                            gender = "Male";
//                                        else
//                                            gender = "Female";
//                                    }
//                                    information.setGender(gender);
//                                }
//                                information.setDateOfInterview(getField(xwpfTableCell, "Date of interview:"));
//
//                                String s = "Case Classification:";
//                                if(xwpfTableCell.getText().contains(s)){
//                                    String val = "#EMPTY";
//
//                                    if (xwpfTableCell.getText().split(":")[1] != null){
//
//                                    }
//
//                                }
//
//
//
//
//
//                                List<XWPFTable> itable = xwpfTableCell.getTables();
//                                if(itable.size()!=0)
//                                {
//                                    for (XWPFTable xwpfiTable : itable) {
//                                        List<XWPFTableRow> irow = xwpfiTable.getRows();
//                                        for (XWPFTableRow xwpfiTableRow : irow) {
//                                            List<XWPFTableCell> icell = xwpfiTableRow.getTableCells();
//                                            for (XWPFTableCell xwpfiTableCell : icell) {
//                                                if(xwpfiTableCell!=null)
//                                                {
//                                                    System.out.println(xwpfiTableCell.getText());
//                                                }
//                                            }
//                                        }
//                                    }
//                                }
//                            }
//                        }
//
//
//                    }
//                }


            } catch (FileNotFoundException ex) {
                throw new FileNotFoundException();
            } catch (IOException | SAXException | TikaException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public String getField(XWPFTableCell xwpfTableCell, String string){
        String doi = "#EMPTY";
        if(xwpfTableCell.getText().contains(string)){
            if(xwpfTableCell.getText().split(":")[1] != null){
                doi = xwpfTableCell.getText().split(":")[1];
            }
        }
        return doi;
    }
}
