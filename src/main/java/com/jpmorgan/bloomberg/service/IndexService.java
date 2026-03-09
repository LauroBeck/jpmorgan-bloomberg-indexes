package com.jpmorgan.bloomberg.service;

import com.jpmorgan.bloomberg.model.Index;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service layer to handle Bloomberg Index data retrieval and business logic.
 */
public class IndexService {

    /**
     * Retrieves a list of active JPMorgan and Bloomberg Indexes.
     * Uses the new 4-arg constructor: (Ticker, Name, CurrentValue, ChangePercent)
     */
    public List<Index> getAllIndexes() {
        List<Index> indexes = new ArrayList<>();

        indexes.add(new Index("BCOM", "Bloomberg Commodity Index", 98.45, 0.12));
        indexes.add(new Index("JPM-EMBI", "JPM Emerging Markets Bond", 104.20, -0.45));
        indexes.add(new Index("SPX", "S&P 500 Index", 5123.30, 1.20));
        indexes.add(new Index("CCMP", "Nasdaq Composite", 16274.94, 0.85));

        return indexes;
    }

    /**
     * Finds a specific index by its Bloomberg Ticker.
     */
    public Optional<Index> getIndexByTicker(String ticker) {
        return getAllIndexes().stream()
                .filter(i -> i.getTicker().equalsIgnoreCase(ticker))
                .findFirst();
    }
}
