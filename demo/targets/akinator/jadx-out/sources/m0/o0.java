package m0;

import m0.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(h1 h1Var) {
        super(1);
        this.f73803e = h1Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return tu.x0.f87415a;
    }

    public final void invoke(long j10) {
        s selection;
        s.a end;
        s.a start;
        h1 h1Var = this.f73803e;
        s selection2 = h1Var.getSelection();
        if ((selection2 == null || (start = selection2.getStart()) == null || j10 != start.getSelectableId()) && ((selection = h1Var.getSelection()) == null || (end = selection.getEnd()) == null || j10 != end.getSelectableId())) {
            return;
        }
        h1Var.a();
        h1.access$updateSelectionToolbarPosition(h1Var);
    }
}
