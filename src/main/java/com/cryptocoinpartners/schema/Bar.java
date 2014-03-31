package com.cryptocoinpartners.schema;

import org.joda.time.Instant;

import javax.annotation.Nullable;
import java.math.BigDecimal;


/**
 * @author Tim Olson
 */
public class Bar extends MarketData {
    public Bar( Instant time, Listing listing,
                BigDecimal open, BigDecimal high, BigDecimal low, BigDecimal close, @Nullable BigDecimal volume ) {
        super(time, null, listing);
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
    }


    public BigDecimal getOpen() { return open; }
    public BigDecimal getHigh() { return high; }
    public BigDecimal getLow() { return low; }
    public BigDecimal getClose() { return close; }
    public @Nullable BigDecimal getVolume() { return volume; }


    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;
    private @Nullable BigDecimal volume;
}