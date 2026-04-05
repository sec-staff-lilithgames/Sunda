package com.amazon.device.ads;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbPricePoint {
    public final DTBAdSize adSize;
    public final String pricePoint;

    public DtbPricePoint(String str, String str2, String str3, AdType adType) {
        this.pricePoint = str;
        String[] strArrSplit = str2.split("x");
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException(a.b.l("AdSize ", str2, " is not valid"));
        }
        this.adSize = new DTBAdSize(DtbCommonUtils.parseInt(strArrSplit[0], 0), DtbCommonUtils.parseInt(strArrSplit[1], 0), adType, str3);
    }

    public DTBAdSize getAdSize() {
        return this.adSize;
    }

    public String getPricePoint() {
        return this.pricePoint;
    }

    public String toString() {
        return "DtbPricePoint [pricePoint=" + this.pricePoint + ", adSize=" + this.adSize + C3191e4.i.f36531e;
    }
}
