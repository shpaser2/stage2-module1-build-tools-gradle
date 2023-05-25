package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean result = false;
        if (NumberUtils.isParsable(str) && str.charAt(0) != '0') {
            result = NumberUtils.createNumber(str).doubleValue() > 0;
        }
        return result;
    }
}