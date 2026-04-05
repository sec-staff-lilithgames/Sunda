package ds;

import mh.p1;
import wr.e4;
import wr.k5;
import wr.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 implements m5 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f52627a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52628b;

    public j0(h0 h0Var, boolean z10) {
        this.f52627a = h0Var;
        this.f52628b = z10;
    }

    @Override // wr.m5
    public k5.a startCall(k5 k5Var, e4 e4Var) {
        p1.checkArgument(k5Var.getMethodDescriptor().getType().clientSendsOneMessage(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        b0 b0Var = new b0(k5Var, this.f52628b);
        k5Var.request(2);
        return new i0(this, b0Var, k5Var);
    }
}
