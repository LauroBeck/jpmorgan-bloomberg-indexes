package com.jpmorgan.bloomberg.model;

import java.time.LocalDateTime;

public class BloombergIndex {
    private String indexName;
    private String indexCode;
    private double currentValue;
    private double previousClose;
    private double change;
    private double changePercent;
    private LocalDateTime timestamp;

    public BloombergIndex(String indexCode, String indexName, double currentValue, double previousClose) {
        this.indexCode = indexCode;
        this.indexName = indexName;
        this.currentValue = currentValue;
        this.previousClose = previousClose;
        this.change = currentValue - previousClose;
        this.changePercent = (this.change / previousClose) * 100;
        this.timestamp = LocalDateTime.now();
    }

    public String getIndexCode() { return indexCode; }
    public void setIndexCode(String indexCode) { this.indexCode = indexCode; }

    public String getIndexName() { return indexName; }
    public void setIndexName(String indexName) { this.indexName = indexName; }

    public double getCurrentValue() { return currentValue; }
    public void setCurrentValue(double currentValue) { this.currentValue = currentValue; }

    public double getPreviousClose() { return previousClose; }
    public void setPreviousClose(double previousClose) { this.previousClose = previousClose; }

    public double getChange() { return change; }
    public void setChange(double change) { this.change = change; }

    public double getChangePercent() { return changePercent; }
    public void setChangePercent(double changePercent) { this.changePercent = changePercent; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}