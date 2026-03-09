package com.jpmorgan.bloomberg.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Index {
    private String ticker;
    private String name;
    private double currentValue;
    private double changePercent;
    private BigDecimal value;
    private String currency = "USD";
    private LocalDate lastUpdated;

    public Index() {
        this.lastUpdated = LocalDate.now();
    }

    public Index(String ticker, String name, double currentValue, double changePercent) {
        this.ticker = ticker;
        this.name = name;
        this.currentValue = currentValue;
        this.changePercent = changePercent;
        this.value = BigDecimal.valueOf(currentValue);
        this.lastUpdated = LocalDate.now();
    }

    // Getters
    public String getTicker() { return ticker; }
    public String getName() { return name; }
    public double getCurrentValue() { return currentValue; }
    public double getChangePercent() { return changePercent; }
    public BigDecimal getValue() { return value; }
    public String getCurrency() { return currency; }
    public LocalDate getLastUpdated() { return lastUpdated; }

    // Setters
    public void setTicker(String ticker) { this.ticker = ticker; }
    public void setName(String name) { this.name = name; }
    public void setCurrentValue(double currentValue) { 
        this.currentValue = currentValue; 
        this.value = BigDecimal.valueOf(currentValue);
    }
    public void setChangePercent(double changePercent) { this.changePercent = changePercent; }
}
