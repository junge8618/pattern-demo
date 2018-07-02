/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod.factory;

import com.junge.demo.pattern.create.factorymethod.ExportFactory;
import com.junge.demo.pattern.create.factorymethod.export.ExportFile;
import com.junge.demo.pattern.create.factorymethod.export.impl.financial.ExportFinancialPdfFile;
import com.junge.demo.pattern.create.factorymethod.export.impl.standard.ExportStandardPdfFile;

/**
 * @author "liuxj"
 *
 */
public class ExportPdfFileFactory implements ExportFactory {

	/* (non-Javadoc)
	 * @see com.junge.demo.pattern.create.factorymethod.ExportFactory#factory(java.lang.String)
	 */
	public ExportFile factory(String exportStruct) {
		if ("stand".equalsIgnoreCase(exportStruct)) {
			return new ExportStandardPdfFile();
		}
		
		if ("fin".equalsIgnoreCase(exportStruct)) {
			return new ExportFinancialPdfFile();
		}
		return null;
	}

}
