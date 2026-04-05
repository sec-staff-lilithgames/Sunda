package n1;

import l1.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public j1.y0 f75268a;

    /* renamed from: b, reason: collision with root package name */
    public j1.e0 f75269b;

    /* renamed from: c, reason: collision with root package name */
    public long f75270c = s2.v.f85360b.m6963getZeroYbymL2g();

    /* renamed from: d, reason: collision with root package name */
    public final l1.a f75271d = new l1.a();

    public static /* synthetic */ void drawInto$default(a aVar, l1.i iVar, float f10, j1.n0 n0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            n0Var = null;
        }
        aVar.drawInto(iVar, f10, n0Var);
    }

    /* renamed from: drawCachedImage-CJJAR-o, reason: not valid java name */
    public final void m5707drawCachedImageCJJARo(long j10, s2.e density, s2.x layoutDirection, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        j1.y0 y0VarM4694ImageBitmapx__hDU$default = this.f75268a;
        j1.e0 e0VarCanvas = this.f75269b;
        if (y0VarM4694ImageBitmapx__hDU$default == null || e0VarCanvas == null || s2.v.m6972getWidthimpl(j10) > y0VarM4694ImageBitmapx__hDU$default.getWidth() || s2.v.m6971getHeightimpl(j10) > y0VarM4694ImageBitmapx__hDU$default.getHeight()) {
            y0VarM4694ImageBitmapx__hDU$default = j1.b1.m4694ImageBitmapx__hDU$default(s2.v.m6972getWidthimpl(j10), s2.v.m6971getHeightimpl(j10), 0, false, null, 28, null);
            e0VarCanvas = j1.g0.Canvas(y0VarM4694ImageBitmapx__hDU$default);
            this.f75268a = y0VarM4694ImageBitmapx__hDU$default;
            this.f75269b = e0VarCanvas;
        }
        this.f75270c = j10;
        long jM6981toSizeozmzZPI = s2.w.m6981toSizeozmzZPI(j10);
        l1.a aVar = this.f75271d;
        a.C0738a drawParams = aVar.getDrawParams();
        s2.e eVarComponent1 = drawParams.component1();
        s2.x xVarComponent2 = drawParams.component2();
        j1.e0 e0VarComponent3 = drawParams.component3();
        long jM5316component4NHjbRc = drawParams.m5316component4NHjbRc();
        a.C0738a drawParams2 = aVar.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(e0VarCanvas);
        drawParams2.m5319setSizeuvyYCjk(jM6981toSizeozmzZPI);
        e0VarCanvas.save();
        l1.i.m5411drawRectnJ9OG0$default(aVar, j1.m0.f68918b.m4825getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, j1.x.f69020b.m5035getClear0nO6VwU(), 62, null);
        block.invoke(aVar);
        e0VarCanvas.restore();
        a.C0738a drawParams3 = aVar.getDrawParams();
        drawParams3.setDensity(eVarComponent1);
        drawParams3.setLayoutDirection(xVarComponent2);
        drawParams3.setCanvas(e0VarComponent3);
        drawParams3.m5319setSizeuvyYCjk(jM5316component4NHjbRc);
        y0VarM4694ImageBitmapx__hDU$default.prepareToDraw();
    }

    public final void drawInto(l1.i target, float f10, j1.n0 n0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        j1.y0 y0Var = this.f75268a;
        if (y0Var == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        l1.i.m5400drawImageAZ2fEMs$default(target, y0Var, 0L, this.f75270c, 0L, 0L, f10, null, n0Var, 0, 0, 858, null);
    }

    public final j1.y0 getMCachedImage() {
        return this.f75268a;
    }

    public final void setMCachedImage(j1.y0 y0Var) {
        this.f75268a = y0Var;
    }

    public static /* synthetic */ void getMCachedImage$annotations() {
    }
}
