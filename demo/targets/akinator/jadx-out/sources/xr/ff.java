package xr;

import wr.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ff {

    /* renamed from: m, reason: collision with root package name */
    public static final a f92523m = new a(cf.f92362a);

    /* renamed from: a, reason: collision with root package name */
    public final cf f92524a;

    /* renamed from: b, reason: collision with root package name */
    public long f92525b;

    /* renamed from: c, reason: collision with root package name */
    public long f92526c;

    /* renamed from: d, reason: collision with root package name */
    public long f92527d;

    /* renamed from: e, reason: collision with root package name */
    public long f92528e;

    /* renamed from: f, reason: collision with root package name */
    public long f92529f;

    /* renamed from: g, reason: collision with root package name */
    public long f92530g;

    /* renamed from: h, reason: collision with root package name */
    public gf f92531h;

    /* renamed from: i, reason: collision with root package name */
    public long f92532i;

    /* renamed from: j, reason: collision with root package name */
    public long f92533j;

    /* renamed from: k, reason: collision with root package name */
    public final y6 f92534k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f92535l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final cf f92536a;

        public a(cf cfVar) {
            this.f92536a = cfVar;
        }

        public ff create() {
            return new ff(this.f92536a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f92537a;

        /* renamed from: b, reason: collision with root package name */
        public final long f92538b;

        public b(long j10, long j11) {
            this.f92538b = j10;
            this.f92537a = j11;
        }
    }

    public ff() {
        this.f92534k = z6.create();
        this.f92524a = cf.f92362a;
    }

    public static a getDefaultFactory() {
        return f92523m;
    }

    public e2.j getStats() {
        gf gfVar = this.f92531h;
        long j10 = gfVar == null ? -1L : gfVar.read().f92538b;
        gf gfVar2 = this.f92531h;
        return new e2.j(this.f92525b, this.f92526c, this.f92527d, this.f92528e, this.f92529f, this.f92532i, this.f92534k.value(), this.f92530g, this.f92533j, this.f92535l, j10, gfVar2 != null ? gfVar2.read().f92537a : -1L);
    }

    public void reportKeepAliveSent() {
        this.f92530g++;
    }

    public void reportLocalStreamStarted() {
        this.f92525b++;
        this.f92526c = ((bf) this.f92524a).currentTimeNanos();
    }

    public void reportMessageReceived() {
        this.f92534k.add(1L);
        this.f92535l = ((bf) this.f92524a).currentTimeNanos();
    }

    public void reportMessageSent(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f92532i += i10;
        this.f92533j = ((bf) this.f92524a).currentTimeNanos();
    }

    public void reportRemoteStreamStarted() {
        this.f92525b++;
        this.f92527d = ((bf) this.f92524a).currentTimeNanos();
    }

    public void reportStreamClosed(boolean z10) {
        if (z10) {
            this.f92528e++;
        } else {
            this.f92529f++;
        }
    }

    public void setFlowControlWindowReader(gf gfVar) {
        this.f92531h = (gf) mh.p1.checkNotNull(gfVar);
    }

    public ff(cf cfVar) {
        this.f92534k = z6.create();
        this.f92524a = cfVar;
    }
}
