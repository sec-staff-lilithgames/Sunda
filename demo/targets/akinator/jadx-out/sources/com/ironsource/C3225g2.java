package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3225g2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f36736a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36737b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36738c;

    /* renamed from: d, reason: collision with root package name */
    private String f36739d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, ? extends Object> f36740e;

    /* renamed from: f, reason: collision with root package name */
    private com.ironsource.mediationsdk.h f36741f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f36742g;

    public C3225g2(String name, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f36736a = name;
        this.f36737b = z10;
        this.f36739d = "";
        this.f36740e = uu.p1.emptyMap();
        this.f36742g = new HashMap();
    }

    public final String a() {
        return this.f36736a;
    }

    public final boolean b() {
        return this.f36737b;
    }

    public final Map<String, Object> c() {
        return this.f36742g;
    }

    public final com.ironsource.mediationsdk.h d() {
        return this.f36741f;
    }

    public final boolean e() {
        return this.f36737b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3225g2)) {
            return false;
        }
        C3225g2 c3225g2 = (C3225g2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f36736a, c3225g2.f36736a) && this.f36737b == c3225g2.f36737b;
    }

    public final Map<String, Object> f() {
        return this.f36740e;
    }

    public final String g() {
        return this.f36736a;
    }

    public final String h() {
        return this.f36739d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f36736a.hashCode() * 31;
        boolean z10 = this.f36737b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final boolean i() {
        return this.f36738c;
    }

    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f36736a + ", bidder=" + this.f36737b + ")";
    }

    public final C3225g2 a(String name, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return new C3225g2(name, z10);
    }

    public final void b(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
        this.f36740e = map;
    }

    public static /* synthetic */ C3225g2 a(C3225g2 c3225g2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3225g2.f36736a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3225g2.f36737b;
        }
        return c3225g2.a(str, z10);
    }

    public final void a(boolean z10) {
        this.f36738c = z10;
    }

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f36739d = str;
    }

    public final void a(com.ironsource.mediationsdk.h hVar) {
        this.f36741f = hVar;
    }

    public final void a(Map<String, Object> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
        this.f36742g = map;
    }
}
