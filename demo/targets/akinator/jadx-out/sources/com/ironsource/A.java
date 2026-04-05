package com.ironsource;

import com.ironsource.C3385p0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3486v0 f33743a;

    /* renamed from: b, reason: collision with root package name */
    private final NetworkSettings f33744b;

    /* renamed from: c, reason: collision with root package name */
    private final C3296k2 f33745c;

    /* renamed from: d, reason: collision with root package name */
    private final C3134b1 f33746d;

    /* renamed from: e, reason: collision with root package name */
    private final C3352n2 f33747e;

    /* renamed from: f, reason: collision with root package name */
    private final int f33748f;

    /* renamed from: g, reason: collision with root package name */
    private final H f33749g;

    /* renamed from: h, reason: collision with root package name */
    private final IronSource.a f33750h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONObject f33751i;

    /* renamed from: j, reason: collision with root package name */
    private final String f33752j;

    /* renamed from: k, reason: collision with root package name */
    private final int f33753k;

    /* renamed from: l, reason: collision with root package name */
    private final String f33754l;

    /* renamed from: m, reason: collision with root package name */
    private final C3352n2 f33755m;

    /* renamed from: n, reason: collision with root package name */
    private final String f33756n;

    /* renamed from: o, reason: collision with root package name */
    private final String f33757o;

    /* renamed from: p, reason: collision with root package name */
    private final int f33758p;

    /* renamed from: q, reason: collision with root package name */
    private final AdData f33759q;

    public A(AbstractC3486v0 adUnitData, NetworkSettings providerSettings, C3296k2 auctionData, C3134b1 adapterConfig, C3352n2 auctionResponseItem, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        this.f33743a = adUnitData;
        this.f33744b = providerSettings;
        this.f33745c = auctionData;
        this.f33746d = adapterConfig;
        this.f33747e = auctionResponseItem;
        this.f33748f = i10;
        this.f33749g = new H(C3385p0.a.DidntAttemptToLoad);
        IronSource.a aVarA = adUnitData.b().a();
        this.f33750h = aVarA;
        this.f33751i = auctionData.h();
        this.f33752j = auctionData.g();
        this.f33753k = auctionData.i();
        this.f33754l = auctionData.f();
        this.f33755m = auctionData.j();
        String strF = adapterConfig.f();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strF, "adapterConfig.providerName");
        this.f33756n = strF;
        this.f33757o = b0.e2.m("%s %s", "format(format, *args)", 2, new Object[]{strF, Integer.valueOf(hashCode())});
        this.f33758p = adapterConfig.d();
        String strK = auctionResponseItem.k();
        Map<String, Object> mapA = C3286ja.a(auctionResponseItem.a());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA, "jsonObjectToMap(auctionResponseItem.adData)");
        mapA.put("adUnit", aVarA);
        HashMap map = new HashMap();
        Map<String, Object> mapA2 = C3286ja.a(adapterConfig.c());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA2, "jsonObjectToMap(adapterConfig.adUnitSettings)");
        map.putAll(mapA2);
        mapA.put("userId", adUnitData.r());
        mapA.put("adUnitId", adUnitData.b().c());
        mapA.put("isMultipleAdUnits", Boolean.TRUE);
        this.f33759q = new AdData(strK, map, mapA);
    }

    public final AbstractC3486v0 a() {
        return this.f33743a;
    }

    public final NetworkSettings b() {
        return this.f33744b;
    }

    public final C3296k2 c() {
        return this.f33745c;
    }

    public final C3134b1 d() {
        return this.f33746d;
    }

    public final C3352n2 e() {
        return this.f33747e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f33743a, a10.f33743a) && kotlin.jvm.internal.e0.areEqual(this.f33744b, a10.f33744b) && kotlin.jvm.internal.e0.areEqual(this.f33745c, a10.f33745c) && kotlin.jvm.internal.e0.areEqual(this.f33746d, a10.f33746d) && kotlin.jvm.internal.e0.areEqual(this.f33747e, a10.f33747e) && this.f33748f == a10.f33748f;
    }

    public final int f() {
        return this.f33748f;
    }

    public final AdData g() {
        return this.f33759q;
    }

    public final IronSource.a h() {
        return this.f33750h;
    }

    public int hashCode() {
        return Integer.hashCode(this.f33748f) + ((this.f33747e.hashCode() + ((this.f33746d.hashCode() + ((this.f33745c.hashCode() + ((this.f33744b.hashCode() + (this.f33743a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final AbstractC3486v0 i() {
        return this.f33743a;
    }

    public final C3134b1 j() {
        return this.f33746d;
    }

    public final C3296k2 k() {
        return this.f33745c;
    }

    public final String l() {
        return this.f33754l;
    }

    public final String m() {
        return this.f33752j;
    }

    public final C3352n2 n() {
        return this.f33747e;
    }

    public final int o() {
        return this.f33753k;
    }

    public final C3352n2 p() {
        return this.f33755m;
    }

    public final JSONObject q() {
        return this.f33751i;
    }

    public final String r() {
        return this.f33756n;
    }

    public final int s() {
        return this.f33758p;
    }

    public final H t() {
        return this.f33749g;
    }

    public String toString() {
        return "AdInstanceData(adUnitData=" + this.f33743a + ", providerSettings=" + this.f33744b + ", auctionData=" + this.f33745c + ", adapterConfig=" + this.f33746d + ", auctionResponseItem=" + this.f33747e + ", sessionDepth=" + this.f33748f + ")";
    }

    public final NetworkSettings u() {
        return this.f33744b;
    }

    public final int v() {
        return this.f33748f;
    }

    public final String w() {
        return this.f33757o;
    }

    public final A a(AbstractC3486v0 adUnitData, NetworkSettings providerSettings, C3296k2 auctionData, C3134b1 adapterConfig, C3352n2 auctionResponseItem, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionResponseItem, "auctionResponseItem");
        return new A(adUnitData, providerSettings, auctionData, adapterConfig, auctionResponseItem, i10);
    }

    public static /* synthetic */ A a(A a10, AbstractC3486v0 abstractC3486v0, NetworkSettings networkSettings, C3296k2 c3296k2, C3134b1 c3134b1, C3352n2 c3352n2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            abstractC3486v0 = a10.f33743a;
        }
        if ((i11 & 2) != 0) {
            networkSettings = a10.f33744b;
        }
        if ((i11 & 4) != 0) {
            c3296k2 = a10.f33745c;
        }
        if ((i11 & 8) != 0) {
            c3134b1 = a10.f33746d;
        }
        if ((i11 & 16) != 0) {
            c3352n2 = a10.f33747e;
        }
        if ((i11 & 32) != 0) {
            i10 = a10.f33748f;
        }
        C3352n2 c3352n22 = c3352n2;
        int i12 = i10;
        return a10.a(abstractC3486v0, networkSettings, c3296k2, c3134b1, c3352n22, i12);
    }

    public final void a(C3385p0.a performance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(performance, "performance");
        this.f33749g.b(performance);
    }
}
