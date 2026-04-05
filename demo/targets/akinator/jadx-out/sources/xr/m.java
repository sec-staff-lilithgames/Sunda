package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class m implements w, m9 {

    /* renamed from: a, reason: collision with root package name */
    public d2 f92777a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f92778b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final te f92779c;

    /* renamed from: d, reason: collision with root package name */
    public final ff f92780d;

    /* renamed from: e, reason: collision with root package name */
    public final p9 f92781e;

    /* renamed from: f, reason: collision with root package name */
    public int f92782f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92783g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f92784h;

    public m(int i10, te teVar, ff ffVar) {
        this.f92779c = (te) mh.p1.checkNotNull(teVar, "statsTraceCtx");
        this.f92780d = (ff) mh.p1.checkNotNull(ffVar, "transportTracer");
        p9 p9Var = new p9(this, wr.z.f91209a, i10, teVar, ffVar);
        this.f92781e = p9Var;
        this.f92777a = p9Var;
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f92777a.close();
        } else {
            this.f92777a.closeWhenComplete();
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f92778b) {
            try {
                z10 = this.f92783g && this.f92782f < 32768 && !this.f92784h;
            } finally {
            }
        }
        return z10;
    }

    public abstract /* synthetic */ void bytesRead(int i10);

    public abstract we c();

    public abstract /* synthetic */ void deframeFailed(Throwable th2);

    public abstract /* synthetic */ void deframerClosed(boolean z10);

    public final te getStatsTraceContext() {
        return this.f92779c;
    }

    @Override // xr.m9
    public void messagesAvailable(ve veVar) {
        c().messagesAvailable(veVar);
    }

    public final void onSentBytes(int i10) {
        boolean z10;
        boolean zB;
        synchronized (this.f92778b) {
            mh.p1.checkState(this.f92783g, "onStreamAllocated was not called, but it seems the stream is active");
            int i11 = this.f92782f;
            z10 = false;
            boolean z11 = i11 < 32768;
            int i12 = i11 - i10;
            this.f92782f = i12;
            boolean z12 = i12 < 32768;
            if (!z11 && z12) {
                z10 = true;
            }
        }
        if (z10) {
            synchronized (this.f92778b) {
                zB = b();
            }
            if (zB) {
                c().onReady();
            }
        }
    }

    public void onStreamAllocated() {
        boolean zB;
        mh.p1.checkState(c() != null);
        synchronized (this.f92778b) {
            mh.p1.checkState(!this.f92783g, "Already allocated");
            this.f92783g = true;
        }
        synchronized (this.f92778b) {
            zB = b();
        }
        if (zB) {
            c().onReady();
        }
    }

    public final void requestMessagesFromDeframerForTesting(int i10) {
        runOnTransportThread(new l(this, lt.c.linkOut(), i10));
    }

    @Override // xr.w, xr.b0
    public abstract /* synthetic */ void runOnTransportThread(Runnable runnable);
}
