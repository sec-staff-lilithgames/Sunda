package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15018a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15019b;

    /* renamed from: c, reason: collision with root package name */
    private String f15020c;

    /* renamed from: d, reason: collision with root package name */
    private String f15021d;

    public p1(Object obj, long j10) {
        this.f15019b = obj;
        this.f15018a = j10;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.f15020c = bVar.getAdZone().d() != null ? bVar.getAdZone().d().getLabel() : null;
            this.f15021d = "AppLovin";
        } else if (obj instanceof v2) {
            v2 v2Var = (v2) obj;
            this.f15020c = v2Var.getFormat().getLabel();
            this.f15021d = v2Var.getNetworkName();
        }
    }

    public Object a() {
        return this.f15019b;
    }

    public long b() {
        return this.f15018a;
    }

    public String c() {
        String str = this.f15020c;
        return str != null ? str : "Unknown";
    }

    public String d() {
        String str = this.f15021d;
        return str != null ? str : "Unknown";
    }
}
