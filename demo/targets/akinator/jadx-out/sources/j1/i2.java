package j1;

import a2.x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 extends x3 implements x1.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final float f68882e;

    /* renamed from: f, reason: collision with root package name */
    public final float f68883f;

    /* renamed from: g, reason: collision with root package name */
    public final float f68884g;

    /* renamed from: h, reason: collision with root package name */
    public final float f68885h;

    /* renamed from: i, reason: collision with root package name */
    public final float f68886i;

    /* renamed from: j, reason: collision with root package name */
    public final float f68887j;

    /* renamed from: k, reason: collision with root package name */
    public final float f68888k;

    /* renamed from: l, reason: collision with root package name */
    public final float f68889l;

    /* renamed from: m, reason: collision with root package name */
    public final float f68890m;

    /* renamed from: n, reason: collision with root package name */
    public final float f68891n;

    /* renamed from: o, reason: collision with root package name */
    public final long f68892o;

    /* renamed from: p, reason: collision with root package name */
    public final f2 f68893p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f68894q;

    /* renamed from: r, reason: collision with root package name */
    public final z1 f68895r;

    /* renamed from: s, reason: collision with root package name */
    public final long f68896s;

    /* renamed from: t, reason: collision with root package name */
    public final long f68897t;

    /* renamed from: u, reason: collision with root package name */
    public final g2 f68898u;

    public i2(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, f2 f2Var, boolean z10, z1 z1Var, long j11, long j12, kv.l lVar, kotlin.jvm.internal.u uVar) {
        super(lVar);
        this.f68882e = f10;
        this.f68883f = f11;
        this.f68884g = f12;
        this.f68885h = f13;
        this.f68886i = f14;
        this.f68887j = f15;
        this.f68888k = f16;
        this.f68889l = f17;
        this.f68890m = f18;
        this.f68891n = f19;
        this.f68892o = j10;
        this.f68893p = f2Var;
        this.f68894q = z10;
        this.f68895r = z1Var;
        this.f68896s = j11;
        this.f68897t = j12;
        this.f68898u = new g2(this);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        i2 i2Var = obj instanceof i2 ? (i2) obj : null;
        return i2Var != null && this.f68882e == i2Var.f68882e && this.f68883f == i2Var.f68883f && this.f68884g == i2Var.f68884g && this.f68885h == i2Var.f68885h && this.f68886i == i2Var.f68886i && this.f68887j == i2Var.f68887j && this.f68888k == i2Var.f68888k && this.f68889l == i2Var.f68889l && this.f68890m == i2Var.f68890m && this.f68891n == i2Var.f68891n && u2.m5012equalsimpl0(this.f68892o, i2Var.f68892o) && kotlin.jvm.internal.e0.areEqual(this.f68893p, i2Var.f68893p) && this.f68894q == i2Var.f68894q && kotlin.jvm.internal.e0.areEqual(this.f68895r, i2Var.f68895r) && m0.m4859equalsimpl0(this.f68896s, i2Var.f68896s) && m0.m4859equalsimpl0(this.f68897t, i2Var.f68897t);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public int hashCode() {
        int iC = com.google.android.gms.internal.play_billing.a.c((this.f68893p.hashCode() + ((u2.m5015hashCodeimpl(this.f68892o) + b0.e2.b(this.f68891n, b0.e2.b(this.f68890m, b0.e2.b(this.f68889l, b0.e2.b(this.f68888k, b0.e2.b(this.f68887j, b0.e2.b(this.f68886i, b0.e2.b(this.f68885h, b0.e2.b(this.f68884g, b0.e2.b(this.f68883f, Float.hashCode(this.f68882e) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31, this.f68894q);
        z1 z1Var = this.f68895r;
        return m0.m4865hashCodeimpl(this.f68897t) + ((m0.m4865hashCodeimpl(this.f68896s) + ((iC + (z1Var != null ? z1Var.hashCode() : 0)) * 31)) * 31);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicWidth(zVar, yVar, i10);
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(j10);
        return x1.a1.layout$default(measure, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new h2(q1VarMo7826measureBRTryo0, this), 4, null);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicWidth(zVar, yVar, i10);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f68882e + ", scaleY=" + this.f68883f + ", alpha = " + this.f68884g + ", translationX=" + this.f68885h + ", translationY=" + this.f68886i + ", shadowElevation=" + this.f68887j + ", rotationX=" + this.f68888k + ", rotationY=" + this.f68889l + ", rotationZ=" + this.f68890m + ", cameraDistance=" + this.f68891n + ", transformOrigin=" + ((Object) u2.m5016toStringimpl(this.f68892o)) + ", shape=" + this.f68893p + ", clip=" + this.f68894q + ", renderEffect=" + this.f68895r + ", ambientShadowColor=" + ((Object) m0.m4866toStringimpl(this.f68896s)) + ", spotShadowColor=" + ((Object) m0.m4866toStringimpl(this.f68897t)) + ')';
    }
}
