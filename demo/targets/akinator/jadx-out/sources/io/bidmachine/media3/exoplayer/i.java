package io.bidmachine.media3.exoplayer;

import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i implements s1, u1 {

    /* renamed from: c, reason: collision with root package name */
    public final int f61237c;

    /* renamed from: f, reason: collision with root package name */
    public v1 f61239f;

    /* renamed from: g, reason: collision with root package name */
    public int f61240g;

    /* renamed from: h, reason: collision with root package name */
    public on.f0 f61241h;

    /* renamed from: i, reason: collision with root package name */
    public io.bidmachine.media3.common.util.g f61242i;

    /* renamed from: j, reason: collision with root package name */
    public int f61243j;

    /* renamed from: k, reason: collision with root package name */
    public ao.o1 f61244k;

    /* renamed from: l, reason: collision with root package name */
    public io.bidmachine.media3.common.b[] f61245l;

    /* renamed from: m, reason: collision with root package name */
    public long f61246m;

    /* renamed from: n, reason: collision with root package name */
    public long f61247n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f61249p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f61250q;

    /* renamed from: s, reason: collision with root package name */
    public t1 f61252s;

    /* renamed from: b, reason: collision with root package name */
    public final Object f61236b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final r0 f61238e = new r0();

    /* renamed from: o, reason: collision with root package name */
    public long f61248o = Long.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public gn.u1 f61251r = gn.u1.f58195a;

    public i(int i10) {
        this.f61237c = i10;
    }

    public final a0 a(Exception exc, io.bidmachine.media3.common.b bVar, boolean z10, int i10) {
        int formatSupport;
        if (bVar == null || this.f61250q) {
            formatSupport = 4;
        } else {
            this.f61250q = true;
            try {
                formatSupport = u1.getFormatSupport(supportsFormat(bVar));
            } catch (a0 unused) {
            } finally {
                this.f61250q = false;
            }
        }
        return a0.createForRenderer(exc, getName(), this.f61240g, bVar, formatSupport, z10, i10);
    }

    public final io.bidmachine.media3.common.util.g b() {
        return (io.bidmachine.media3.common.util.g) io.bidmachine.media3.common.util.a.checkNotNull(this.f61242i);
    }

    public final v1 c() {
        return (v1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61239f);
    }

    @Override // io.bidmachine.media3.exoplayer.u1
    public final void clearListener() {
        synchronized (this.f61236b) {
            this.f61252s = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void disable() {
        io.bidmachine.media3.common.util.a.checkState(this.f61243j == 1);
        this.f61238e.clear();
        this.f61243j = 0;
        this.f61244k = null;
        this.f61245l = null;
        this.f61249p = false;
        d();
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void enable(v1 v1Var, io.bidmachine.media3.common.b[] bVarArr, ao.o1 o1Var, long j10, boolean z10, boolean z11, long j11, long j12, ao.k0 k0Var) throws a0 {
        io.bidmachine.media3.common.util.a.checkState(this.f61243j == 0);
        this.f61239f = v1Var;
        this.f61243j = 1;
        e(z10, z11);
        replaceStream(bVarArr, o1Var, j11, j12, k0Var);
        this.f61249p = false;
        this.f61247n = j11;
        this.f61248o = j11;
        f(j11, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return super.getDurationToProgressUs(j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public x0 getMediaClock() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public abstract /* synthetic */ String getName();

    @Override // io.bidmachine.media3.exoplayer.s1
    public final long getReadingPositionUs() {
        return this.f61248o;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final int getState() {
        return this.f61243j;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final ao.o1 getStream() {
        return this.f61244k;
    }

    @Override // io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public final int getTrackType() {
        return this.f61237c;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final boolean hasReadStreamToEnd() {
        return this.f61248o == Long.MIN_VALUE;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void init(int i10, on.f0 f0Var, io.bidmachine.media3.common.util.g gVar) {
        this.f61240g = i10;
        this.f61241h = f0Var;
        this.f61242i = gVar;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final boolean isCurrentStreamFinal() {
        return this.f61249p;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public abstract /* synthetic */ boolean isEnded();

    @Override // io.bidmachine.media3.exoplayer.s1
    public abstract /* synthetic */ boolean isReady();

    public final int l(r0 r0Var, nn.g gVar, int i10) {
        int data = ((ao.o1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61244k)).readData(r0Var, gVar, i10);
        if (data != -4) {
            if (data == -5) {
                io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(r0Var.f61543b);
                if (bVar.f60670t != Long.MAX_VALUE) {
                    r0Var.f61543b = bVar.buildUpon().setSubsampleOffsetUs(bVar.f60670t + this.f61246m).build();
                }
            }
            return data;
        }
        if (gVar.isEndOfStream()) {
            this.f61248o = Long.MIN_VALUE;
            return this.f61249p ? -4 : -3;
        }
        long j10 = gVar.f77082h + this.f61246m;
        gVar.f77082h = j10;
        this.f61248o = Math.max(this.f61248o, j10);
        return data;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void maybeThrowStreamError() throws IOException {
        ((ao.o1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61244k)).maybeThrowError();
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void release() {
        io.bidmachine.media3.common.util.a.checkState(this.f61243j == 0);
        g();
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public abstract /* synthetic */ void render(long j10, long j11) throws a0;

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void replaceStream(io.bidmachine.media3.common.b[] bVarArr, ao.o1 o1Var, long j10, long j11, ao.k0 k0Var) throws a0 {
        io.bidmachine.media3.common.util.a.checkState(!this.f61249p);
        this.f61244k = o1Var;
        if (this.f61248o == Long.MIN_VALUE) {
            this.f61248o = j10;
        }
        this.f61245l = bVarArr;
        this.f61246m = j11;
        k(bVarArr, j10, j11, k0Var);
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void reset() {
        io.bidmachine.media3.common.util.a.checkState(this.f61243j == 0);
        this.f61238e.clear();
        h();
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void resetPosition(long j10) throws a0 {
        this.f61249p = false;
        this.f61247n = j10;
        this.f61248o = j10;
        f(j10, false);
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void setCurrentStreamFinal() {
        this.f61249p = true;
    }

    @Override // io.bidmachine.media3.exoplayer.u1
    public final void setListener(t1 t1Var) {
        synchronized (this.f61236b) {
            this.f61252s = t1Var;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws a0 {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void setTimeline(gn.u1 u1Var) {
        if (Objects.equals(this.f61251r, u1Var)) {
            return;
        }
        this.f61251r = u1Var;
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void start() throws a0 {
        io.bidmachine.media3.common.util.a.checkState(this.f61243j == 1);
        this.f61243j = 2;
        i();
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final void stop() {
        io.bidmachine.media3.common.util.a.checkState(this.f61243j == 2);
        this.f61243j = 1;
        j();
    }

    public abstract /* synthetic */ int supportsFormat(io.bidmachine.media3.common.b bVar) throws a0;

    @Override // io.bidmachine.media3.exoplayer.u1
    public int supportsMixedMimeTypeAdaptation() throws a0 {
        return 0;
    }

    public void d() {
    }

    public void g() {
    }

    @Override // io.bidmachine.media3.exoplayer.s1
    public final u1 getCapabilities() {
        return this;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void e(boolean z10, boolean z11) {
    }

    public void f(long j10, boolean z10) {
    }

    @Override // io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.n1
    public void handleMessage(int i10, Object obj) throws a0 {
    }

    public void k(io.bidmachine.media3.common.b[] bVarArr, long j10, long j11, ao.k0 k0Var) {
    }
}
