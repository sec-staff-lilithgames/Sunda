package l0;

import g2.x1;
import p0.j2;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public y0 f72137a;

    /* renamed from: b, reason: collision with root package name */
    public final long f72138b;

    /* renamed from: c, reason: collision with root package name */
    public kv.l f72139c;

    /* renamed from: d, reason: collision with root package name */
    public m0.r f72140d;

    /* renamed from: e, reason: collision with root package name */
    public x1.d0 f72141e;

    /* renamed from: f, reason: collision with root package name */
    public x1 f72142f;

    /* renamed from: g, reason: collision with root package name */
    public long f72143g;

    /* renamed from: h, reason: collision with root package name */
    public long f72144h;

    /* renamed from: i, reason: collision with root package name */
    public final j2 f72145i;

    public o1(y0 textDelegate, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textDelegate, "textDelegate");
        this.f72137a = textDelegate;
        this.f72138b = j10;
        this.f72139c = n1.f72132e;
        this.f72143g = i1.h.f59344b.m4173getZeroF1C5BW0();
        this.f72144h = j1.m0.f68918b.m4835getUnspecified0d7_KjU();
        this.f72145i = z4.mutableStateOf(tu.x0.f87415a, z4.neverEqualPolicy());
    }

    public final tu.x0 getDrawScopeInvalidation() {
        this.f72145i.getValue();
        return tu.x0.f87415a;
    }

    public final x1.d0 getLayoutCoordinates() {
        return this.f72141e;
    }

    public final x1 getLayoutResult() {
        return this.f72142f;
    }

    public final kv.l getOnTextLayout() {
        return this.f72139c;
    }

    /* renamed from: getPreviousGlobalPosition-F1C5BW0, reason: not valid java name */
    public final long m5271getPreviousGlobalPositionF1C5BW0() {
        return this.f72143g;
    }

    public final m0.r getSelectable() {
        return this.f72140d;
    }

    public final long getSelectableId() {
        return this.f72138b;
    }

    /* renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m5272getSelectionBackgroundColor0d7_KjU() {
        return this.f72144h;
    }

    public final y0 getTextDelegate() {
        return this.f72137a;
    }

    public final void setLayoutCoordinates(x1.d0 d0Var) {
        this.f72141e = d0Var;
    }

    public final void setLayoutResult(x1 x1Var) {
        this.f72145i.setValue(tu.x0.f87415a);
        this.f72142f = x1Var;
    }

    public final void setOnTextLayout(kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
        this.f72139c = lVar;
    }

    /* renamed from: setPreviousGlobalPosition-k-4lQ0M, reason: not valid java name */
    public final void m5273setPreviousGlobalPositionk4lQ0M(long j10) {
        this.f72143g = j10;
    }

    public final void setSelectable(m0.r rVar) {
        this.f72140d = rVar;
    }

    /* renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m5274setSelectionBackgroundColor8_81llA(long j10) {
        this.f72144h = j10;
    }

    public final void setTextDelegate(y0 y0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(y0Var, "<set-?>");
        this.f72137a = y0Var;
    }
}
