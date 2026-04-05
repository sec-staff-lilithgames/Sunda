package io.odeeo.internal.b;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e implements p0, q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f62670a;

    /* renamed from: c, reason: collision with root package name */
    public r0 f62672c;

    /* renamed from: e, reason: collision with root package name */
    public int f62673e;

    /* renamed from: f, reason: collision with root package name */
    public int f62674f;

    /* renamed from: g, reason: collision with root package name */
    public io.odeeo.internal.a0.d0 f62675g;

    /* renamed from: h, reason: collision with root package name */
    public t[] f62676h;

    /* renamed from: i, reason: collision with root package name */
    public long f62677i;

    /* renamed from: j, reason: collision with root package name */
    public long f62678j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f62680l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f62681m;

    /* renamed from: b, reason: collision with root package name */
    public final u f62671b = new u();

    /* renamed from: k, reason: collision with root package name */
    public long f62679k = Long.MIN_VALUE;

    public e(int i10) {
        this.f62670a = i10;
    }

    public void a(long j10, boolean z10) throws n {
    }

    public final u b() {
        this.f62671b.clear();
        return this.f62671b;
    }

    public final int c() {
        return this.f62673e;
    }

    public final t[] d() {
        return (t[]) io.odeeo.internal.q0.a.checkNotNull(this.f62676h);
    }

    @Override // io.odeeo.internal.b.p0
    public final void disable() {
        io.odeeo.internal.q0.a.checkState(this.f62674f == 1);
        this.f62671b.clear();
        this.f62674f = 0;
        this.f62675g = null;
        this.f62676h = null;
        this.f62680l = false;
        f();
    }

    public final boolean e() {
        return hasReadStreamToEnd() ? this.f62680l : ((io.odeeo.internal.a0.d0) io.odeeo.internal.q0.a.checkNotNull(this.f62675g)).isReady();
    }

    @Override // io.odeeo.internal.b.p0
    public final void enable(r0 r0Var, t[] tVarArr, io.odeeo.internal.a0.d0 d0Var, long j10, boolean z10, boolean z11, long j11, long j12) throws n {
        io.odeeo.internal.q0.a.checkState(this.f62674f == 0);
        this.f62672c = r0Var;
        this.f62674f = 1;
        this.f62678j = j10;
        a(z10, z11);
        replaceStream(tVarArr, d0Var, j11, j12);
        a(j10, z10);
    }

    @Override // io.odeeo.internal.b.p0
    public io.odeeo.internal.q0.r getMediaClock() {
        return null;
    }

    @Override // io.odeeo.internal.b.p0, io.odeeo.internal.b.q0
    public abstract /* synthetic */ String getName();

    @Override // io.odeeo.internal.b.p0
    public final long getReadingPositionUs() {
        return this.f62679k;
    }

    @Override // io.odeeo.internal.b.p0
    public final int getState() {
        return this.f62674f;
    }

    @Override // io.odeeo.internal.b.p0
    public final io.odeeo.internal.a0.d0 getStream() {
        return this.f62675g;
    }

    @Override // io.odeeo.internal.b.p0, io.odeeo.internal.b.q0
    public final int getTrackType() {
        return this.f62670a;
    }

    @Override // io.odeeo.internal.b.p0
    public final boolean hasReadStreamToEnd() {
        return this.f62679k == Long.MIN_VALUE;
    }

    @Override // io.odeeo.internal.b.p0
    public final boolean isCurrentStreamFinal() {
        return this.f62680l;
    }

    @Override // io.odeeo.internal.b.p0
    public abstract /* synthetic */ boolean isEnded();

    @Override // io.odeeo.internal.b.p0
    public abstract /* synthetic */ boolean isReady();

    @Override // io.odeeo.internal.b.p0
    public final void maybeThrowStreamError() throws IOException {
        ((io.odeeo.internal.a0.d0) io.odeeo.internal.q0.a.checkNotNull(this.f62675g)).maybeThrowError();
    }

    @Override // io.odeeo.internal.b.p0
    public abstract /* synthetic */ void render(long j10, long j11) throws n;

    @Override // io.odeeo.internal.b.p0
    public final void replaceStream(t[] tVarArr, io.odeeo.internal.a0.d0 d0Var, long j10, long j11) throws n {
        io.odeeo.internal.q0.a.checkState(!this.f62680l);
        this.f62675g = d0Var;
        if (this.f62679k == Long.MIN_VALUE) {
            this.f62679k = j10;
        }
        this.f62676h = tVarArr;
        this.f62677i = j11;
        a(tVarArr, j10, j11);
    }

    @Override // io.odeeo.internal.b.p0
    public final void reset() {
        io.odeeo.internal.q0.a.checkState(this.f62674f == 0);
        this.f62671b.clear();
        g();
    }

    @Override // io.odeeo.internal.b.p0
    public final void resetPosition(long j10) throws n {
        this.f62680l = false;
        this.f62678j = j10;
        this.f62679k = j10;
        a(j10, false);
    }

    @Override // io.odeeo.internal.b.p0
    public final void setCurrentStreamFinal() {
        this.f62680l = true;
    }

    @Override // io.odeeo.internal.b.p0
    public final void setIndex(int i10) {
        this.f62673e = i10;
    }

    @Override // io.odeeo.internal.b.p0
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws n {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // io.odeeo.internal.b.p0
    public final void start() throws n {
        io.odeeo.internal.q0.a.checkState(this.f62674f == 1);
        this.f62674f = 2;
        h();
    }

    @Override // io.odeeo.internal.b.p0
    public final void stop() {
        io.odeeo.internal.q0.a.checkState(this.f62674f == 2);
        this.f62674f = 1;
        i();
    }

    @Override // io.odeeo.internal.b.q0
    public abstract /* synthetic */ int supportsFormat(t tVar) throws n;

    @Override // io.odeeo.internal.b.q0
    public int supportsMixedMimeTypeAdaptation() throws n {
        return 0;
    }

    public void a(boolean z10, boolean z11) throws n {
    }

    public void a(t[] tVarArr, long j10, long j11) throws n {
    }

    public final r0 a() {
        return (r0) io.odeeo.internal.q0.a.checkNotNull(this.f62672c);
    }

    public final n a(Throwable th2, t tVar, int i10) {
        return a(th2, tVar, false, i10);
    }

    public final n a(Throwable th2, t tVar, boolean z10, int i10) {
        int formatSupport;
        if (tVar == null || this.f62681m) {
            formatSupport = 4;
        } else {
            this.f62681m = true;
            try {
                formatSupport = q0.getFormatSupport(supportsFormat(tVar));
            } catch (n unused) {
            } finally {
                this.f62681m = false;
            }
        }
        return n.createForRenderer(th2, getName(), c(), tVar, formatSupport, z10, i10);
    }

    public final int a(u uVar, io.odeeo.internal.e.g gVar, int i10) {
        int data = ((io.odeeo.internal.a0.d0) io.odeeo.internal.q0.a.checkNotNull(this.f62675g)).readData(uVar, gVar, i10);
        if (data != -4) {
            if (data == -5) {
                t tVar = (t) io.odeeo.internal.q0.a.checkNotNull(uVar.f63020b);
                if (tVar.f62975p != Long.MAX_VALUE) {
                    uVar.f63020b = tVar.buildUpon().setSubsampleOffsetUs(tVar.f62975p + this.f62677i).build();
                }
            }
            return data;
        }
        if (gVar.isEndOfStream()) {
            this.f62679k = Long.MIN_VALUE;
            return this.f62680l ? -4 : -3;
        }
        long j10 = gVar.f63707e + this.f62677i;
        gVar.f63707e = j10;
        this.f62679k = Math.max(this.f62679k, j10);
        return data;
    }

    public void f() {
    }

    public void g() {
    }

    @Override // io.odeeo.internal.b.p0
    public final q0 getCapabilities() {
        return this;
    }

    public void h() throws n {
    }

    public void i() {
    }

    public int a(long j10) {
        return ((io.odeeo.internal.a0.d0) io.odeeo.internal.q0.a.checkNotNull(this.f62675g)).skipData(j10 - this.f62677i);
    }

    @Override // io.odeeo.internal.b.p0, io.odeeo.internal.b.m0.b
    public void handleMessage(int i10, Object obj) throws n {
    }
}
