package com.keysun.common;

import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * Created by h on 2017/11/20.
 */
public class CommonTest {

    @Test
    public void numberFormatTest() throws ParseException {
        DecimalFormat df   = (DecimalFormat) DecimalFormat.getInstance();
        df.setMaximumFractionDigits(3);
        String format = df.format(df.parse("22.3000"));
        System.out.println(format);
    }
}
