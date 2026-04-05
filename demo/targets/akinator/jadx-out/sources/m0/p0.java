package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f73810e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(h1 h1Var) {
        super(3);
        this.f73810e = h1Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m5554invoked4ec7I((x1.d0) obj, ((i1.h) obj2).m4195unboximpl(), (b0) obj3);
        return tu.x0.f87415a;
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final void m5554invoked4ec7I(x1.d0 layoutCoordinates, long j10, b0 selectionMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        kotlin.jvm.internal.e0.checkNotNullParameter(selectionMode, "selectionMode");
        h1 h1Var = this.f73810e;
        i1.h hVarM5510access$convertToContainerCoordinatesQ7Q5hAU = h1.m5510access$convertToContainerCoordinatesQ7Q5hAU(h1Var, layoutCoordinates, j10);
        if (hVarM5510access$convertToContainerCoordinatesQ7Q5hAU != null) {
            long jM4195unboximpl = hVarM5510access$convertToContainerCoordinatesQ7Q5hAU.m4195unboximpl();
            h1Var.m5523updateSelection3R_tFg$foundation_release(jM4195unboximpl, jM4195unboximpl, null, false, selectionMode);
            h1Var.getFocusRequester().requestFocus();
            h1Var.hideSelectionToolbar$foundation_release();
        }
    }
}
