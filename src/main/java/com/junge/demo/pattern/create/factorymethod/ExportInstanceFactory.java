/**
 * 
 */
package com.junge.demo.pattern.create.factorymethod;

import com.junge.demo.pattern.create.factorymethod.export.ExportFile;

/**
 * 约定实例命名规则，获取实例
 * @author "liuxj"
 *
 */
public class ExportInstanceFactory {
	
	/**
	 * 获取导出类
	 * @param exportStruct 导出结构 stand-标准版 fin-财务
	 * @param fileType 导出文件类型 excl/pdf/csv
	 * @return
	 */
	public static ExportFile getInstance(String exportStruct, String fileType) {
		String instanceFileName = "Export" + getExportStruct(exportStruct) + getExportFileType(fileType) + "File";
		try {
			// 可以根据spring的bean名称或者id获取实例
			return (ExportFile)Class.forName(instanceFileName).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 获取文件导出文件类型
	 * 
	 * @param fileType
	 * @return
	 */
	private static String getExportFileType(String fileType) {
		if ("excl".equalsIgnoreCase(fileType)) {
			return "Excl";
		}
		
		if ("pdf".equalsIgnoreCase(fileType)) {
			return "Pdf";
		}
		
		return "Csv";
	}
	
	/**
	 * 获取文件导出数据结构
	 * 
	 * @param exportStruct
	 * @return
	 */
	private static String getExportStruct(String exportStruct) {
		if ("stand".equalsIgnoreCase(exportStruct)) {
			return "Standard";
		}
		
		return "Financial";
	}
}
