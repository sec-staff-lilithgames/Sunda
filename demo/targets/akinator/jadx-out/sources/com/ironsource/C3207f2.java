package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3207f2 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3486v0 f36675a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f36676b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f36677c;

    /* renamed from: d, reason: collision with root package name */
    private final StringBuilder f36678d;

    public C3207f2(AbstractC3486v0 adUnitData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitData, "adUnitData");
        this.f36675a = adUnitData;
        this.f36676b = new HashMap();
        this.f36677c = new ArrayList();
        this.f36678d = new StringBuilder();
    }

    public final Map<String, Object> a() {
        return this.f36676b;
    }

    public final List<String> b() {
        return this.f36677c;
    }

    public final StringBuilder c() {
        return this.f36678d;
    }

    public final boolean d() {
        return (this.f36676b.isEmpty() && this.f36677c.isEmpty()) ? false : true;
    }

    public final void a(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        List<String> list = this.f36677c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb2 = this.f36678d;
        sb2.append(providerSettings.getInstanceType(this.f36675a.b().a()));
        sb2.append(providerSettings.getProviderInstanceName());
        sb2.append(",");
    }

    public final void a(NetworkSettings providerSettings, Map<String, ? extends Object> biddingData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.f36675a.b().a()), biddingData);
    }

    public final void a(D3 biddingResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(biddingResponse, "biddingResponse");
        String strC = biddingResponse.c();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC, "biddingResponse.instanceName");
        int iD = biddingResponse.d();
        Map<String, Object> mapA = biddingResponse.a();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapA, "biddingResponse.biddingData");
        a(strC, iD, mapA);
    }

    private final void a(String str, int i10, Map<String, ? extends Object> map) {
        this.f36676b.put(str, map);
        StringBuilder sb2 = this.f36678d;
        sb2.append(i10);
        sb2.append(str);
        sb2.append(",");
    }
}
