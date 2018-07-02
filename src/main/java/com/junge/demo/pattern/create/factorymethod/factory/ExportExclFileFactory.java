/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod.factory;

import com.junge.demo.pattern.create.factorymethod.ExportFactory;
import com.junge.demo.pattern.create.factorymethod.export.ExportFile;
import com.junge.demo.pattern.create.factorymethod.export.impl.financial.ExportFinancialExclFile;
import com.junge.demo.pattern.create.factorymethod.export.impl.standard.ExportStandardExclFile;

/**
 * @author "liuxj"
 *
 */
public class ExportExclFileFactory implements ExportFactory {

	/* (non-Javadoc)
	 * @see com.junge.demo.pattern.create.factorymethod.ExportFactory#factory(java.lang.String)
	 */
	public ExportFile factory(String exportStruct) {
		if ("stand".equalsIgnoreCase(exportStruct)) {
			return new ExportStandardExclFile();
		}
		
		if ("fin".equalsIgnoreCase(exportStruct)) {
			return new ExportFinancialExclFile();
		}
		return null;
	}

}
