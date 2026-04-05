package com.inmobi.ads;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class WatermarkData {
    private float alpha;
    private final String watermarkBase64EncodedString;

    public WatermarkData(String watermarkBase64EncodedString, float f10) {
        e0.checkNotNullParameter(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        this.watermarkBase64EncodedString = watermarkBase64EncodedString;
        this.alpha = f10;
    }

    public static /* synthetic */ WatermarkData copy$default(WatermarkData watermarkData, String str, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = watermarkData.watermarkBase64EncodedString;
        }
        if ((i10 & 2) != 0) {
            f10 = watermarkData.alpha;
        }
        return watermarkData.copy(str, f10);
    }

    public final String component1() {
        return this.watermarkBase64EncodedString;
    }

    public final float component2() {
        return this.alpha;
    }

    public final WatermarkData copy(String watermarkBase64EncodedString, float f10) {
        e0.checkNotNullParameter(watermarkBase64EncodedString, "watermarkBase64EncodedString");
        return new WatermarkData(watermarkBase64EncodedString, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatermarkData)) {
            return false;
        }
        WatermarkData watermarkData = (WatermarkData) obj;
        return e0.areEqual(this.watermarkBase64EncodedString, watermarkData.watermarkBase64EncodedString) && Float.compare(this.alpha, watermarkData.alpha) == 0;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final String getWatermarkBase64EncodedString() {
        return this.watermarkBase64EncodedString;
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + (this.watermarkBase64EncodedString.hashCode() * 31);
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WatermarkData(watermarkBase64EncodedString=");
        sb2.append(this.watermarkBase64EncodedString);
        sb2.append(", alpha=");
        return a.b.n(sb2, this.alpha, ')');
    }

    public /* synthetic */ WatermarkData(String str, float f10, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? 1.0f : f10);
    }
}
