package com.jpmorgan.bloomberg.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Model class representing a financial Index (e.g., S&P 500, J.P. Morgan EMBI).
 */
public class Index {
    private String ticker;
    private String name;
    private double currentValue;   // Matches ${idx.currentValue} in JSP
    private double changePercent;  // Matches ${idx.changePercent} in JSP
    private BigDecimal value;      // Kept for BigDecimal precision if needed
    private String currency;
    private LocalDate lastUpdated;

    // Default Constructor
    public Index() {}

    // Updated Parameterized Constructor
    public Index(String ticker, String name, double currentValue, double changePercent) {
        this.ticker = ticker;
        this.name = name;
        this.currentValue = currentValue;
        this.changePercent = changePercent;
        this.value = BigDecimal.valueOf(currentValue);
        this.lastUpdated = LocalDate.now();
    }

    // Getters and Setters for JSP EL Access
    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCurrentValue() { return currentValue; }
    public void setCurrentValue(double currentValue) { 
        this.currentValue = currentValue; 
        this.value = BigDecimal.valueOf(currentValue);
    }

    public double getChangePercent() { return changePercent; }
    public void setChangePercent(double changePercent) { this.changePercent = changePercent; }

    // Existing BigDecimal and Metadata fields
    public BigDecimal getValue() { return value; }
    public void setValue(BigDecimal value) { this.value = value; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public LocalDate getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(LocalDate lastUpdated) { this.lastUpdated = lastUpdated; }

    @Override
    public String toString() {
        return "Index{" +
                "ticker='" + ticker + '\'' +
                ", name='" + name + '\'' +
                ", currentValue=" + currentValue +
                ", changePercent=" + changePercent +
                '}';
    }
}
