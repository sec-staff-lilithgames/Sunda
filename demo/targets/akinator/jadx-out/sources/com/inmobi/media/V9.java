package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class V9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32393a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f32394b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f32395c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32396d;

    public V9(String url, HashMap map, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f32393a = url;
        this.f32394b = map;
        this.f32395c = null;
        this.f32396d = z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "<set-?>");
        this.f32393a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V9)) {
            return false;
        }
        V9 v92 = (V9) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f32393a, v92.f32393a) && kotlin.jvm.internal.e0.areEqual(this.f32394b, v92.f32394b) && kotlin.jvm.internal.e0.areEqual(this.f32395c, v92.f32395c) && kotlin.jvm.internal.e0.areEqual((Object) null, (Object) null) && this.f32396d == v92.f32396d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f32393a.hashCode() * 31;
        Map map = this.f32394b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f32395c;
        int iHashCode3 = (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 961;
        boolean z10 = this.f32396d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode3 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetRequest(url=");
        sb2.append(this.f32393a);
        sb2.append(", headers=");
        sb2.append(this.f32394b);
        sb2.append(", queryParams=");
        sb2.append(this.f32395c);
        sb2.append(", retryPolicy=null, followRedirects=");
        return a.b.p(sb2, this.f32396d, ')');
    }
}
