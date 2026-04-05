package com.ironsource;

import io.odeeo.internal.h.vfsA.QCmNMSGd;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3296k2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f37051a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f37052b;

    /* renamed from: c, reason: collision with root package name */
    private final C3352n2 f37053c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37054d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37055e;

    public final String a() {
        return this.f37051a;
    }

    public final JSONObject b() {
        return this.f37052b;
    }

    public final C3352n2 c() {
        return this.f37053c;
    }

    public final int d() {
        return this.f37054d;
    }

    public final String e() {
        return this.f37055e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3296k2)) {
            return false;
        }
        C3296k2 c3296k2 = (C3296k2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f37051a, c3296k2.f37051a) && kotlin.jvm.internal.e0.areEqual(this.f37052b, c3296k2.f37052b) && kotlin.jvm.internal.e0.areEqual(this.f37053c, c3296k2.f37053c) && this.f37054d == c3296k2.f37054d && kotlin.jvm.internal.e0.areEqual(this.f37055e, c3296k2.f37055e);
    }

    public final String f() {
        return this.f37055e;
    }

    public final String g() {
        return this.f37051a;
    }

    public final JSONObject h() {
        return this.f37052b;
    }

    public int hashCode() {
        int iHashCode = this.f37051a.hashCode() * 31;
        JSONObject jSONObject = this.f37052b;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C3352n2 c3352n2 = this.f37053c;
        return this.f37055e.hashCode() + e3.g.d(this.f37054d, (iHashCode2 + (c3352n2 != null ? c3352n2.hashCode() : 0)) * 31, 31);
    }

    public final int i() {
        return this.f37054d;
    }

    public final C3352n2 j() {
        return this.f37053c;
    }

    public String toString() {
        String str = this.f37051a;
        JSONObject jSONObject = this.f37052b;
        C3352n2 c3352n2 = this.f37053c;
        int i10 = this.f37054d;
        String str2 = this.f37055e;
        StringBuilder sb2 = new StringBuilder("AuctionResponseData(auctionId=");
        sb2.append(str);
        sb2.append(", auctionResponseGenericParam=");
        sb2.append(jSONObject);
        sb2.append(", genericNotifications=");
        sb2.append(c3352n2);
        sb2.append(", auctionTrial=");
        sb2.append(i10);
        sb2.append(", auctionFallback=");
        return j1.o2.o(sb2, str2, ")");
    }

    public C3296k2(String str, JSONObject jSONObject, C3352n2 c3352n2, int i10, String auctionFallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, QCmNMSGd.oeHyZfJI);
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.f37051a = str;
        this.f37052b = jSONObject;
        this.f37053c = c3352n2;
        this.f37054d = i10;
        this.f37055e = auctionFallback;
    }

    public final C3296k2 a(String auctionId, JSONObject jSONObject, C3352n2 c3352n2, int i10, String auctionFallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionId, "auctionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C3296k2(auctionId, jSONObject, c3352n2, i10, auctionFallback);
    }

    public static /* synthetic */ C3296k2 a(C3296k2 c3296k2, String str, JSONObject jSONObject, C3352n2 c3352n2, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c3296k2.f37051a;
        }
        if ((i11 & 2) != 0) {
            jSONObject = c3296k2.f37052b;
        }
        if ((i11 & 4) != 0) {
            c3352n2 = c3296k2.f37053c;
        }
        if ((i11 & 8) != 0) {
            i10 = c3296k2.f37054d;
        }
        if ((i11 & 16) != 0) {
            str2 = c3296k2.f37055e;
        }
        String str3 = str2;
        C3352n2 c3352n22 = c3352n2;
        return c3296k2.a(str, jSONObject, c3352n22, i10, str3);
    }
}
