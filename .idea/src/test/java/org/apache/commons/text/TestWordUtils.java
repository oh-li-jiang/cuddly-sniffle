package org.apache.commons.text;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.apache.commons.text.WordUtils;
public class TestWordUtils
{
    public static void main( String[] args )
    {

        String str1 = "no cross, No Crown";
        String result1 = WordUtils.capitalize(str1);
        if(result1 != "No Cross, No Crown")
        {
            System.err.println("Capitalize Error!");
            System.err.println("excepted: No Cross, No Crown");
            System.err.println("actual  : " + result1);
        }

        System.err.println();

        String str2 = "timE AnD tide WaIt for No MAN";
        String result2 = WordUtils.capitalizeFully(str2);
        if(result2 != "TimE AnD Tide WaIt For No MAN")
        {
            System.err.println("CapitalizeFully Error!");
            System.err.println("excepted: TimE AnD Tide WaIt For No MAN");
            System.err.println("actual  : " + result2);
        }
    }
}
