package d0;

import j1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f51491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1.f2 f51492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z1.a2 f51493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f51494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(float f10, j1.f2 f2Var, z1.a2 a2Var, j1.b0 b0Var) {
        super(1);
        this.f51491e = f10;
        this.f51492f = f2Var;
        this.f51493g = a2Var;
        this.f51494h = b0Var;
    }

    @Override // kv.l
    public final g1.l invoke(g1.d drawWithCache) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float f10 = this.f51491e;
        if (drawWithCache.mo3425toPx0680j_4(f10) < 0.0f || i1.o.m4251getMinDimensionimpl(drawWithCache.m3936getSizeNHjbRc()) <= 0.0f) {
            return drawWithCache.onDrawWithContent(p.f51554e);
        }
        float f11 = 2;
        float fMin = Math.min(s2.i.m6822equalsimpl0(f10, s2.i.f85335c.m6812getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawWithCache.mo3425toPx0680j_4(f10)), (float) Math.ceil(i1.o.m4251getMinDimensionimpl(drawWithCache.m3936getSizeNHjbRc()) / f11));
        float f12 = fMin / f11;
        long jOffset = i1.i.Offset(f12, f12);
        long jSize = i1.p.Size(i1.o.m4252getWidthimpl(drawWithCache.m3936getSizeNHjbRc()) - fMin, i1.o.m4249getHeightimpl(drawWithCache.m3936getSizeNHjbRc()) - fMin);
        boolean z10 = f11 * fMin > i1.o.m4251getMinDimensionimpl(drawWithCache.m3936getSizeNHjbRc());
        j1.g1 g1VarMo3688createOutlinePq9zytI = this.f51492f.mo3688createOutlinePq9zytI(drawWithCache.m3936getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
        if (g1VarMo3688createOutlinePq9zytI instanceof g1.a) {
            return o.access$drawGenericBorder(drawWithCache, this.f51493g, this.f51494h, (g1.a) g1VarMo3688createOutlinePq9zytI, z10, fMin);
        }
        if (g1VarMo3688createOutlinePq9zytI instanceof g1.c) {
            return o.m3721access$drawRoundRectBorderSYlcjDY(drawWithCache, this.f51493g, this.f51494h, (g1.c) g1VarMo3688createOutlinePq9zytI, jOffset, jSize, z10, fMin);
        }
        if (g1VarMo3688createOutlinePq9zytI instanceof g1.b) {
            return drawWithCache.onDrawWithContent(new s(this.f51494h, z10 ? i1.h.f59344b.m4173getZeroF1C5BW0() : jOffset, z10 ? drawWithCache.m3936getSizeNHjbRc() : jSize, z10 ? l1.m.f72234a : new l1.n(fMin, 0.0f, 0, 0, null, 30, null)));
        }
        throw new tu.t();
    }
}
