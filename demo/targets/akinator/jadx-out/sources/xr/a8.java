package xr;

import xr.z8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a8 extends wr.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final wr.l3 f92249a;

    public a8(d8 d8Var, wr.k kVar, String str) {
        wr.f fVar;
        r1 r1Var;
        u8 u8Var = d8Var.f92426b;
        if (kVar instanceof c8) {
            r1Var = u8Var.f93109g;
            fVar = null;
        } else {
            q1 q1VarSwapChannelCredentials = u8Var.f93109g.swapChannelCredentials(kVar);
            if (q1VarSwapChannelCredentials == null) {
                this.f92249a = wr.q1.newChannelBuilder(str, kVar);
                return;
            } else {
                r1 r1Var2 = q1VarSwapChannelCredentials.f92914a;
                fVar = q1VarSwapChannelCredentials.f92915b;
                r1Var = r1Var2;
            }
        }
        z8 z8Var = new z8(str, kVar, fVar, new z7(r1Var), new z8.a(u8Var.f93105e.getDefaultPort()));
        z8Var.f93301d = u8Var.f93103d;
        this.f92249a = z8Var;
    }

    @Override // wr.g1
    public final wr.l3 a() {
        return this.f92249a;
    }
}
