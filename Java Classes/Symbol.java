import java.awt.Image;

public class Symbol implements ISymbol
{
	private String str_src;
	private int value;
	
	
	public Symbol()
	{
		value = 0;
		str_src = "";
	}
	
	public Symbol(String src, int val)
	{
		value = val;
		str_src = src;
	}
	
	public void setImage(String src)
	{
		this.str_src = src;
	}
	public void setValue(int v)
	{
		this.value = v;
	}
	public String getImage()
	{
		return str_src;
	}
	public int getValue()
	{
		return value;
	}

	public String toString()
	{
		//Use if else if to set the correct name of the Symbol
		//when printing toString method.
		String sel_symbol = "";
		if(str_src.equals(""))
		{
			sel_symbol = "";
			
		}else if (str_src.equals(""))
		{
			sel_symbol = "";
		}else if(str_src.equals(""))
		{
			sel_symbol = "";
		}else if(str_src.equals(""))
		{
			sel_symbol = "";
		}else if(str_src.equals(""))
		{
			sel_symbol = "";
			
		}else if(str_src.equals(""))
		{
			sel_symbol = "";
		}
		
		return "Symbol: "+sel_symbol+
		"Image Src: "+str_src+
		"\nSymbol value: "+value;
		
	}
}
