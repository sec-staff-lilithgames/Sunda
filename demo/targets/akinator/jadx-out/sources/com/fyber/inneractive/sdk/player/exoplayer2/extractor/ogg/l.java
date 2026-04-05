package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public f f25258a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25259b;

    /* renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f25260c;

    /* renamed from: d, reason: collision with root package name */
    public h f25261d;

    /* renamed from: e, reason: collision with root package name */
    public long f25262e;

    /* renamed from: f, reason: collision with root package name */
    public long f25263f;

    /* renamed from: g, reason: collision with root package name */
    public long f25264g;

    /* renamed from: h, reason: collision with root package name */
    public int f25265h;

    /* renamed from: i, reason: collision with root package name */
    public int f25266i;

    /* renamed from: j, reason: collision with root package name */
    public j f25267j;

    /* renamed from: k, reason: collision with root package name */
    public long f25268k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25269l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25270m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public void a(boolean z10) {
        if (z10) {
            this.f25267j = new j();
            this.f25263f = 0L;
            this.f25265h = 0;
        } else {
            this.f25265h = 1;
        }
        this.f25262e = -1L;
        this.f25264g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar);

    public void a(long j10) {
        this.f25264g = j10;
    }
}
