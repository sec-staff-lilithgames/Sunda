package com.applovin.impl;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class l4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f14352a;

    /* renamed from: b, reason: collision with root package name */
    private Map f14353b;

    private l4(String str, Map map) {
        this.f14352a = str;
        this.f14353b = map;
    }

    public static l4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.f14352a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f14352a + "'params='" + this.f14353b + "'}";
    }

    public static l4 a(String str, Map map) {
        return new l4(str, map);
    }

    public Map a() {
        return this.f14353b;
    }
}
