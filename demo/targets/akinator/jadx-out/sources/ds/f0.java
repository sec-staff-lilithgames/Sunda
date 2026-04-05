package ds;

import wr.e4;
import wr.k5;
import wr.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f52605a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52606b;

    public f0(d0 d0Var, boolean z10) {
        this.f52605a = d0Var;
        this.f52606b = z10;
    }

    @Override // wr.m5
    public k5.a startCall(k5 k5Var, e4 e4Var) {
        b0 b0Var = new b0(k5Var, this.f52606b);
        l0 l0VarInvoke = ((rk.w) this.f52605a).invoke(b0Var);
        b0Var.f52591d = true;
        if (b0Var.f52592e) {
            k5Var.request(1);
        }
        return new e0(l0VarInvoke, b0Var, k5Var);
    }
}
