package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.WatermarkData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final String f32224a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32225b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32226c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32227d;

    /* renamed from: e, reason: collision with root package name */
    public final String f32228e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32229f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32230g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32231h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC2692b0 f32232i;

    /* renamed from: j, reason: collision with root package name */
    public final String f32233j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f32234k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f32235l;

    /* renamed from: m, reason: collision with root package name */
    public final WatermarkData f32236m;

    /* renamed from: n, reason: collision with root package name */
    public final AdQualityControl f32237n;

    /* renamed from: o, reason: collision with root package name */
    public final byte f32238o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f32239p;

    /* renamed from: q, reason: collision with root package name */
    public final String f32240q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f32241r;

    /* renamed from: s, reason: collision with root package name */
    public final String f32242s;

    /* renamed from: t, reason: collision with root package name */
    public final Bc f32243t;

    /* renamed from: u, reason: collision with root package name */
    public final F5 f32244u;

    /* renamed from: v, reason: collision with root package name */
    public final long f32245v;

    public S(String str, boolean z10, long j10, boolean z11, String str2, String str3, String str4, String str5, InterfaceC2692b0 interfaceC2692b0, String str6, Map map, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b10, Set set, String str7, boolean z12, String landingScheme, Bc bc2, F5 f52, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(landingScheme, "landingScheme");
        this.f32224a = str;
        this.f32225b = z10;
        this.f32226c = j10;
        this.f32227d = z11;
        this.f32228e = str2;
        this.f32229f = str3;
        this.f32230g = str4;
        this.f32231h = str5;
        this.f32232i = interfaceC2692b0;
        this.f32233j = str6;
        this.f32234k = map;
        this.f32235l = bool;
        this.f32236m = watermarkData;
        this.f32237n = adQualityControl;
        this.f32238o = b10;
        this.f32239p = set;
        this.f32240q = str7;
        this.f32241r = z12;
        this.f32242s = landingScheme;
        this.f32243t = bc2;
        this.f32244u = f52;
        this.f32245v = j11;
    }

    public static S a(S s10, Bc bc2, int i10) {
        boolean z10;
        Bc bc3;
        String str = s10.f32224a;
        boolean z11 = s10.f32225b;
        long j10 = s10.f32226c;
        boolean z12 = s10.f32227d;
        String str2 = s10.f32228e;
        String str3 = s10.f32229f;
        String str4 = s10.f32230g;
        String str5 = s10.f32231h;
        String str6 = s10.f32233j;
        Map map = s10.f32234k;
        Boolean bool = s10.f32235l;
        WatermarkData watermarkData = (i10 & 4096) != 0 ? s10.f32236m : null;
        AdQualityControl adQualityControl = s10.f32237n;
        byte b10 = s10.f32238o;
        Set set = s10.f32239p;
        String str7 = s10.f32240q;
        boolean z13 = s10.f32241r;
        String landingScheme = s10.f32242s;
        if ((i10 & 524288) != 0) {
            z10 = z11;
            bc3 = s10.f32243t;
        } else {
            z10 = z11;
            bc3 = bc2;
        }
        F5 f52 = s10.f32244u;
        long j11 = s10.f32245v;
        kotlin.jvm.internal.e0.checkNotNullParameter(landingScheme, "landingScheme");
        return new S(str, z10, j10, z12, str2, str3, str4, str5, null, str6, map, bool, watermarkData, adQualityControl, b10, set, str7, z13, landingScheme, bc3, f52, j11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32224a, s10.f32224a) && this.f32225b == s10.f32225b && this.f32226c == s10.f32226c && this.f32227d == s10.f32227d && kotlin.jvm.internal.e0.areEqual(this.f32228e, s10.f32228e) && kotlin.jvm.internal.e0.areEqual(this.f32229f, s10.f32229f) && kotlin.jvm.internal.e0.areEqual(this.f32230g, s10.f32230g) && kotlin.jvm.internal.e0.areEqual(this.f32231h, s10.f32231h) && kotlin.jvm.internal.e0.areEqual(this.f32232i, s10.f32232i) && kotlin.jvm.internal.e0.areEqual(this.f32233j, s10.f32233j) && kotlin.jvm.internal.e0.areEqual(this.f32234k, s10.f32234k) && kotlin.jvm.internal.e0.areEqual(this.f32235l, s10.f32235l) && kotlin.jvm.internal.e0.areEqual(this.f32236m, s10.f32236m) && kotlin.jvm.internal.e0.areEqual(this.f32237n, s10.f32237n) && this.f32238o == s10.f32238o && kotlin.jvm.internal.e0.areEqual(this.f32239p, s10.f32239p) && kotlin.jvm.internal.e0.areEqual(this.f32240q, s10.f32240q) && this.f32241r == s10.f32241r && kotlin.jvm.internal.e0.areEqual(this.f32242s, s10.f32242s) && kotlin.jvm.internal.e0.areEqual(this.f32243t, s10.f32243t) && kotlin.jvm.internal.e0.areEqual(this.f32244u, s10.f32244u) && this.f32245v == s10.f32245v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f32224a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.f32225b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iD = p0.o2.d((iHashCode + i10) * 31, 31, this.f32226c);
        boolean z11 = this.f32227d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (iD + i11) * 31;
        String str2 = this.f32228e;
        int iHashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f32229f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f32230g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f32231h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InterfaceC2692b0 interfaceC2692b0 = this.f32232i;
        int iHashCode6 = (iHashCode5 + (interfaceC2692b0 == null ? 0 : interfaceC2692b0.hashCode())) * 31;
        String str6 = this.f32233j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map map = this.f32234k;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.f32235l;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        WatermarkData watermarkData = this.f32236m;
        int iHashCode10 = (iHashCode9 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.f32237n;
        int iHashCode11 = (Byte.hashCode(this.f32238o) + ((iHashCode10 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31;
        Set set = this.f32239p;
        int iHashCode12 = (iHashCode11 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.f32240q;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        boolean z12 = this.f32241r;
        int iE = p0.o2.e((iHashCode13 + (z12 ? 1 : z12 ? 1 : 0)) * 31, 31, this.f32242s);
        Bc bc2 = this.f32243t;
        int iHashCode14 = (iE + (bc2 == null ? 0 : bc2.hashCode())) * 31;
        F5 f52 = this.f32244u;
        return Long.hashCode(this.f32245v) + ((iHashCode14 + (f52 != null ? f52.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdMetaData(adType=");
        sb2.append(this.f32224a);
        sb2.append(", isImmersiveMode=");
        sb2.append(this.f32225b);
        sb2.append(", placementId=");
        sb2.append(this.f32226c);
        sb2.append(", allowAutoRedirection=");
        sb2.append(this.f32227d);
        sb2.append(", creativeId=");
        sb2.append(this.f32228e);
        sb2.append(", creativeType=");
        sb2.append(this.f32229f);
        sb2.append(", markupTypeAdUnit=");
        sb2.append(this.f32230g);
        sb2.append(", adSize=");
        sb2.append(this.f32231h);
        sb2.append(", adPodHandler=");
        sb2.append(this.f32232i);
        sb2.append(", contentURL=");
        sb2.append(this.f32233j);
        sb2.append(", telemetryManagerMap=");
        sb2.append(this.f32234k);
        sb2.append(", isHardwareAccelerationDisabled=");
        sb2.append(this.f32235l);
        sb2.append(", watermarkData=");
        sb2.append(this.f32236m);
        sb2.append(", adQualityControl=");
        sb2.append(this.f32237n);
        sb2.append(", placementType=");
        sb2.append((int) this.f32238o);
        sb2.append(", viewabilityTrackers=");
        sb2.append(this.f32239p);
        sb2.append(", impressionId=");
        sb2.append(this.f32240q);
        sb2.append(", isInAppBrowser=");
        sb2.append(this.f32241r);
        sb2.append(", landingScheme=");
        sb2.append(this.f32242s);
        sb2.append(", renderViewMetaData=");
        sb2.append(this.f32243t);
        sb2.append(", logger=");
        sb2.append(this.f32244u);
        sb2.append(", viewTouchTimestamp=");
        return e3.g.n(sb2, this.f32245v, ')');
    }

    public /* synthetic */ S(String str, boolean z10, long j10, boolean z11, String str2, String str3, String str4, String str5, U0 u02, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b10, Set set, String str7, String str8, Bc bc2, F5 f52, int i10) {
        this(str, z10, j10, z11, str2, (i10 & 32) != 0 ? null : str3, str4, (i10 & 128) != 0 ? null : str5, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : u02, (i10 & 512) != 0 ? null : str6, (i10 & 1024) != 0 ? null : linkedHashMap, bool, (i10 & 4096) != 0 ? null : watermarkData, adQualityControl, b10, set, str7, false, (262144 & i10) != 0 ? "DEFAULT" : str8, (i10 & 524288) != 0 ? null : bc2, f52, -1L);
    }
}
