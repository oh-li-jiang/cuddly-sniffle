package org.apache.commons.text;

import org.junit.Assert;
import org.junit.Test;

public class WordUtilsTest_2
{
    @Test
    public void testCapitalize()
    {
        String str1 = "To be both a speaker and a deeds";
        String result = WordUtils.capitalize(str1);
        Assert.assertEquals("To Be Both A Speaker And A Deeds",result);
    }

    @Test
    public void testCapitalizeFully()
    {
        String str2 = "bad Times maKe a good MAN";
        String result = WordUtils.capitalize(str2);
        Assert.assertEquals("Bad Times MaKe A Good MAN",result);
    }
}
