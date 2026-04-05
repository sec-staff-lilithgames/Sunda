package es;

import wr.f3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 implements f3 {

    /* renamed from: a, reason: collision with root package name */
    public final f3 f55033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f55034b;

    public g0(h0 h0Var, f3 f3Var) {
        this.f55034b = h0Var;
        this.f55033a = f3Var;
    }

    @Override // wr.f3
    public void onSubchannelState(wr.g0 g0Var) {
        h0 h0Var = this.f55034b;
        h0Var.f55038d = g0Var;
        if (h0Var.f55037c) {
            return;
        }
        this.f55033a.onSubchannelState(g0Var);
    }
}
