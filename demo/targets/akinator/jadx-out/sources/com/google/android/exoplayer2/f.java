package com.google.android.exoplayer2;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f implements z2, b3 {

    /* renamed from: c, reason: collision with root package name */
    public final int f27448c;

    /* renamed from: f, reason: collision with root package name */
    public c3 f27450f;

    /* renamed from: g, reason: collision with root package name */
    public int f27451g;

    /* renamed from: h, reason: collision with root package name */
    public zd.c0 f27452h;

    /* renamed from: i, reason: collision with root package name */
    public int f27453i;

    /* renamed from: j, reason: collision with root package name */
    public bf.b1 f27454j;

    /* renamed from: k, reason: collision with root package name */
    public z0[] f27455k;

    /* renamed from: l, reason: collision with root package name */
    public long f27456l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27458n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f27459o;

    /* renamed from: p, reason: collision with root package name */
    public a3 f27460p;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27447b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final a1 f27449e = new a1();

    /* renamed from: m, reason: collision with root package name */
    public long f27457m = Long.MIN_VALUE;

    public f(int i10) {
        this.f27448c = i10;
    }

    public final r a(Exception exc, z0 z0Var, boolean z10, int i10) {
        int formatSupport;
        if (z0Var == null || this.f27459o) {
            formatSupport = 4;
        } else {
            this.f27459o = true;
            try {
                formatSupport = b3.getFormatSupport(supportsFormat(z0Var));
            } catch (r unused) {
            } finally {
                this.f27459o = false;
            }
        }
        return r.createForRenderer(exc, getName(), this.f27451g, z0Var, formatSupport, z10, i10);
    }

    @Override // com.google.android.exoplayer2.b3
    public final void clearListener() {
        synchronized (this.f27447b) {
            this.f27460p = null;
        }
    }

    @Override // com.google.android.exoplayer2.z2
    public final void disable() {
        com.google.android.exoplayer2.util.a.checkState(this.f27453i == 1);
        this.f27449e.clear();
        this.f27453i = 0;
        this.f27454j = null;
        this.f27455k = null;
        this.f27458n = false;
        b();
    }

    @Override // com.google.android.exoplayer2.z2
    public final void enable(c3 c3Var, z0[] z0VarArr, bf.b1 b1Var, long j10, boolean z10, boolean z11, long j11, long j12) throws r {
        com.google.android.exoplayer2.util.a.checkState(this.f27453i == 0);
        this.f27450f = c3Var;
        this.f27453i = 1;
        c(z10, z11);
        replaceStream(z0VarArr, b1Var, j11, j12);
        this.f27458n = false;
        this.f27457m = j10;
        d(j10, z10);
    }

    @Override // com.google.android.exoplayer2.z2
    public com.google.android.exoplayer2.util.h0 getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public abstract /* synthetic */ String getName();

    @Override // com.google.android.exoplayer2.z2
    public final long getReadingPositionUs() {
        return this.f27457m;
    }

    @Override // com.google.android.exoplayer2.z2
    public final int getState() {
        return this.f27453i;
    }

    @Override // com.google.android.exoplayer2.z2
    public final bf.b1 getStream() {
        return this.f27454j;
    }

    @Override // com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public final int getTrackType() {
        return this.f27448c;
    }

    @Override // com.google.android.exoplayer2.z2
    public final boolean hasReadStreamToEnd() {
        return this.f27457m == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.z2
    public final void init(int i10, zd.c0 c0Var) {
        this.f27451g = i10;
        this.f27452h = c0Var;
    }

    @Override // com.google.android.exoplayer2.z2
    public final boolean isCurrentStreamFinal() {
        return this.f27458n;
    }

    @Override // com.google.android.exoplayer2.z2
    public abstract /* synthetic */ boolean isEnded();

    @Override // com.google.android.exoplayer2.z2
    public abstract /* synthetic */ boolean isReady();

    public final int j(a1 a1Var, ce.h hVar, int i10) {
        int data = ((bf.b1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27454j)).readData(a1Var, hVar, i10);
        if (data != -4) {
            if (data == -5) {
                z0 z0Var = (z0) com.google.android.exoplayer2.util.a.checkNotNull(a1Var.f27030b);
                if (z0Var.f28806r != Long.MAX_VALUE) {
                    a1Var.f27030b = z0Var.buildUpon().setSubsampleOffsetUs(z0Var.f28806r + this.f27456l).build();
                }
            }
            return data;
        }
        if (hVar.isEndOfStream()) {
            this.f27457m = Long.MIN_VALUE;
            return this.f27458n ? -4 : -3;
        }
        long j10 = hVar.f12239g + this.f27456l;
        hVar.f12239g = j10;
        this.f27457m = Math.max(this.f27457m, j10);
        return data;
    }

    @Override // com.google.android.exoplayer2.z2
    public final void maybeThrowStreamError() throws IOException {
        ((bf.b1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27454j)).maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.z2
    public final void release() {
        com.google.android.exoplayer2.util.a.checkState(this.f27453i == 0);
        e();
    }

    @Override // com.google.android.exoplayer2.z2
    public abstract /* synthetic */ void render(long j10, long j11) throws r;

    @Override // com.google.android.exoplayer2.z2
    public final void replaceStream(z0[] z0VarArr, bf.b1 b1Var, long j10, long j11) throws r {
        com.google.android.exoplayer2.util.a.checkState(!this.f27458n);
        this.f27454j = b1Var;
        if (this.f27457m == Long.MIN_VALUE) {
            this.f27457m = j10;
        }
        this.f27455k = z0VarArr;
        this.f27456l = j11;
        i(z0VarArr, j10, j11);
    }

    @Override // com.google.android.exoplayer2.z2
    public final void reset() {
        com.google.android.exoplayer2.util.a.checkState(this.f27453i == 0);
        this.f27449e.clear();
        f();
    }

    @Override // com.google.android.exoplayer2.z2
    public final void resetPosition(long j10) throws r {
        this.f27458n = false;
        this.f27457m = j10;
        d(j10, false);
    }

    @Override // com.google.android.exoplayer2.z2
    public final void setCurrentStreamFinal() {
        this.f27458n = true;
    }

    @Override // com.google.android.exoplayer2.b3
    public final void setListener(a3 a3Var) {
        synchronized (this.f27447b) {
            this.f27460p = a3Var;
        }
    }

    @Override // com.google.android.exoplayer2.z2
    public /* bridge */ /* synthetic */ void setPlaybackSpeed(float f10, float f11) throws r {
        super.setPlaybackSpeed(f10, f11);
    }

    @Override // com.google.android.exoplayer2.z2
    public final void start() throws r {
        com.google.android.exoplayer2.util.a.checkState(this.f27453i == 1);
        this.f27453i = 2;
        g();
    }

    @Override // com.google.android.exoplayer2.z2
    public final void stop() {
        com.google.android.exoplayer2.util.a.checkState(this.f27453i == 2);
        this.f27453i = 1;
        h();
    }

    @Override // com.google.android.exoplayer2.b3
    public abstract /* synthetic */ int supportsFormat(z0 z0Var) throws r;

    @Override // com.google.android.exoplayer2.b3
    public int supportsMixedMimeTypeAdaptation() throws r {
        return 0;
    }

    public void b() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    @Override // com.google.android.exoplayer2.z2
    public final b3 getCapabilities() {
        return this;
    }

    public void h() {
    }

    public void c(boolean z10, boolean z11) {
    }

    public void d(long j10, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.z2, com.google.android.exoplayer2.t2
    public void handleMessage(int i10, Object obj) throws r {
    }

    public void i(z0[] z0VarArr, long j10, long j11) {
    }
}
