package com.unity3d.mediation;

import b3.h;
import com.ironsource.Bb;
import com.ironsource.Y8;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f50642a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50643b;

    /* renamed from: c, reason: collision with root package name */
    private final String f50644c;

    /* renamed from: d, reason: collision with root package name */
    private final Y8 f50645d;

    /* renamed from: e, reason: collision with root package name */
    private final Bb f50646e;

    /* renamed from: f, reason: collision with root package name */
    private final LevelPlayAdSize f50647f;

    /* renamed from: g, reason: collision with root package name */
    private final String f50648g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, Object> f50649h;

    public LevelPlayAdInfo(String adId, String adUnitId, String adFormat, Y8 y82, Bb bb2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        e0.checkNotNullParameter(adId, "adId");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(adFormat, "adFormat");
        e0.checkNotNullParameter(adapterData, "adapterData");
        this.f50642a = adId;
        this.f50643b = adUnitId;
        this.f50644c = adFormat;
        this.f50645d = y82;
        this.f50646e = bb2;
        this.f50647f = levelPlayAdSize;
        this.f50648g = str;
        this.f50649h = adapterData;
    }

    private final String a() {
        return this.f50642a;
    }

    private final String b() {
        return this.f50643b;
    }

    private final String c() {
        return this.f50644c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, Y8 y82, Bb bb2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = levelPlayAdInfo.f50642a;
        }
        if ((i10 & 2) != 0) {
            str2 = levelPlayAdInfo.f50643b;
        }
        if ((i10 & 4) != 0) {
            str3 = levelPlayAdInfo.f50644c;
        }
        if ((i10 & 8) != 0) {
            y82 = levelPlayAdInfo.f50645d;
        }
        if ((i10 & 16) != 0) {
            bb2 = levelPlayAdInfo.f50646e;
        }
        if ((i10 & 32) != 0) {
            levelPlayAdSize = levelPlayAdInfo.f50647f;
        }
        if ((i10 & 64) != 0) {
            str4 = levelPlayAdInfo.f50648g;
        }
        if ((i10 & 128) != 0) {
            map = levelPlayAdInfo.f50649h;
        }
        String str5 = str4;
        Map map2 = map;
        Bb bb3 = bb2;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        return levelPlayAdInfo.copy(str, str2, str3, y82, bb3, levelPlayAdSize2, str5, map2);
    }

    private final Y8 d() {
        return this.f50645d;
    }

    private final Bb e() {
        return this.f50646e;
    }

    private final LevelPlayAdSize f() {
        return this.f50647f;
    }

    private final String g() {
        return this.f50648g;
    }

    private final Map<String, Object> h() {
        return this.f50649h;
    }

    public final LevelPlayAdInfo copy(String adId, String adUnitId, String adFormat, Y8 y82, Bb bb2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        e0.checkNotNullParameter(adId, "adId");
        e0.checkNotNullParameter(adUnitId, "adUnitId");
        e0.checkNotNullParameter(adFormat, "adFormat");
        e0.checkNotNullParameter(adapterData, "adapterData");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, y82, bb2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return e0.areEqual(this.f50642a, levelPlayAdInfo.f50642a) && e0.areEqual(this.f50643b, levelPlayAdInfo.f50643b) && e0.areEqual(this.f50644c, levelPlayAdInfo.f50644c) && e0.areEqual(this.f50645d, levelPlayAdInfo.f50645d) && e0.areEqual(this.f50646e, levelPlayAdInfo.f50646e) && e0.areEqual(this.f50647f, levelPlayAdInfo.f50647f) && e0.areEqual(this.f50648g, levelPlayAdInfo.f50648g) && e0.areEqual(this.f50649h, levelPlayAdInfo.f50649h);
    }

    public final String getAb() {
        Y8 y82 = this.f50645d;
        String strA = y82 != null ? y82.a() : null;
        return strA == null ? "" : strA;
    }

    public final String getAdFormat() {
        Y8 y82 = this.f50645d;
        String strB = y82 != null ? y82.b() : null;
        return strB == null ? this.f50644c : strB;
    }

    public final String getAdId() {
        return this.f50642a;
    }

    public final String getAdNetwork() {
        Y8 y82 = this.f50645d;
        String strC = y82 != null ? y82.c() : null;
        return strC == null ? "" : strC;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f50647f;
    }

    public final String getAdUnitId() {
        Y8 y82 = this.f50645d;
        String strK = y82 != null ? y82.k() : null;
        return strK == null ? this.f50643b : strK;
    }

    public final String getAdUnitName() {
        Y8 y82 = this.f50645d;
        String strL = y82 != null ? y82.l() : null;
        return strL == null ? "" : strL;
    }

    public final String getAuctionId() {
        Y8 y82 = this.f50645d;
        String strE = y82 != null ? y82.e() : null;
        return strE == null ? "" : strE;
    }

    public final String getCountry() {
        Y8 y82 = this.f50645d;
        String strF = y82 != null ? y82.f() : null;
        return strF == null ? "" : strF;
    }

    public final String getCreativeId() {
        Y8 y82 = this.f50645d;
        String strG = y82 != null ? y82.g() : null;
        return strG == null ? "" : strG;
    }

    public final String getEncryptedCPM() {
        Y8 y82 = this.f50645d;
        String strH = y82 != null ? y82.h() : null;
        return strH == null ? "" : strH;
    }

    public final String getInstanceId() {
        Y8 y82 = this.f50645d;
        String strI = y82 != null ? y82.i() : null;
        return strI == null ? "" : strI;
    }

    public final String getInstanceName() {
        Y8 y82 = this.f50645d;
        String strJ = y82 != null ? y82.j() : null;
        return strJ == null ? "" : strJ;
    }

    public final String getPlacementName() {
        String str = this.f50648g;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        String strC;
        Bb bb2 = this.f50646e;
        if (bb2 != null && (strC = bb2.c()) != null) {
            return strC;
        }
        Y8 y82 = this.f50645d;
        String strN = y82 != null ? y82.n() : null;
        return strN == null ? "" : strN;
    }

    public final double getRevenue() {
        Bb bb2 = this.f50646e;
        if (bb2 != null) {
            return bb2.d();
        }
        Y8 y82 = this.f50645d;
        Double dO = y82 != null ? y82.o() : null;
        if (dO != null) {
            return dO.doubleValue();
        }
        return 0.0d;
    }

    public final String getSegmentName() {
        Y8 y82 = this.f50645d;
        String strP = y82 != null ? y82.p() : null;
        return strP == null ? "" : strP;
    }

    public int hashCode() {
        int iE = o2.e(o2.e(this.f50642a.hashCode() * 31, 31, this.f50643b), 31, this.f50644c);
        Y8 y82 = this.f50645d;
        int iHashCode = (iE + (y82 == null ? 0 : y82.hashCode())) * 31;
        Bb bb2 = this.f50646e;
        int iHashCode2 = (iHashCode + (bb2 == null ? 0 : bb2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.f50647f;
        int iHashCode3 = (iHashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f50648g;
        return this.f50649h.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String adId = getAdId();
        String adUnitId = getAdUnitId();
        String adUnitName = getAdUnitName();
        LevelPlayAdSize levelPlayAdSize = this.f50647f;
        String adFormat = getAdFormat();
        String placementName = getPlacementName();
        String auctionId = getAuctionId();
        String country = getCountry();
        String ab2 = getAb();
        String segmentName = getSegmentName();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        double revenue = getRevenue();
        String precision = getPrecision();
        String encryptedCPM = getEncryptedCPM();
        String creativeId = getCreativeId();
        StringBuilder sbB = h.b("adId: ", adId, ", adUnitId: ", adUnitId, ", adUnitName: ");
        sbB.append(adUnitName);
        sbB.append(", adSize: ");
        sbB.append(levelPlayAdSize);
        sbB.append(", adFormat: ");
        com.google.android.gms.internal.play_billing.a.B(sbB, adFormat, ", placementName: ", placementName, ", auctionId: ");
        com.google.android.gms.internal.play_billing.a.B(sbB, auctionId, ", country: ", country, ", ab: ");
        com.google.android.gms.internal.play_billing.a.B(sbB, ab2, ", segmentName: ", segmentName, ", adNetwork: ");
        com.google.android.gms.internal.play_billing.a.B(sbB, adNetwork, ", instanceName: ", instanceName, ", instanceId: ");
        sbB.append(instanceId);
        sbB.append(", revenue: ");
        sbB.append(revenue);
        com.google.android.gms.internal.play_billing.a.B(sbB, ", precision: ", precision, ", encryptedCPM: ", encryptedCPM);
        return j1.o2.o(sbB, ", creativeId: ", creativeId);
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, Y8 y82, Bb bb2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i10, u uVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : y82, (i10 & 16) != 0 ? null : bb2, (i10 & 32) != 0 ? null : levelPlayAdSize, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? p1.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(LevelPlayAdInfo adInfo, String str) {
        this(adInfo.f50642a, adInfo.f50643b, adInfo.f50644c, adInfo.f50645d, adInfo.f50646e, adInfo.f50647f, str, adInfo.f50649h);
        e0.checkNotNullParameter(adInfo, "adInfo");
    }
}
