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

        indexes.add(new Index("CCMP", "Nasdaq Composite", 22387.68, -1.59));
        indexes.add(new Index("SPX", "S&P 500 Index", 6740.02, -1.33));
        indexes.add(new Index("BCOM", "Bloomberg Commodity", 131.49, 3.70));
        indexes.add(new Index("JPM-EMBI", "JPM Emerging Markets Bond", 1025.62, -0.65));
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
