package com.unity3d.ads.adplayer;

import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final boolean isOfferwallAd;
    private final boolean isScarAd;
    private final String offerwallPlacementName;
    private final String placementId;
    private final String scarAdString;
    private final String scarAdUnitId;
    private final String scarQueryId;
    private final Map<String, Object> unityAdsShowOptions;

    public AndroidShowOptions(Map<String, ? extends Object> map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5) {
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z10;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
        this.isOfferwallAd = z11;
        this.offerwallPlacementName = str5;
    }

    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        if ((i10 & 2) != 0) {
            str = androidShowOptions.placementId;
        }
        if ((i10 & 4) != 0) {
            z10 = androidShowOptions.isScarAd;
        }
        if ((i10 & 8) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        if ((i10 & 16) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        if ((i10 & 32) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        if ((i10 & 64) != 0) {
            z11 = androidShowOptions.isOfferwallAd;
        }
        if ((i10 & 128) != 0) {
            str5 = androidShowOptions.offerwallPlacementName;
        }
        boolean z12 = z11;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        return androidShowOptions.copy(map, str, z10, str2, str7, str8, z12, str6);
    }

    public final Map<String, Object> component1() {
        return this.unityAdsShowOptions;
    }

    public final String component2() {
        return this.placementId;
    }

    public final boolean component3() {
        return this.isScarAd;
    }

    public final String component4() {
        return this.scarQueryId;
    }

    public final String component5() {
        return this.scarAdString;
    }

    public final String component6() {
        return this.scarAdUnitId;
    }

    public final boolean component7() {
        return this.isOfferwallAd;
    }

    public final String component8() {
        return this.offerwallPlacementName;
    }

    public final AndroidShowOptions copy(Map<String, ? extends Object> map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5) {
        return new AndroidShowOptions(map, str, z10, str2, str3, str4, z11, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return e0.areEqual(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && e0.areEqual(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && e0.areEqual(this.scarQueryId, androidShowOptions.scarQueryId) && e0.areEqual(this.scarAdString, androidShowOptions.scarAdString) && e0.areEqual(this.scarAdUnitId, androidShowOptions.scarAdUnitId) && this.isOfferwallAd == androidShowOptions.isOfferwallAd && e0.areEqual(this.offerwallPlacementName, androidShowOptions.offerwallPlacementName);
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Map<String, Object> map = this.unityAdsShowOptions;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.placementId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.isScarAd;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode2 + i10) * 31;
        String str2 = this.scarQueryId;
        int iHashCode3 = (i11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z11 = this.isOfferwallAd;
        int i12 = (iHashCode5 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str5 = this.offerwallPlacementName;
        return i12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidShowOptions(unityAdsShowOptions=");
        sb2.append(this.unityAdsShowOptions);
        sb2.append(", placementId=");
        sb2.append(this.placementId);
        sb2.append(", isScarAd=");
        sb2.append(this.isScarAd);
        sb2.append(", scarQueryId=");
        sb2.append(this.scarQueryId);
        sb2.append(", scarAdString=");
        sb2.append(this.scarAdString);
        sb2.append(", scarAdUnitId=");
        sb2.append(this.scarAdUnitId);
        sb2.append(", isOfferwallAd=");
        sb2.append(this.isOfferwallAd);
        sb2.append(", offerwallPlacementName=");
        return o2.q(sb2, this.offerwallPlacementName, ')');
    }

    public /* synthetic */ AndroidShowOptions(Map map, String str, boolean z10, String str2, String str3, String str4, boolean z11, String str5, int i10, u uVar) {
        this(map, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? null : str5);
    }
}
