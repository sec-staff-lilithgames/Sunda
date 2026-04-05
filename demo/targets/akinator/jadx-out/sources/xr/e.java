package xr;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class e extends n implements k1, s9 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f92445g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ff f92446a;

    /* renamed from: b, reason: collision with root package name */
    public final r4 f92447b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92448c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92449d;

    /* renamed from: e, reason: collision with root package name */
    public wr.e4 f92450e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f92451f;

    public e(yr.c1 c1Var, te teVar, ff ffVar, wr.e4 e4Var, wr.i iVar, boolean z10) {
        mh.p1.checkNotNull(e4Var, "headers");
        this.f92446a = (ff) mh.p1.checkNotNull(ffVar, "transportTracer");
        this.f92448c = c5.shouldBeCountedForInUse(iVar);
        this.f92449d = z10;
        if (z10) {
            this.f92447b = new a(this, e4Var, teVar);
        } else {
            this.f92447b = new t9(this, c1Var, teVar);
            this.f92450e = e4Var;
        }
    }

    @Override // xr.n
    public final r4 a() {
        return this.f92447b;
    }

    @Override // xr.k1
    public final void appendTimeoutInsight(l5 l5Var) {
        l5Var.appendKeyValue("remote_addr", getAttributes().get(wr.q1.f91097a));
    }

    @Override // xr.k1
    public final void cancel(wr.m6 m6Var) {
        mh.p1.checkArgument(!m6Var.isOk(), "Should not cancel with OK status");
        this.f92451f = true;
        ((yr.x) this).f95116m.cancel(m6Var);
    }

    @Override // xr.s9
    public final void deliverFrame(hf hfVar, boolean z10, boolean z11, int i10) {
        mh.p1.checkArgument(hfVar != null || z10, "null frame before EOS");
        ((yr.x) this).f95116m.writeFrame(hfVar, z10, z11, i10);
    }

    @Override // xr.k1
    public abstract /* synthetic */ wr.c getAttributes();

    @Override // xr.k1
    public final void halfClose() {
        yr.x xVar = (yr.x) this;
        if (xVar.f95115l.f92370p) {
            return;
        }
        xVar.f95115l.f92370p = true;
        a().close();
    }

    @Override // xr.n, xr.ue, xr.k1
    public final boolean isReady() {
        return super.isReady() && !this.f92451f;
    }

    @Override // xr.k1
    public abstract /* synthetic */ void setAuthority(String str);

    @Override // xr.k1
    public void setDeadline(wr.z0 z0Var) {
        wr.e4 e4Var = this.f92450e;
        wr.z3 z3Var = c5.f92309d;
        e4Var.discardAll(z3Var);
        this.f92450e.put(z3Var, Long.valueOf(Math.max(0L, z0Var.timeRemaining(TimeUnit.NANOSECONDS))));
    }

    @Override // xr.k1
    public final void setDecompressorRegistry(wr.c1 c1Var) {
        yr.w wVar = ((yr.x) this).f95115l;
        mh.p1.checkState(wVar.f92365k == null, "Already called start");
        wVar.f92367m = (wr.c1) mh.p1.checkNotNull(c1Var, "decompressorRegistry");
    }

    @Override // xr.k1
    public final void setFullStreamDecompression(boolean z10) {
        ((yr.x) this).f95115l.f92366l = z10;
    }

    @Override // xr.k1
    public void setMaxInboundMessageSize(int i10) {
        ((yr.x) this).f95115l.f92777a.setMaxInboundMessageSize(i10);
    }

    @Override // xr.k1
    public void setMaxOutboundMessageSize(int i10) {
        this.f92447b.setMaxOutboundMessageSize(i10);
    }

    public final boolean shouldBeCountedForInUse() {
        return this.f92448c;
    }

    @Override // xr.k1
    public final void start(m1 m1Var) {
        yr.x xVar = (yr.x) this;
        xVar.f95115l.setListener(m1Var);
        if (this.f92449d) {
            return;
        }
        xVar.f95116m.writeHeaders(this.f92450e, null);
        this.f92450e = null;
    }
}
