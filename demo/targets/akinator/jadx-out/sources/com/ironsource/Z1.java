package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35832a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35833b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35834c;

    /* renamed from: d, reason: collision with root package name */
    private String f35835d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, ? extends Object> f35836e;

    /* renamed from: f, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f35837f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f35838g;

    public Z1(String name, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f35832a = name;
        this.f35833b = z10;
        this.f35835d = "";
        this.f35836e = uu.p1.emptyMap();
        this.f35838g = new HashMap();
    }

    public final String a() {
        return this.f35832a;
    }

    public final boolean b() {
        return this.f35833b;
    }

    public final Map<String, Object> c() {
        return this.f35838g;
    }

    public final com.ironsource.mediationsdk.h d() {
        return this.f35837f;
    }

    public final boolean e() {
        return this.f35833b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z1)) {
            return false;
        }
        Z1 z12 = (Z1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f35832a, z12.f35832a) && this.f35833b == z12.f35833b;
    }

    public final Map<String, Object> f() {
        return this.f35836e;
    }

    public final String g() {
        return this.f35832a;
    }

    public final String h() {
        return this.f35835d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f35832a.hashCode() * 31;
        boolean z10 = this.f35833b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final boolean i() {
        return this.f35834c;
    }

    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f35832a + ", bidder=" + this.f35833b + ")";
    }

    public final Z1 a(String name, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return new Z1(name, z10);
    }

    public final void b(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
        this.f35836e = map;
    }

    public static /* synthetic */ Z1 a(Z1 z12, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = z12.f35832a;
        }
        if ((i10 & 2) != 0) {
            z10 = z12.f35833b;
        }
        return z12.a(str, z10);
    }

    public final void a(boolean z10) {
        this.f35834c = z10;
    }

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f35835d = str;
    }

    public final void a(com.ironsource.mediationsdk.h hVar) {
        this.f35837f = hVar;
    }

    public final void a(Map<String, Object> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
        this.f35838g = map;
    }
}
