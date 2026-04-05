package com.inmobi.media;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ja {

    /* renamed from: a, reason: collision with root package name */
    public final String f31913a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31914b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f31915c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31916d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31917e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31918f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31919g;

    /* renamed from: h, reason: collision with root package name */
    public final String f31920h;

    /* renamed from: i, reason: collision with root package name */
    public final long f31921i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f31922j;

    /* renamed from: k, reason: collision with root package name */
    public final Bc f31923k;

    public Ja(String url, String id2, Map headers, boolean z10, String priority, boolean z11, int i10, String ownerId, long j10, Long l9, Bc bc2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerId, "ownerId");
        this.f31913a = url;
        this.f31914b = id2;
        this.f31915c = headers;
        this.f31916d = z10;
        this.f31917e = priority;
        this.f31918f = z11;
        this.f31919g = i10;
        this.f31920h = ownerId;
        this.f31921i = j10;
        this.f31922j = l9;
        this.f31923k = bc2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ja)) {
            return false;
        }
        Ja ja2 = (Ja) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f31913a, ja2.f31913a) && kotlin.jvm.internal.e0.areEqual(this.f31914b, ja2.f31914b) && kotlin.jvm.internal.e0.areEqual(this.f31915c, ja2.f31915c) && this.f31916d == ja2.f31916d && kotlin.jvm.internal.e0.areEqual(this.f31917e, ja2.f31917e) && this.f31918f == ja2.f31918f && this.f31919g == ja2.f31919g && kotlin.jvm.internal.e0.areEqual(this.f31920h, ja2.f31920h) && this.f31921i == ja2.f31921i && kotlin.jvm.internal.e0.areEqual(this.f31922j, ja2.f31922j) && kotlin.jvm.internal.e0.areEqual(this.f31923k, ja2.f31923k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iF = p0.o2.f(this.f31915c, p0.o2.e(this.f31913a.hashCode() * 31, 31, this.f31914b), 31);
        boolean z10 = this.f31916d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iE = p0.o2.e((iF + i10) * 31, 31, this.f31917e);
        boolean z11 = this.f31918f;
        int iD = p0.o2.d(p0.o2.e(e3.g.d(this.f31919g, (iE + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31), 31, this.f31920h), 31, this.f31921i);
        Long l9 = this.f31922j;
        int iHashCode = (iD + (l9 == null ? 0 : l9.hashCode())) * 31;
        Bc bc2 = this.f31923k;
        return iHashCode + (bc2 != null ? bc2.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.f31913a + ", id=" + this.f31914b + ", headers=" + this.f31915c + ", allowRedirects=" + this.f31916d + ", priority=" + this.f31917e + ", ackRequired=" + this.f31918f + ", retryCount=" + this.f31919g + ", ownerId=" + this.f31920h + ", createdAt=" + this.f31921i + ", retryAfterTimestamp=" + this.f31922j + ", telemetryData=" + this.f31923k + ')';
    }
}
