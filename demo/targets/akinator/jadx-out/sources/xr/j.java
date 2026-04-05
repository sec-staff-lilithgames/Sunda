package xr;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j extends m {

    /* renamed from: i, reason: collision with root package name */
    public boolean f92664i;

    /* renamed from: j, reason: collision with root package name */
    public fe f92665j;

    /* renamed from: k, reason: collision with root package name */
    public final te f92666k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f92667l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92668m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f92669n;

    /* renamed from: o, reason: collision with root package name */
    public Runnable f92670o;

    /* renamed from: p, reason: collision with root package name */
    public wr.m6 f92671p;

    public j(int i10, te teVar, ff ffVar) {
        super(i10, teVar, (ff) mh.p1.checkNotNull(ffVar, "transportTracer"));
        this.f92667l = false;
        this.f92668m = false;
        this.f92669n = false;
        this.f92666k = (te) mh.p1.checkNotNull(teVar, "statsTraceCtx");
    }

    @Override // xr.m, xr.m9
    public abstract /* synthetic */ void bytesRead(int i10);

    @Override // xr.m
    public final we c() {
        return this.f92665j;
    }

    public void complete() {
        if (this.f92668m) {
            this.f92670o = null;
            d(wr.m6.f91037e);
        } else {
            this.f92670o = new i(this);
            this.f92669n = true;
            a(true);
        }
    }

    public final void d(wr.m6 m6Var) {
        ff ffVar = this.f92780d;
        te teVar = this.f92666k;
        mh.p1.checkState((m6Var.isOk() && this.f92671p == null) ? false : true);
        if (this.f92664i) {
            return;
        }
        if (m6Var.isOk()) {
            teVar.streamClosed(this.f92671p);
            ffVar.reportStreamClosed(this.f92671p.isOk());
        } else {
            teVar.streamClosed(m6Var);
            ffVar.reportStreamClosed(false);
        }
        this.f92664i = true;
        synchronized (this.f92778b) {
            this.f92784h = true;
        }
        this.f92665j.closed(m6Var);
    }

    @Override // xr.m, xr.m9
    public abstract /* synthetic */ void deframeFailed(Throwable th2);

    @Override // xr.m, xr.m9
    public void deframerClosed(boolean z10) {
        this.f92668m = true;
        if (this.f92667l && !this.f92669n) {
            if (z10) {
                deframeFailed(wr.m6.f91046n.withDescription("Encountered end-of-stream mid-frame").asRuntimeException());
                this.f92670o = null;
                return;
            }
            this.f92665j.halfClosed();
        }
        Runnable runnable = this.f92670o;
        if (runnable != null) {
            runnable.run();
            this.f92670o = null;
        }
    }

    public void inboundDataReceived(ab abVar, boolean z10) {
        mh.p1.checkState(!this.f92667l, "Past end of stream");
        try {
            this.f92777a.deframe(abVar);
        } catch (Throwable th2) {
            deframeFailed(th2);
        }
        if (z10) {
            this.f92667l = true;
            a(false);
        }
    }

    @Override // xr.m
    public final void onStreamAllocated() {
        super.onStreamAllocated();
        this.f92780d.reportRemoteStreamStarted();
    }

    @Override // xr.m, xr.w, xr.b0
    public abstract /* synthetic */ void runOnTransportThread(Runnable runnable);

    public final void setListener(fe feVar) {
        mh.p1.checkState(this.f92665j == null, "setListener should be called only once");
        this.f92665j = (fe) mh.p1.checkNotNull(feVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public final void transportReportStatus(wr.m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "status must not be OK");
        if (this.f92668m) {
            this.f92670o = null;
            d(m6Var);
        } else {
            this.f92670o = new h(this, m6Var);
            this.f92669n = true;
            a(true);
        }
    }
}
