package p0;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements m3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f80166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2 f80167c;

    public c0(y0 y0Var, i2 i2Var) {
        this.f80166b = y0Var;
        this.f80167c = i2Var;
    }

    @Override // p0.m3
    public t1 invalidate(k3 k3Var, Object obj) {
        t1 t1VarInvalidate;
        y0 y0Var = this.f80166b;
        m3 m3Var = y0Var instanceof m3 ? (m3) y0Var : null;
        if (m3Var == null || (t1VarInvalidate = m3Var.invalidate(k3Var, obj)) == null) {
            t1VarInvalidate = t1.f80476b;
        }
        if (t1VarInvalidate != t1.f80476b) {
            return t1VarInvalidate;
        }
        i2 i2Var = this.f80167c;
        i2Var.setInvalidations$runtime(uu.y0.plus((Collection<? extends tu.v>) i2Var.getInvalidations$runtime(), tu.e0.to(k3Var, obj)));
        return t1.f80477c;
    }

    @Override // p0.m3
    public void recomposeScopeReleased(k3 k3Var) {
    }

    @Override // p0.m3
    public void recordReadOf(Object obj) {
    }
}
