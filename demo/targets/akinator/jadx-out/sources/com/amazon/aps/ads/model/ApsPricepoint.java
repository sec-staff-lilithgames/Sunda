package com.amazon.aps.ads.model;

import com.amazon.aps.ads.ApsMigrationUtil;
import com.amazon.device.ads.DtbPricePoint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsPricepoint extends DtbPricePoint {
    private ApsAdType apsAdType;

    public ApsPricepoint(String str, String str2, String str3, ApsAdType apsAdType) {
        super(str, str2, str3, ApsMigrationUtil.getAdType(apsAdType));
        this.apsAdType = apsAdType;
    }
}
