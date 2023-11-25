package org.example;
import org.apache.commons.text.WordUtils;
import org.junit.Test;
import org.junit.Assert;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Test
    public void TestWorldUtils()
    {
        String ThedoghasaBONE = "tHE dog HaS a bONE";
        String result = WordUtils.capitalize(ThedoghasaBONE);
        System.out.println(result);
        Assert.assertEquals("THE Dog HaS A BONE",result);
    }
}
