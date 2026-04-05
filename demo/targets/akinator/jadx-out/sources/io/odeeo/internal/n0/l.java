package io.odeeo.internal.n0;

import io.odeeo.internal.b.r0;
import io.odeeo.internal.b.z0;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f65055a;

    /* renamed from: b, reason: collision with root package name */
    public final r0[] f65056b;

    /* renamed from: c, reason: collision with root package name */
    public final d[] f65057c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f65058d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f65059e;

    @Deprecated
    public l(r0[] r0VarArr, d[] dVarArr, Object obj) {
        this(r0VarArr, dVarArr, z0.f63197b, obj);
    }

    public boolean isEquivalent(l lVar) {
        if (lVar == null || lVar.f65057c.length != this.f65057c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f65057c.length; i10++) {
            if (!isEquivalent(lVar, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRendererEnabled(int i10) {
        return this.f65056b[i10] != null;
    }

    public l(r0[] r0VarArr, d[] dVarArr, z0 z0Var, Object obj) {
        this.f65056b = r0VarArr;
        this.f65057c = (d[]) dVarArr.clone();
        this.f65058d = z0Var;
        this.f65059e = obj;
        this.f65055a = r0VarArr.length;
    }

    public boolean isEquivalent(l lVar, int i10) {
        return lVar != null && g0.areEqual(this.f65056b[i10], lVar.f65056b[i10]) && g0.areEqual(this.f65057c[i10], lVar.f65057c[i10]);
    }
}
