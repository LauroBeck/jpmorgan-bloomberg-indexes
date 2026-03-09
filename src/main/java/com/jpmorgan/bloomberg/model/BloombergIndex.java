package com.jpmorgan.bloomberg.model;

public class BloombergIndex extends Index {
    private double currentValue;
    private double change;        // The nominal point change
    private double changePercent; // The percentage change

    // Standard constructor for the 4-arg call
    public BloombergIndex(String ticker, String name, double currentValue, double changePercent) {
        setTicker(ticker);
        setName(name);
        this.currentValue = currentValue;
        this.changePercent = changePercent;
    }

    public BloombergIndex() {}

    // Methods for Current Value
    public double getCurrentValue() { return currentValue; }
    public void setCurrentValue(double currentValue) { this.currentValue = currentValue; }

    // Methods for Nominal Change (The missing symbols)
    public double getChange() { return change; }
    public void setChange(double change) { this.change = change; }

    // Methods for Percentage Change
    public double getChangePercent() { return changePercent; }
    public void setChangePercent(double changePercent) { this.changePercent = changePercent; }
}
