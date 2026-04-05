package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3134b1 {

    /* renamed from: a, reason: collision with root package name */
    private NetworkSettings f36012a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f36013b;

    /* renamed from: c, reason: collision with root package name */
    private IronSource.a f36014c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36015d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36016e;

    /* renamed from: f, reason: collision with root package name */
    private int f36017f;

    /* renamed from: g, reason: collision with root package name */
    private int f36018g;

    public C3134b1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        this.f36012a = networkSettings;
        this.f36013b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f36017f = iOptInt;
        this.f36015d = iOptInt == 2;
        this.f36016e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f36018g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f36014c = aVar;
    }

    public String a() {
        return this.f36012a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.f36014c;
    }

    public JSONObject c() {
        return this.f36013b;
    }

    public int d() {
        return this.f36017f;
    }

    public int e() {
        return this.f36018g;
    }

    public String f() {
        return this.f36012a.getProviderName();
    }

    public String g() {
        return this.f36012a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f36012a;
    }

    public String i() {
        return this.f36012a.getSubProviderId();
    }

    public boolean j() {
        return this.f36015d;
    }

    public boolean k() {
        return this.f36016e;
    }
}
