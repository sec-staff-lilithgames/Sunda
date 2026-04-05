package m0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h1 h1Var) {
        super(1);
        this.f73813e = h1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return tu.x0.f87415a;
    }

    public final void invoke(long j10) {
        h1 h1Var = this.f73813e;
        tu.v vVarSelectAll$foundation_release = h1Var.selectAll$foundation_release(j10, h1Var.getSelection());
        s sVar = (s) vVarSelectAll$foundation_release.component1();
        Map<Long, s> map = (Map) vVarSelectAll$foundation_release.component2();
        if (!kotlin.jvm.internal.e0.areEqual(sVar, h1Var.getSelection())) {
            h1Var.f73722a.setSubselections(map);
            h1Var.getOnSelectionChange().invoke(sVar);
        }
        h1Var.getFocusRequester().requestFocus();
        h1Var.hideSelectionToolbar$foundation_release();
    }
}
