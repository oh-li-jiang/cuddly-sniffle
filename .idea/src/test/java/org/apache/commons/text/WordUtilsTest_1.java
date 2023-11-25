package org.apache.commons.text;

import org.junit.Assert;
import org.junit.Test;

public class WordUtilsTest_1 {


    @Test
    public void testCapitalize()
    {
        String str1 = "tHE dog HaS a bONE";
        String result = WordUtils.capitalize(str1);
        Assert.assertEquals("THE Dog HaS A BONE",result);
    }

    @Test
    public void testCapitalizeFully()
    {
        String str2 = "i'm A pretty gIRL";
        String result = WordUtils.capitalize(str2);
        Assert.assertEquals("I'm A Pretty GIRL",result);
    }


}