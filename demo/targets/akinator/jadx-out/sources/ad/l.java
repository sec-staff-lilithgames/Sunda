package ad;

import jc.n0;
import tb.f1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final jc.o f4278a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.c0 f4279b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f4280c;

    /* renamed from: d, reason: collision with root package name */
    public final jc.w f4281d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4282e;

    public l(jc.o oVar, ub.c0 c0Var, f1 f1Var, jc.w wVar, boolean z10) {
        this.f4278a = oVar;
        this.f4279b = c0Var;
        this.f4280c = f1Var;
        this.f4281d = wVar;
        this.f4282e = z10;
    }

    public static l construct(jc.o oVar, n0 n0Var, f1 f1Var, boolean z10) {
        String simpleName = n0Var == null ? null : n0Var.getSimpleName();
        return new l(oVar, simpleName != null ? new cc.q(simpleName) : null, f1Var, null, z10);
    }

    public l withAlwaysAsId(boolean z10) {
        if (z10 == this.f4282e) {
            return this;
        }
        return new l(this.f4278a, this.f4279b, this.f4280c, this.f4281d, z10);
    }

    public l withSerializer(jc.w wVar) {
        return new l(this.f4278a, this.f4279b, this.f4280c, wVar, this.f4282e);
    }
}
