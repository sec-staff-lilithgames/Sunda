package xr;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d extends m {

    /* renamed from: i, reason: collision with root package name */
    public final te f92363i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f92364j;

    /* renamed from: k, reason: collision with root package name */
    public m1 f92365k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f92366l;

    /* renamed from: m, reason: collision with root package name */
    public wr.c1 f92367m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f92368n;

    /* renamed from: o, reason: collision with root package name */
    public c f92369o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f92370p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f92371q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f92372r;

    public d(int i10, te teVar, ff ffVar) {
        super(i10, teVar, ffVar);
        this.f92367m = wr.c1.getDefaultInstance();
        this.f92368n = false;
        this.f92363i = (te) mh.p1.checkNotNull(teVar, "statsTraceCtx");
    }

    @Override // xr.m, xr.m9
    public abstract /* synthetic */ void bytesRead(int i10);

    @Override // xr.m
    public final we c() {
        return this.f92365k;
    }

    public final void d(wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        if (this.f92364j) {
            return;
        }
        this.f92364j = true;
        this.f92363i.streamClosed(m6Var);
        ff ffVar = this.f92780d;
        if (ffVar != null) {
            ffVar.reportStreamClosed(m6Var.isOk());
        }
        this.f92365k.closed(m6Var, l1Var, e4Var);
    }

    @Override // xr.m, xr.m9
    public abstract /* synthetic */ void deframeFailed(Throwable th2);

    @Override // xr.m, xr.m9
    public void deframerClosed(boolean z10) {
        mh.p1.checkState(this.f92371q, "status should have been reported on deframer closed");
        this.f92368n = true;
        if (this.f92372r && z10) {
            transportReportStatus(wr.m6.f91046n.withDescription("Encountered end-of-stream mid-frame"), true, new wr.e4());
        }
        c cVar = this.f92369o;
        if (cVar != null) {
            cVar.run();
            this.f92369o = null;
        }
    }

    public final void e(wr.e4 e4Var) {
        boolean z10 = true;
        mh.p1.checkState(!this.f92371q, "Received headers on closed stream");
        this.f92363i.clientInboundHeaders();
        String str = (String) e4Var.get(c5.f92312g);
        if (!this.f92366l || str == null) {
            z10 = false;
        } else if (str.equalsIgnoreCase("gzip")) {
            d5 d5Var = new d5();
            p9 p9Var = this.f92781e;
            p9Var.setFullStreamDecompressor(d5Var);
            g5 g5Var = (g5) this;
            this.f92777a = new x(g5Var, g5Var, p9Var);
        } else {
            if (!str.equalsIgnoreCase("identity")) {
                deframeFailed(wr.m6.f91046n.withDescription("Can't find full stream decompressor for ".concat(str)).asRuntimeException());
                return;
            }
            z10 = false;
        }
        String str2 = (String) e4Var.get(c5.f92310e);
        if (str2 != null) {
            wr.a1 a1VarLookupDecompressor = this.f92367m.lookupDecompressor(str2);
            if (a1VarLookupDecompressor == null) {
                deframeFailed(wr.m6.f91046n.withDescription("Can't find decompressor for ".concat(str2)).asRuntimeException());
                return;
            } else if (a1VarLookupDecompressor != wr.z.f91209a) {
                if (z10) {
                    deframeFailed(wr.m6.f91046n.withDescription("Full stream and gRPC message encoding cannot both be set").asRuntimeException());
                    return;
                }
                this.f92777a.setDecompressor(a1VarLookupDecompressor);
            }
        }
        this.f92365k.headersRead(e4Var);
    }

    @Override // xr.m, xr.w, xr.b0
    public abstract /* synthetic */ void runOnTransportThread(Runnable runnable);

    public final void setListener(m1 m1Var) {
        mh.p1.checkState(this.f92365k == null, "Already called setListener");
        this.f92365k = (m1) mh.p1.checkNotNull(m1Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final void transportReportStatus(wr.m6 m6Var, boolean z10, wr.e4 e4Var) {
        transportReportStatus(m6Var, l1.f92748b, z10, e4Var);
    }

    public final void transportReportStatus(wr.m6 m6Var, l1 l1Var, boolean z10, wr.e4 e4Var) {
        mh.p1.checkNotNull(m6Var, "status");
        mh.p1.checkNotNull(e4Var, "trailers");
        if (!this.f92371q || z10) {
            this.f92371q = true;
            this.f92372r = m6Var.isOk();
            synchronized (this.f92778b) {
                this.f92784h = true;
            }
            if (this.f92368n) {
                this.f92369o = null;
                d(m6Var, l1Var, e4Var);
            } else {
                this.f92369o = new c(this, m6Var, l1Var, e4Var);
                a(z10);
            }
        }
    }
}
