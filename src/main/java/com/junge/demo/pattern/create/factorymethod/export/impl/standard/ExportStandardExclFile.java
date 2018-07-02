/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod.export.impl.standard;

import com.junge.demo.pattern.create.factorymethod.export.ExportFile;

/**
 * 导出标准结构xls格式文件
 * @author "liuxj"
 *
 */
public class ExportStandardExclFile implements ExportFile {

	/* (non-Javadoc)
	 * @see com.junge.demo.pattern.create.factorymethod.export.ExportFile#export()
	 */
	public boolean export() {
		System.out.println("导出标准结构xls格式文件");
		return true;
	}

}
