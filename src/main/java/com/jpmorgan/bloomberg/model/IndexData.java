package com.jpmorgan.bloomberg.model;

import java.util.HashMap;
import java.util.Map;

public class IndexData {
    private static final Map<String, BloombergIndex> indexMap = new HashMap<>();

    static {
        indexMap.put("SP500", new BloombergIndex("SP500", "S&P 500", 5432.50, 5420.15));
        indexMap.put("RUSSELL2K", new BloombergIndex("RUSSELL2K", "Russell 2000", 2089.75, 2081.30));
        indexMap.put("NASDAQ", new BloombergIndex("NASDAQ", "NASDAQ Composite", 17945.20, 17925.80));
        indexMap.put("DOWJONES", new BloombergIndex("DOWJONES", "Dow Jones Industrial Average", 38756.50, 38720.30));
    }

    public static BloombergIndex getIndex(String indexCode) {
        return indexMap.get(indexCode);
    }

    public static Map<String, BloombergIndex> getAllIndexes() {
        return new HashMap<>(indexMap);
    }

    public static void updateIndex(String indexCode, double newValue) {
        BloombergIndex index = indexMap.get(indexCode);
        if (index != null) {
            double previousClose = index.getCurrentValue();
            index.setCurrentValue(newValue);
            index.setChange(newValue - previousClose);
            index.setChangePercent((index.getChange() / previousClose) * 100);
        }
    }
}