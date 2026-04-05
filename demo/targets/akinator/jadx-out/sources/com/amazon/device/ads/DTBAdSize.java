package com.amazon.device.ads;

import com.amazon.aps.ads.model.ApsSlotInfoExtra;
import com.ironsource.C3191e4;
import j1.o2;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdSize {
    public static final String AAX_INTERSTITIAL_AD_SIZE = "interstitial";
    public final AdType adType;
    public final int height;
    public JSONObject pubSettings;
    public ApsSlotInfoExtra slotInfoExtra;
    public final String slotUUID;
    public final int width;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class DTBInterstitialAdSize extends DTBAdSize {
        public DTBInterstitialAdSize(String str) {
            super(9999, 9999, AdType.INTERSTITIAL, str, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class DTBVideo extends DTBAdSize {
        public DTBVideo(int i10, int i11, String str) {
            super(i10, i11, AdType.VIDEO, str, null);
        }

        public DTBVideo(int i10, int i11, String str, JSONObject jSONObject) {
            super(i10, i11, AdType.VIDEO, str, jSONObject);
        }
    }

    public DTBAdSize(int i10, int i11, String str) {
        this(i10, i11, AdType.DISPLAY, str, null);
        if (i10 == 9999 || i11 == 9999) {
            throw new IllegalArgumentException("Invalid size passed, Please use DTBInterstitialAdSize for interstitial ads.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DTBAdSize dTBAdSize = (DTBAdSize) obj;
        return this.height == dTBAdSize.height && this.width == dTBAdSize.width;
    }

    public AdType getDTBAdType() {
        return this.adType;
    }

    public int getHeight() {
        return this.height;
    }

    public JSONObject getPubSettings() {
        return this.pubSettings;
    }

    public ApsSlotInfoExtra getSlotInfoExtra() {
        return this.slotInfoExtra;
    }

    public String getSlotUUID() {
        return this.slotUUID;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((this.height + 31) * 31) + this.width;
    }

    public boolean isInterstitialAd() {
        return this.adType.equals(AdType.INTERSTITIAL);
    }

    public void setPubSettings(JSONObject jSONObject) {
        this.pubSettings = jSONObject;
    }

    public void setSlotInfoExtra(ApsSlotInfoExtra apsSlotInfoExtra) {
        this.slotInfoExtra = apsSlotInfoExtra;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DTBAdSize [");
        sb2.append(this.width);
        sb2.append("x");
        sb2.append(this.height);
        sb2.append(", adType=");
        sb2.append(this.adType);
        sb2.append(", slotUUID=");
        return o2.o(sb2, this.slotUUID, C3191e4.i.f36531e);
    }

    public DTBAdSize(int i10, int i11, AdType adType, String str, JSONObject jSONObject) {
        if (i10 >= 0 && i11 >= 0 && !DtbCommonUtils.isNullOrEmpty(str)) {
            this.width = i10;
            this.height = i11;
            this.adType = adType;
            this.slotUUID = str;
            this.pubSettings = jSONObject;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
    }

    public DTBAdSize(int i10, int i11, AdType adType, String str) {
        this(i10, i11, adType, str, null);
        if (i10 < 0 || i11 < 0 || DtbCommonUtils.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("Invalid parameter(s) passed to DTBAdSize constructor.");
        }
    }
}
