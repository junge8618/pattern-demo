/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod.export.impl.financial;

import com.junge.demo.pattern.create.factorymethod.export.ExportFile;

/**
 * @author "liuxj"
 *
 */
public class ExportFinancialCsvFile implements ExportFile {

	/* (non-Javadoc)
	 * @see com.junge.demo.pattern.create.factorymethod.export.ExportFile#export()
	 */
	public boolean export() {
		System.out.println("导出财务结构csv格式文件");
		return true;
	}

}
