package q0;

import p0.i4;
import p0.k3;
import p0.k4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f82349c = new h0(1, 0, 2, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        int i10 = o0Var.getInt(0);
        int parent = v4Var.getParent();
        int iSlotsStartIndex$runtime = v4Var.slotsStartIndex$runtime(parent);
        int iSlotsEndIndex$runtime = v4Var.slotsEndIndex$runtime(parent);
        for (int iMax = Math.max(iSlotsStartIndex$runtime, iSlotsEndIndex$runtime - i10); iMax < iSlotsEndIndex$runtime; iMax++) {
            Object obj = v4Var.f80543c[v4Var.c(iMax)];
            if (obj instanceof k4) {
                i4Var.forgetting((k4) obj);
            } else if (obj instanceof k3) {
                ((k3) obj).release();
            }
        }
        v4Var.trimTailSlots(i10);
    }

    public final int getCount() {
        return 0;
    }

    @Override // q0.n0
    public String intParamName(int i10) {
        return i10 == 0 ? "count" : super.intParamName(i10);
    }
}
