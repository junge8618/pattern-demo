/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod.factory;

import com.junge.demo.pattern.create.factorymethod.ExportFactory;
import com.junge.demo.pattern.create.factorymethod.export.ExportFile;
import com.junge.demo.pattern.create.factorymethod.export.impl.financial.ExportFinancialCsvFile;
import com.junge.demo.pattern.create.factorymethod.export.impl.standard.ExportStandardCsvFile;

/**
 * @author "liuxj"
 *
 */
public class ExportCsvFileFactory implements ExportFactory {

	/* (non-Javadoc)
	 * @see com.junge.demo.pattern.create.factorymethod.ExportFactory#factory(java.lang.String)
	 */
	public ExportFile factory(String exportStruct) {
		if ("stand".equalsIgnoreCase(exportStruct)) {
			return new ExportStandardCsvFile();
		}
		
		if ("fin".equalsIgnoreCase(exportStruct)) {
			return new ExportFinancialCsvFile();
		}
		return null;
	}

}
