package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p1 extends ao.y {

    /* renamed from: f, reason: collision with root package name */
    public final gn.t1 f61517f;

    public p1(gn.u1 u1Var) {
        super(u1Var);
        this.f61517f = new gn.t1();
    }

    @Override // ao.y, gn.u1
    public gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
        gn.r1 period = super.getPeriod(i10, r1Var, z10);
        if (getWindow(period.f58110c, this.f61517f).isLive()) {
            period.set(r1Var.f58108a, r1Var.f58109b, r1Var.f58110c, r1Var.f58111d, r1Var.f58112e, gn.b.f57772g, true);
            return period;
        }
        period.f58113f = true;
        return period;
    }
}
