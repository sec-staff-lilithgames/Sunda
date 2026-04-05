package io.odeeo.internal.a0;

import io.odeeo.internal.b.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class l extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final y0 f62398c;

    public l(y0 y0Var) {
        this.f62398c = y0Var;
    }

    @Override // io.odeeo.internal.b.y0
    public int getFirstWindowIndex(boolean z10) {
        return this.f62398c.getFirstWindowIndex(z10);
    }

    @Override // io.odeeo.internal.b.y0
    public int getIndexOfPeriod(Object obj) {
        return this.f62398c.getIndexOfPeriod(obj);
    }

    @Override // io.odeeo.internal.b.y0
    public int getLastWindowIndex(boolean z10) {
        return this.f62398c.getLastWindowIndex(z10);
    }

    @Override // io.odeeo.internal.b.y0
    public int getNextWindowIndex(int i10, int i11, boolean z10) {
        return this.f62398c.getNextWindowIndex(i10, i11, z10);
    }

    @Override // io.odeeo.internal.b.y0
    public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
        return this.f62398c.getPeriod(i10, bVar, z10);
    }

    @Override // io.odeeo.internal.b.y0
    public int getPeriodCount() {
        return this.f62398c.getPeriodCount();
    }

    @Override // io.odeeo.internal.b.y0
    public int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        return this.f62398c.getPreviousWindowIndex(i10, i11, z10);
    }

    @Override // io.odeeo.internal.b.y0
    public Object getUidOfPeriod(int i10) {
        return this.f62398c.getUidOfPeriod(i10);
    }

    @Override // io.odeeo.internal.b.y0
    public y0.d getWindow(int i10, y0.d dVar, long j10) {
        return this.f62398c.getWindow(i10, dVar, j10);
    }

    @Override // io.odeeo.internal.b.y0
    public int getWindowCount() {
        return this.f62398c.getWindowCount();
    }
}
