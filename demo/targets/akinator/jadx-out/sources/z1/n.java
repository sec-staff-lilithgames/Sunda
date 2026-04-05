package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements g1.b {

    /* renamed from: a, reason: collision with root package name */
    public final s2.e f97356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f97357b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f97358c;

    public n(m mVar, u0 u0Var) {
        this.f97357b = mVar;
        this.f97358c = u0Var;
        this.f97356a = mVar.getLayoutNode().getDensity();
    }

    @Override // g1.b
    public s2.e getDensity() {
        return this.f97356a;
    }

    @Override // g1.b
    public s2.x getLayoutDirection() {
        return this.f97357b.getLayoutNode().getLayoutDirection();
    }

    @Override // g1.b
    /* renamed from: getSize-NH-jbRc */
    public long mo3935getSizeNHjbRc() {
        return s2.w.m6981toSizeozmzZPI(this.f97358c.mo7827getSizeYbymL2g());
    }
}
