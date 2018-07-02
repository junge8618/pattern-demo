/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod;

import com.junge.demo.pattern.create.factorymethod.export.ExportFile;

/**
 * 导出工厂
 * @author "liuxj"
 *
 */
public interface ExportFactory {
	
	/**
	 * 获取导出类
	 * @param exportStruct 导出结构 stand-标准版 fin-财务
	 * @return
	 */
	ExportFile factory(String exportStruct);
}
