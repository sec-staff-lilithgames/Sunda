package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.w4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3051w4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33521a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33522b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33523c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33524d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33525e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33526f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33527g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33528h;

    /* renamed from: i, reason: collision with root package name */
    public final long f33529i;

    /* renamed from: j, reason: collision with root package name */
    public final long f33530j;

    /* renamed from: k, reason: collision with root package name */
    public String f33531k;

    public C3051w4(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f33521a = i10;
        this.f33522b = j10;
        this.f33523c = j11;
        this.f33524d = j12;
        this.f33525e = i11;
        this.f33526f = i12;
        this.f33527g = i13;
        this.f33528h = i14;
        this.f33529i = j13;
        this.f33530j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3051w4)) {
            return false;
        }
        C3051w4 c3051w4 = (C3051w4) obj;
        return this.f33521a == c3051w4.f33521a && this.f33522b == c3051w4.f33522b && this.f33523c == c3051w4.f33523c && this.f33524d == c3051w4.f33524d && this.f33525e == c3051w4.f33525e && this.f33526f == c3051w4.f33526f && this.f33527g == c3051w4.f33527g && this.f33528h == c3051w4.f33528h && this.f33529i == c3051w4.f33529i && this.f33530j == c3051w4.f33530j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33530j) + p0.o2.d(e3.g.d(this.f33528h, e3.g.d(this.f33527g, e3.g.d(this.f33526f, e3.g.d(this.f33525e, p0.o2.d(p0.o2.d(p0.o2.d(Integer.hashCode(this.f33521a) * 31, 31, this.f33522b), 31, this.f33523c), 31, this.f33524d), 31), 31), 31), 31), 31, this.f33529i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventConfig(maxRetryCount=");
        sb2.append(this.f33521a);
        sb2.append(", timeToLiveInSec=");
        sb2.append(this.f33522b);
        sb2.append(", processingInterval=");
        sb2.append(this.f33523c);
        sb2.append(", ingestionLatencyInSec=");
        sb2.append(this.f33524d);
        sb2.append(", minBatchSizeWifi=");
        sb2.append(this.f33525e);
        sb2.append(", maxBatchSizeWifi=");
        sb2.append(this.f33526f);
        sb2.append(", minBatchSizeMobile=");
        sb2.append(this.f33527g);
        sb2.append(", maxBatchSizeMobile=");
        sb2.append(this.f33528h);
        sb2.append(", retryIntervalWifi=");
        sb2.append(this.f33529i);
        sb2.append(", retryIntervalMobile=");
        return e3.g.n(sb2, this.f33530j, ')');
    }
}
