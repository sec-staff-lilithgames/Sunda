package androidx.recyclerview.widget;

import android.util.SparseArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o3 implements q3 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f7209a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f7210b = 0;

    @Override // androidx.recyclerview.widget.q3
    public p3 createViewTypeWrapper(j1 j1Var) {
        return new n3(this, j1Var);
    }

    @Override // androidx.recyclerview.widget.q3
    public j1 getWrapperForGlobalType(int i10) {
        j1 j1Var = (j1) this.f7209a.get(i10);
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalArgumentException(a.b.e(i10, "Cannot find the wrapper for global view type "));
    }
}
