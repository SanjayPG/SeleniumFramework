package utilities;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class CucumberUtil {
	
	public static String getFeatureCellData(DataTable data,String columnName)
	{
		List<Map<String,String>> table = data.asMaps();
		return table.get(0).get(columnName);
	}

}
