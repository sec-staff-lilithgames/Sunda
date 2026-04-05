package l0;

import g2.x1;
import java.util.Map;
import m0.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f72136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(x0 x0Var) {
        super(1);
        this.f72136e = x0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.i) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.i drawBehind) {
        Map<Long, m0.s> subselections;
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBehind, "$this$drawBehind");
        x0 x0Var = this.f72136e;
        x1 layoutResult = x0Var.getState().getLayoutResult();
        if (layoutResult != null) {
            x0Var.getState().getDrawScopeInvalidation();
            t1 t1Var = x0Var.f72198c;
            m0.s sVar = (t1Var == null || (subselections = t1Var.getSubselections()) == null) ? null : subselections.get(Long.valueOf(x0Var.getState().getSelectableId()));
            if (sVar != null) {
                int offset = !sVar.getHandlesCrossed() ? sVar.getStart().getOffset() : sVar.getEnd().getOffset();
                int offset2 = !sVar.getHandlesCrossed() ? sVar.getEnd().getOffset() : sVar.getStart().getOffset();
                if (offset != offset2) {
                    l1.i.m5407drawPathLG529CI$default(drawBehind, layoutResult.getMultiParagraph().getPathForRange(offset, offset2), x0Var.getState().m5272getSelectionBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
                }
            }
            y0.f72207k.paint(((l1.b) drawBehind.getDrawContext()).getCanvas(), layoutResult);
        }
    }
}
