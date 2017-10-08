import java.util.List;

import org.apache.hadoop.hive.ql.exec.UDF;

public class StringConcat extends UDF 
{
	public String evaluate( String strSeparator, List<String> aStrings )
	{
		if ( aStrings == null ) 
		{
			return null;
		}
		
		if ( aStrings.size() == 0 ) 
		{
			return "";
		}
		
		StringBuilder sb = new StringBuilder( "" );
		
		for (int i = 0; i < aStrings.size(); i++) 
		{
			sb.append( aStrings.get(i) );
		
			if ( i < aStrings.size()-1  ) 
			{
				sb.append( strSeparator );
			}
			
		}
		
		return sb.toString();
	}
}
