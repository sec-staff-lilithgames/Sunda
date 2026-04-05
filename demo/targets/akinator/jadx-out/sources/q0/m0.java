package q0;

import p0.i4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f82359c = new m0(1, 0, 2, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        int i10 = o0Var.getInt(0);
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.up();
        }
    }

    public final int getCount() {
        return 0;
    }

    @Override // q0.n0
    public String intParamName(int i10) {
        return i10 == 0 ? "count" : super.intParamName(i10);
    }
}
