package s4;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f85426a;

    /* renamed from: b, reason: collision with root package name */
    public r0 f85427b;

    public n0(int i10) {
        this.f85426a = new SparseArray(i10);
    }

    public final void a(r0 r0Var, int i10, int i11) {
        int codepointAt = r0Var.getCodepointAt(i10);
        SparseArray sparseArray = this.f85426a;
        n0 n0Var = sparseArray == null ? null : (n0) sparseArray.get(codepointAt);
        if (n0Var == null) {
            n0Var = new n0(1);
            sparseArray.put(r0Var.getCodepointAt(i10), n0Var);
        }
        if (i11 > i10) {
            n0Var.a(r0Var, i10 + 1, i11);
        } else {
            n0Var.f85427b = r0Var;
        }
    }
}
