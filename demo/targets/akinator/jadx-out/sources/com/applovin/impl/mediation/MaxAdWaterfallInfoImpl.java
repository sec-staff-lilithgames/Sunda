package com.applovin.impl.mediation;

import com.applovin.impl.v2;
import com.applovin.impl.x2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final v2 f14471a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14472b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14473c;

    /* renamed from: d, reason: collision with root package name */
    private final List f14474d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14475e;

    /* renamed from: f, reason: collision with root package name */
    private final x2 f14476f;

    /* renamed from: g, reason: collision with root package name */
    private final List f14477g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14478h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14479i;

    public MaxAdWaterfallInfoImpl(v2 v2Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(v2Var, v2Var.S(), v2Var.T(), j10, list, v2Var.M(), v2Var.R(), str, v2Var.P());
    }

    public String getEventId() {
        return this.f14479i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f14475e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f14471a;
    }

    public String getMCode() {
        return this.f14478h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f14472b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f14474d;
    }

    public List<String> getPostbackUrls() {
        return this.f14477g;
    }

    public x2 getRequestParameters() {
        return this.f14476f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f14473c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdWaterfallInfo{name=");
        sb2.append(this.f14472b);
        sb2.append(", testName=");
        sb2.append(this.f14473c);
        sb2.append(", networkResponses=");
        sb2.append(this.f14474d);
        sb2.append(", latencyMillis=");
        return e3.g.n(sb2, this.f14475e, AbstractJsonLexerKt.END_OBJ);
    }

    public MaxAdWaterfallInfoImpl(v2 v2Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, x2 x2Var, List<String> list2, String str3, String str4) {
        this.f14471a = v2Var;
        this.f14472b = str;
        this.f14473c = str2;
        this.f14475e = j10;
        this.f14474d = list;
        this.f14476f = x2Var;
        this.f14477g = list2;
        this.f14478h = str3;
        this.f14479i = str4;
    }
}
