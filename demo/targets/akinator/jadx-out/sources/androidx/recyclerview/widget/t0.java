package androidx.recyclerview.widget;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 implements Comparator {
    @Override // java.util.Comparator
    public int compare(v0 v0Var, v0 v0Var2) {
        RecyclerView recyclerView = v0Var.f7290d;
        if ((recyclerView == null) != (v0Var2.f7290d == null)) {
            return recyclerView == null ? 1 : -1;
        }
        boolean z10 = v0Var.f7287a;
        if (z10 != v0Var2.f7287a) {
            return z10 ? -1 : 1;
        }
        int i10 = v0Var2.f7288b - v0Var.f7288b;
        if (i10 != 0) {
            return i10;
        }
        int i11 = v0Var.f7289c - v0Var2.f7289c;
        if (i11 != 0) {
            return i11;
        }
        return 0;
    }
}
