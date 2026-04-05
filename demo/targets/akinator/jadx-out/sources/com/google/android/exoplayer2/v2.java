package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v2 extends bf.q {

    /* renamed from: h, reason: collision with root package name */
    public final l3 f28630h;

    public v2(m3 m3Var) {
        super(m3Var);
        this.f28630h = new l3();
    }

    @Override // bf.q, com.google.android.exoplayer2.m3
    public k3 getPeriod(int i10, k3 k3Var, boolean z10) {
        k3 period = super.getPeriod(i10, k3Var, z10);
        if (getWindow(period.f27598e, this.f28630h).isLive()) {
            period.set(k3Var.f27596b, k3Var.f27597c, k3Var.f27598e, k3Var.f27599f, k3Var.f27600g, cf.b.f12271i, true);
            return period;
        }
        period.f27601h = true;
        return period;
    }
}
