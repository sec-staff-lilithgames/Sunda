package com.inmobi.media;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32358a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f32359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32360c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32361d;

    public U9(long j10, Map headers, int i10, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
        this.f32358a = j10;
        this.f32359b = headers;
        this.f32360c = i10;
        this.f32361d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U9)) {
            return false;
        }
        U9 u92 = (U9) obj;
        return this.f32358a == u92.f32358a && kotlin.jvm.internal.e0.areEqual(this.f32359b, u92.f32359b) && this.f32360c == u92.f32360c && kotlin.jvm.internal.e0.areEqual(this.f32361d, u92.f32361d);
    }

    public final int hashCode() {
        int iD = e3.g.d(this.f32360c, p0.o2.f(this.f32359b, Long.hashCode(this.f32358a) * 31, 31), 31);
        String str = this.f32361d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkMetaData(timeTaken=");
        sb2.append(this.f32358a);
        sb2.append(", headers=");
        sb2.append(this.f32359b);
        sb2.append(", contentLength=");
        sb2.append(this.f32360c);
        sb2.append(", contentType=");
        return AbstractC2962r0.a(sb2, this.f32361d, ')');
    }
}
