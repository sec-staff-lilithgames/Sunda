package l0;

import m0.t1;
import m0.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f72125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(x0 x0Var) {
        super(1);
        this.f72125e = x0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((x1.d0) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(x1.d0 it) {
        t1 t1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        x0 x0Var = this.f72125e;
        x0Var.getState().setLayoutCoordinates(it);
        if (w1.hasSelection(x0Var.f72198c, x0Var.getState().getSelectableId())) {
            long jPositionInWindow = x1.e0.positionInWindow(it);
            if (!i1.h.m4182equalsimpl0(jPositionInWindow, x0Var.getState().m5271getPreviousGlobalPositionF1C5BW0()) && (t1Var = x0Var.f72198c) != null) {
                t1Var.notifyPositionChange(x0Var.getState().getSelectableId());
            }
            x0Var.getState().m5273setPreviousGlobalPositionk4lQ0M(jPositionInWindow);
        }
    }
}
