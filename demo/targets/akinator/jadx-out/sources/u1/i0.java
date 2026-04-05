package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: b, reason: collision with root package name */
    public x1.d0 f87597b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87598c;

    public boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    public final x1.d0 getLayoutCoordinates$ui_release() {
        return this.f87597b;
    }

    public boolean getShareWithSiblings() {
        return false;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m7321getSizeYbymL2g() {
        x1.d0 d0Var = this.f87597b;
        return d0Var != null ? d0Var.mo7827getSizeYbymL2g() : s2.v.f85360b.m6963getZeroYbymL2g();
    }

    public final boolean isAttached$ui_release() {
        return this.f87598c;
    }

    public abstract void onCancel();

    /* renamed from: onPointerEvent-H0pRuoY */
    public abstract void mo7319onPointerEventH0pRuoY(m mVar, o oVar, long j10);

    public final void setAttached$ui_release(boolean z10) {
        this.f87598c = z10;
    }

    public final void setLayoutCoordinates$ui_release(x1.d0 d0Var) {
        this.f87597b = d0Var;
    }

    public static /* synthetic */ void getShareWithSiblings$annotations() {
    }
}
