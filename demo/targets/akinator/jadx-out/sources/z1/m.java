package z1;

import l1.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends o0 implements t1 {

    /* renamed from: k, reason: collision with root package name */
    public static final l f97341k;

    /* renamed from: g, reason: collision with root package name */
    public g1.g f97342g;

    /* renamed from: h, reason: collision with root package name */
    public final n f97343h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97344i;

    /* renamed from: j, reason: collision with root package name */
    public final o f97345j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f97341k = l.f97337e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u0 layoutNodeWrapper, g1.i modifier) {
        super(layoutNodeWrapper, modifier);
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
        g1.i iVar = (g1.i) getModifier();
        this.f97342g = iVar instanceof g1.g ? (g1.g) iVar : null;
        this.f97343h = new n(this, layoutNodeWrapper);
        this.f97344i = true;
        this.f97345j = new o(this);
    }

    public final void draw(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        long jM6981toSizeozmzZPI = s2.w.m6981toSizeozmzZPI(m8050getSizeYbymL2g());
        if (this.f97342g != null && this.f97344i) {
            p0.requireOwner(getLayoutNode()).getSnapshotObserver().observeReads$ui_release(this, f97341k, this.f97345j);
        }
        n0 mDrawScope$ui_release = getLayoutNode().getMDrawScope$ui_release();
        u0 layoutNodeWrapper = getLayoutNodeWrapper();
        m mVar = mDrawScope$ui_release.f97360c;
        mDrawScope$ui_release.f97360c = this;
        l1.a aVar = mDrawScope$ui_release.f97359b;
        x1.a1 measureScope = layoutNodeWrapper.getMeasureScope();
        s2.x layoutDirection = layoutNodeWrapper.getMeasureScope().getLayoutDirection();
        a.C0738a drawParams = aVar.getDrawParams();
        s2.e eVarComponent1 = drawParams.component1();
        s2.x xVarComponent2 = drawParams.component2();
        j1.e0 e0VarComponent3 = drawParams.component3();
        long jM5316component4NHjbRc = drawParams.m5316component4NHjbRc();
        a.C0738a drawParams2 = aVar.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m5319setSizeuvyYCjk(jM6981toSizeozmzZPI);
        canvas.save();
        ((g1.i) getModifier()).draw(mDrawScope$ui_release);
        canvas.restore();
        a.C0738a drawParams3 = aVar.getDrawParams();
        drawParams3.setDensity(eVarComponent1);
        drawParams3.setLayoutDirection(xVarComponent2);
        drawParams3.setCanvas(e0VarComponent3);
        drawParams3.m5319setSizeuvyYCjk(jM5316component4NHjbRc);
        mDrawScope$ui_release.f97360c = mVar;
    }

    @Override // z1.t1
    public boolean isValid() {
        return getLayoutNodeWrapper().isAttached();
    }

    @Override // z1.o0
    public void onAttach() {
        g1.i iVar = (g1.i) getModifier();
        this.f97342g = iVar instanceof g1.g ? (g1.g) iVar : null;
        this.f97344i = true;
        super.onAttach();
    }

    public final void onMeasureResultChanged() {
        this.f97344i = true;
    }
}
