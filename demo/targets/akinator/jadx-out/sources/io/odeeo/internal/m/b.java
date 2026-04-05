package io.odeeo.internal.m;

import io.odeeo.internal.g.v;
import io.odeeo.internal.g.w;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f64594a;

    /* renamed from: b, reason: collision with root package name */
    public final q f64595b;

    /* renamed from: c, reason: collision with root package name */
    public final q f64596c;

    /* renamed from: d, reason: collision with root package name */
    public long f64597d;

    public b(long j10, long j11, long j12) {
        this.f64597d = j10;
        this.f64594a = j12;
        q qVar = new q();
        this.f64595b = qVar;
        q qVar2 = new q();
        this.f64596c = qVar2;
        qVar.add(0L);
        qVar2.add(j11);
    }

    public void a(long j10) {
        this.f64597d = j10;
    }

    @Override // io.odeeo.internal.m.e
    public long getDataEndPosition() {
        return this.f64594a;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public long getDurationUs() {
        return this.f64597d;
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public v.a getSeekPoints(long j10) {
        int iBinarySearchFloor = g0.binarySearchFloor(this.f64595b, j10, true, true);
        w wVar = new w(this.f64595b.get(iBinarySearchFloor), this.f64596c.get(iBinarySearchFloor));
        if (wVar.f64177a == j10 || iBinarySearchFloor == this.f64595b.size() - 1) {
            return new v.a(wVar);
        }
        int i10 = iBinarySearchFloor + 1;
        return new v.a(wVar, new w(this.f64595b.get(i10), this.f64596c.get(i10)));
    }

    @Override // io.odeeo.internal.m.e
    public long getTimeUs(long j10) {
        return this.f64595b.get(g0.binarySearchFloor(this.f64596c, j10, true, true));
    }

    @Override // io.odeeo.internal.m.e, io.odeeo.internal.g.v
    public boolean isSeekable() {
        return true;
    }

    public boolean isTimeUsInIndex(long j10) {
        q qVar = this.f64595b;
        return j10 - qVar.get(qVar.size() - 1) < 100000;
    }

    public void maybeAddSeekPoint(long j10, long j11) {
        if (isTimeUsInIndex(j10)) {
            return;
        }
        this.f64595b.add(j10);
        this.f64596c.add(j11);
    }
}
