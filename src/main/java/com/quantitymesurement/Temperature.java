package com.quantitymesurement;

/**
 * Purpose : To Convert Temperature
 * @author KUNAL SURYAWANSHI
 */

public class Temperature {
    public final double value;
    public final Unit unit;

    public Temperature(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(that.value, value) == 0;
    }

    /**
     * Purpose : To Convert Value Fahrenheit to Celsius
     *
     * @return Celsius
     */
    public double convertFahrenheitToCelsius() {
        return (this.value - 32) * 5 / 9;
    }

    public double convertCelsiusToFahrenheit() {
        return (this.value * 9 / 5) + 32;
    }

    enum Unit {FAHRENHEIT, CELSIUS}
}
