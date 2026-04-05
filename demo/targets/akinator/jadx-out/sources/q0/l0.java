package q0;

import p0.i4;
import p0.k3;
import p0.k4;
import p0.v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f82357c = new l0(1, 1, null);

    @Override // q0.n0
    public final void a(o0 o0Var, p0.d dVar, v4 v4Var, i4 i4Var, p0 p0Var) {
        Object objMo5927getObject31yXWZQ = o0Var.mo5927getObject31yXWZQ(w.m5952constructorimpl(0));
        int i10 = o0Var.getInt(0);
        if (objMo5927getObject31yXWZQ instanceof k4) {
            i4Var.remembering((k4) objMo5927getObject31yXWZQ);
        }
        Object obj = v4Var.set(v4Var.getCurrentGroup(), i10, objMo5927getObject31yXWZQ);
        if (obj instanceof k4) {
            i4Var.forgetting((k4) obj);
        } else if (obj instanceof k3) {
            ((k3) obj).release();
        }
    }

    public final int getGroupSlotIndex() {
        return 0;
    }

    /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
    public final int m5925getValueHpuvwBQ() {
        return w.m5952constructorimpl(0);
    }

    @Override // q0.n0
    public String intParamName(int i10) {
        return i10 == 0 ? "groupSlotIndex" : super.intParamName(i10);
    }

    @Override // q0.n0
    /* renamed from: objectParamName-31yXWZQ */
    public String mo5902objectParamName31yXWZQ(int i10) {
        return w.m5954equalsimpl0(i10, w.m5952constructorimpl(0)) ? "value" : super.mo5902objectParamName31yXWZQ(i10);
    }
}
