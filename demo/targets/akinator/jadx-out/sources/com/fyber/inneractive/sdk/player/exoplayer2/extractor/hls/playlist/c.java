package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f24827a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24828b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24829c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24830d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24831e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24832f;

    /* renamed from: g, reason: collision with root package name */
    public final String f24833g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24834h;

    /* renamed from: i, reason: collision with root package name */
    public final long f24835i;

    public c(String str, long j10, int i10, long j11, boolean z10, String str2, String str3, long j12, long j13) {
        this.f24827a = str;
        this.f24828b = j10;
        this.f24829c = i10;
        this.f24830d = j11;
        this.f24831e = z10;
        this.f24832f = str2;
        this.f24833g = str3;
        this.f24834h = j12;
        this.f24835i = j13;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l9 = (Long) obj;
        if (this.f24830d > l9.longValue()) {
            return 1;
        }
        return this.f24830d < l9.longValue() ? -1 : 0;
    }
}
