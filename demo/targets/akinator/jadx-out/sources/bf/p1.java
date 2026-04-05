package bf;

import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p1 extends i {

    /* renamed from: k, reason: collision with root package name */
    public final f0 f9377k;

    public p1(f0 f0Var) {
        this.f9377k = f0Var;
    }

    @Override // bf.a
    public final void c(qf.c1 c1Var) {
        this.f9270j = c1Var;
        this.f9269i = com.google.android.exoplayer2.util.n1.createHandlerForCurrentLooper();
        prepareSourceInternal();
    }

    @Override // bf.i, bf.a, bf.f0
    public a0 createPeriod(d0 d0Var, qf.c cVar, long j10) {
        return this.f9377k.createPeriod(d0Var, cVar, j10);
    }

    @Override // bf.i
    public final d0 e(Object obj, d0 d0Var) {
        return j(d0Var);
    }

    @Override // bf.i
    public final long f(Object obj, long j10) {
        return j10;
    }

    @Override // bf.i
    public final int g(Object obj, int i10) {
        return i10;
    }

    @Override // bf.i, bf.a, bf.f0
    public m3 getInitialTimeline() {
        return this.f9377k.getInitialTimeline();
    }

    @Override // bf.i, bf.a, bf.f0
    public u1 getMediaItem() {
        return this.f9377k.getMediaItem();
    }

    @Override // bf.i
    public final void h(Object obj, f0 f0Var, m3 m3Var) {
        k(m3Var);
    }

    @Override // bf.i, bf.a, bf.f0
    public boolean isSingleWindow() {
        return this.f9377k.isSingleWindow();
    }

    public abstract void k(m3 m3Var);

    public void prepareSourceInternal() {
        i(null, this.f9377k);
    }

    @Override // bf.i, bf.a, bf.f0
    public void releasePeriod(a0 a0Var) {
        this.f9377k.releasePeriod(a0Var);
    }

    public d0 j(d0 d0Var) {
        return d0Var;
    }
}
