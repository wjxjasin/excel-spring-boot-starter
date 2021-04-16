package com.pig4cloud.plugin.excel.read;

import com.alibaba.excel.EasyExcel;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试读取excel
 *
 * @author lengleng
 * @date 2021/4/16
 */
public class ReaderExcelTests {

	/**
	 * 指定列的下标或者列名
	 *
	 * <p>1. 创建excel对应的实体对象,并使用{@link @ExcelProperty}注解. 参照{@link IndexOrNameData}
	 * <p>2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link IndexOrNameDataListener}
	 * <p>3. 直接读即可
	 */
	@Test
	@SneakyThrows
	public void indexOrNameRead() {
		ClassPathResource classPathResource = new ClassPathResource("tmp/indexOrName.xlsx");
		EasyExcel.read(classPathResource.getInputStream(), IndexOrNameData.class, new IndexOrNameDataListener()).sheet().doRead();
	}
}
