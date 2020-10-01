package net.local.liferay.desafio.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Util {
	
    public static String formatNumber(BigDecimal value) {
	    DecimalFormat df = new DecimalFormat("0.00");
	    return df.format(value);
    }

	public static BigDecimal roundNumber(BigDecimal value, BigDecimal increment, RoundingMode roundingMode) {
		if (increment.signum() == 0) {
			// 0 increment does not make much sense, but prevent division by 0
			return value;
		} else {
			BigDecimal divided = value.divide(increment, 0, roundingMode);
			BigDecimal result = divided.multiply(increment);
			return result;
		}
	}
}
