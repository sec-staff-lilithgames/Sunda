package com.moloco.sdk.internal.services.init;

import j1.o2;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f47063a;

    public a(String appKey) {
        e0.checkNotNullParameter(appKey, "appKey");
        this.f47063a = appKey;
    }

    public final String a() {
        return this.f47063a;
    }

    public final String b() {
        return this.f47063a;
    }

    public final String c() {
        return o2.o(new StringBuilder(), this.f47063a, "___v1");
    }

    public final List<String> d() {
        return p0.emptyList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && e0.areEqual(this.f47063a, ((a) obj).f47063a);
    }

    public int hashCode() {
        return this.f47063a.hashCode();
    }

    public String toString() {
        return p0.o2.q(new StringBuilder("CacheKey(appKey="), this.f47063a, ')');
    }

    public final a a(String appKey) {
        e0.checkNotNullParameter(appKey, "appKey");
        return new a(appKey);
    }

    public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f47063a;
        }
        return aVar.a(str);
    }
}
