package l0;

import g2.a2;
import g2.x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.e f72057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m2.z f72058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m2.j0 f72059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i1 f72060h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f72061i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c0.e eVar, m2.z zVar, m2.j0 j0Var, i1 i1Var, j1.b0 b0Var) {
        super(1);
        this.f72057e = eVar;
        this.f72058f = zVar;
        this.f72059g = j0Var;
        this.f72060h = i1Var;
        this.f72061i = b0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(l1.e drawWithContent) {
        i1.j jVar;
        x1 value;
        kotlin.jvm.internal.e0.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        float fCoerceIn = qv.v.coerceIn(((Number) this.f72057e.getValue()).floatValue(), 0.0f, 1.0f);
        if (fCoerceIn == 0.0f) {
            return;
        }
        int iOriginalToTransformed = ((m2.x) this.f72058f).originalToTransformed(a2.m3960getStartimpl(this.f72059g.m5591getSelectiond9O1mEE()));
        k1 layoutResult = this.f72060h.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (jVar = value.getCursorRect(iOriginalToTransformed)) == null) {
            jVar = new i1.j(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float fMo3425toPx0680j_4 = drawWithContent.mo3425toPx0680j_4(e1.getDefaultCursorThickness());
        float f10 = fMo3425toPx0680j_4 / 2;
        float fCoerceAtMost = qv.v.coerceAtMost(jVar.getLeft() + f10, i1.o.m4252getWidthimpl(drawWithContent.mo5314getSizeNHjbRc()) - f10);
        l1.i.m5402drawLine1RTmtNc$default(drawWithContent, this.f72061i, i1.i.Offset(fCoerceAtMost, jVar.getTop()), i1.i.Offset(fCoerceAtMost, jVar.getBottom()), fMo3425toPx0680j_4, 0, null, fCoerceIn, null, 0, 432, null);
    }
}
