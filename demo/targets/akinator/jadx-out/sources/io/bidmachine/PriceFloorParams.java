package io.bidmachine;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PriceFloorParams implements up.j {
    private final Map<String, Double> priceFloorsMap = new HashMap();

    public Map<String, Double> getPriceFloors() {
        return this.priceFloorsMap;
    }

    @Override // up.j
    public PriceFloorParams addPriceFloor(double d10) {
        addPriceFloor(UUID.randomUUID().toString(), d10);
        return this;
    }

    @Override // up.j
    public PriceFloorParams addPriceFloor(String str, double d10) {
        this.priceFloorsMap.put(str, Double.valueOf(d10));
        return this;
    }
}
