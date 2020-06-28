package org.MedicalReport.WordExtraction;

import org.MedicalReport.Model.Information;

import java.io.FileNotFoundException;

/**
 * The WordDoc interface used to fetch table from a doc/docx file
 *
 * @author  Yashleen
 * @version 1.0
 * @since   2020-06-10
 */
public interface WordDoc {

    Information getTableFromFile() throws FileNotFoundException;
}
