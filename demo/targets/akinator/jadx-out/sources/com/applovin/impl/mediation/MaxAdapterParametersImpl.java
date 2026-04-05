package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.b5;
import com.applovin.impl.h3;
import com.applovin.impl.v2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f14480a;

    /* renamed from: b, reason: collision with root package name */
    private Map f14481b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f14482c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f14483d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f14484e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f14485f;

    /* renamed from: g, reason: collision with root package name */
    private String f14486g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14487h;

    /* renamed from: i, reason: collision with root package name */
    private String f14488i;

    /* renamed from: j, reason: collision with root package name */
    private String f14489j;

    /* renamed from: k, reason: collision with root package name */
    private long f14490k;

    /* renamed from: l, reason: collision with root package name */
    private MaxAdFormat f14491l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(v2 v2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((h3) v2Var);
        maxAdapterParametersImplA.f14488i = v2Var.Q();
        maxAdapterParametersImplA.f14489j = v2Var.E();
        maxAdapterParametersImplA.f14490k = v2Var.D();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f14491l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f14480a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f14490k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f14489j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f14486g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f14483d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f14481b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f14482c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f14488i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f14484e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f14485f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f14487h;
    }

    public static MaxAdapterParametersImpl a(b5 b5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(b5Var);
        maxAdapterParametersImplA.f14480a = str;
        maxAdapterParametersImplA.f14491l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(h3 h3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f14480a = h3Var.getAdUnitId();
        maxAdapterParametersImpl.f14484e = h3Var.n();
        maxAdapterParametersImpl.f14485f = h3Var.o();
        maxAdapterParametersImpl.f14486g = h3Var.d();
        maxAdapterParametersImpl.f14481b = h3Var.i();
        maxAdapterParametersImpl.f14482c = h3Var.l();
        maxAdapterParametersImpl.f14483d = h3Var.f();
        maxAdapterParametersImpl.f14487h = h3Var.p();
        return maxAdapterParametersImpl;
    }
}
