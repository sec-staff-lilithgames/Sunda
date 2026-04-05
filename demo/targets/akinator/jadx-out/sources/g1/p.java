package g1;

import a2.x3;
import b0.e2;
import e1.v;
import j1.n0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import s2.w;
import x1.a1;
import x1.a2;
import x1.o0;
import x1.q1;
import x1.w0;
import x1.y;
import x1.y0;
import x1.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends x3 implements o0, i {

    /* renamed from: e, reason: collision with root package name */
    public final m1.e f56683e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56684f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.d f56685g;

    /* renamed from: h, reason: collision with root package name */
    public final x1.r f56686h;

    /* renamed from: i, reason: collision with root package name */
    public final float f56687i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f56688j;

    public /* synthetic */ p(m1.e eVar, boolean z10, e1.d dVar, x1.r rVar, float f10, n0 n0Var, kv.l lVar, int i10, u uVar) {
        this(eVar, z10, (i10 & 4) != 0 ? e1.d.f53469a.getCenter() : dVar, (i10 & 8) != 0 ? x1.r.f91409a.getInside() : rVar, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : n0Var, lVar);
    }

    public static boolean c(long j10) {
        if (i1.o.m4248equalsimpl0(j10, i1.o.f59366b.m4238getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM4249getHeightimpl = i1.o.m4249getHeightimpl(j10);
        return (Float.isInfinite(fM4249getHeightimpl) || Float.isNaN(fM4249getHeightimpl)) ? false : true;
    }

    public static boolean d(long j10) {
        if (i1.o.m4248equalsimpl0(j10, i1.o.f59366b.m4238getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM4252getWidthimpl = i1.o.m4252getWidthimpl(j10);
        return (Float.isInfinite(fM4252getWidthimpl) || Float.isNaN(fM4252getWidthimpl)) ? false : true;
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final boolean b() {
        return this.f56684f && this.f56683e.mo138getIntrinsicSizeNHjbRc() != i1.o.f59366b.m4238getUnspecifiedNHjbRc();
    }

    @Override // g1.i
    public void draw(l1.e eVar) {
        e0.checkNotNullParameter(eVar, "<this>");
        long jMo138getIntrinsicSizeNHjbRc = this.f56683e.mo138getIntrinsicSizeNHjbRc();
        long jSize = i1.p.Size(d(jMo138getIntrinsicSizeNHjbRc) ? i1.o.m4252getWidthimpl(jMo138getIntrinsicSizeNHjbRc) : i1.o.m4252getWidthimpl(eVar.mo5314getSizeNHjbRc()), c(jMo138getIntrinsicSizeNHjbRc) ? i1.o.m4249getHeightimpl(jMo138getIntrinsicSizeNHjbRc) : i1.o.m4249getHeightimpl(eVar.mo5314getSizeNHjbRc()));
        long jM4239getZeroNHjbRc = (i1.o.m4252getWidthimpl(eVar.mo5314getSizeNHjbRc()) == 0.0f || i1.o.m4249getHeightimpl(eVar.mo5314getSizeNHjbRc()) == 0.0f) ? i1.o.f59366b.m4239getZeroNHjbRc() : a2.m7823timesUQTWf7w(jSize, this.f56686h.mo7834computeScaleFactorH7hwNQA(jSize, eVar.mo5314getSizeNHjbRc()));
        long jMo3802alignKFBX0sM = this.f56685g.mo3802alignKFBX0sM(w.IntSize(mv.d.roundToInt(i1.o.m4252getWidthimpl(jM4239getZeroNHjbRc)), mv.d.roundToInt(i1.o.m4249getHeightimpl(jM4239getZeroNHjbRc))), w.IntSize(mv.d.roundToInt(i1.o.m4252getWidthimpl(eVar.mo5314getSizeNHjbRc())), mv.d.roundToInt(i1.o.m4249getHeightimpl(eVar.mo5314getSizeNHjbRc()))), eVar.getLayoutDirection());
        float fM6930getXimpl = s2.q.m6930getXimpl(jMo3802alignKFBX0sM);
        float fM6931getYimpl = s2.q.m6931getYimpl(jMo3802alignKFBX0sM);
        ((l1.c) ((l1.b) eVar.getDrawContext()).getTransform()).translate(fM6930getXimpl, fM6931getYimpl);
        this.f56683e.m5582drawx_KDEd0(eVar, jM4239getZeroNHjbRc, this.f56687i, this.f56688j);
        ((l1.c) ((l1.b) eVar.getDrawContext()).getTransform()).translate(-fM6930getXimpl, -fM6931getYimpl);
        eVar.drawContent();
    }

    public final long e(long j10) {
        boolean z10 = false;
        boolean z11 = s2.c.m6751getHasBoundedWidthimpl(j10) && s2.c.m6750getHasBoundedHeightimpl(j10);
        if (s2.c.m6753getHasFixedWidthimpl(j10) && s2.c.m6752getHasFixedHeightimpl(j10)) {
            z10 = true;
        }
        if ((!b() && z11) || z10) {
            return s2.c.m6747copyZbe2FdA$default(j10, s2.c.m6755getMaxWidthimpl(j10), 0, s2.c.m6754getMaxHeightimpl(j10), 0, 10, null);
        }
        m1.e eVar = this.f56683e;
        long jMo138getIntrinsicSizeNHjbRc = eVar.mo138getIntrinsicSizeNHjbRc();
        long jSize = i1.p.Size(s2.d.m6772constrainWidthK40F9xA(j10, d(jMo138getIntrinsicSizeNHjbRc) ? mv.d.roundToInt(i1.o.m4252getWidthimpl(jMo138getIntrinsicSizeNHjbRc)) : s2.c.m6757getMinWidthimpl(j10)), s2.d.m6771constrainHeightK40F9xA(j10, c(jMo138getIntrinsicSizeNHjbRc) ? mv.d.roundToInt(i1.o.m4249getHeightimpl(jMo138getIntrinsicSizeNHjbRc)) : s2.c.m6756getMinHeightimpl(j10)));
        if (b()) {
            long jSize2 = i1.p.Size(!d(eVar.mo138getIntrinsicSizeNHjbRc()) ? i1.o.m4252getWidthimpl(jSize) : i1.o.m4252getWidthimpl(eVar.mo138getIntrinsicSizeNHjbRc()), !c(eVar.mo138getIntrinsicSizeNHjbRc()) ? i1.o.m4249getHeightimpl(jSize) : i1.o.m4249getHeightimpl(eVar.mo138getIntrinsicSizeNHjbRc()));
            jSize = (i1.o.m4252getWidthimpl(jSize) == 0.0f || i1.o.m4249getHeightimpl(jSize) == 0.0f) ? i1.o.f59366b.m4239getZeroNHjbRc() : a2.m7823timesUQTWf7w(jSize2, this.f56686h.mo7834computeScaleFactorH7hwNQA(jSize2, jSize));
        }
        return s2.c.m6747copyZbe2FdA$default(j10, s2.d.m6772constrainWidthK40F9xA(j10, mv.d.roundToInt(i1.o.m4252getWidthimpl(jSize))), 0, s2.d.m6771constrainHeightK40F9xA(j10, mv.d.roundToInt(i1.o.m4249getHeightimpl(jSize))), 0, 10, null);
    }

    public boolean equals(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        return pVar != null && e0.areEqual(this.f56683e, pVar.f56683e) && this.f56684f == pVar.f56684f && e0.areEqual(this.f56685g, pVar.f56685g) && e0.areEqual(this.f56686h, pVar.f56686h) && this.f56687i == pVar.f56687i && e0.areEqual(this.f56688j, pVar.f56688j);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final e1.d getAlignment() {
        return this.f56685g;
    }

    public final float getAlpha() {
        return this.f56687i;
    }

    public final n0 getColorFilter() {
        return this.f56688j;
    }

    public final x1.r getContentScale() {
        return this.f56686h;
    }

    public final m1.e getPainter() {
        return this.f56683e;
    }

    public final boolean getSizeToIntrinsics() {
        return this.f56684f;
    }

    public int hashCode() {
        int iB = e2.b(this.f56687i, (this.f56686h.hashCode() + ((this.f56685g.hashCode() + com.google.android.gms.internal.play_billing.a.c(this.f56683e.hashCode() * 31, 31, this.f56684f)) * 31)) * 31, 31);
        n0 n0Var = this.f56688j;
        return iB + (n0Var != null ? n0Var.hashCode() : 0);
    }

    @Override // x1.o0
    public int maxIntrinsicHeight(z zVar, y measurable, int i10) {
        e0.checkNotNullParameter(zVar, "<this>");
        e0.checkNotNullParameter(measurable, "measurable");
        if (!b()) {
            return measurable.maxIntrinsicHeight(i10);
        }
        long jE = e(s2.d.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(s2.c.m6756getMinHeightimpl(jE), measurable.maxIntrinsicHeight(i10));
    }

    @Override // x1.o0
    public int maxIntrinsicWidth(z zVar, y measurable, int i10) {
        e0.checkNotNullParameter(zVar, "<this>");
        e0.checkNotNullParameter(measurable, "measurable");
        if (!b()) {
            return measurable.maxIntrinsicWidth(i10);
        }
        long jE = e(s2.d.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(s2.c.m6757getMinWidthimpl(jE), measurable.maxIntrinsicWidth(i10));
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public y0 mo74measure3p2s80s(a1 measure, w0 measurable, long j10) {
        e0.checkNotNullParameter(measure, "$this$measure");
        e0.checkNotNullParameter(measurable, "measurable");
        q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(e(j10));
        return a1.layout$default(measure, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new o(q1VarMo7826measureBRTryo0), 4, null);
    }

    @Override // x1.o0
    public int minIntrinsicHeight(z zVar, y measurable, int i10) {
        e0.checkNotNullParameter(zVar, "<this>");
        e0.checkNotNullParameter(measurable, "measurable");
        if (!b()) {
            return measurable.minIntrinsicHeight(i10);
        }
        long jE = e(s2.d.Constraints$default(0, i10, 0, 0, 13, null));
        return Math.max(s2.c.m6756getMinHeightimpl(jE), measurable.minIntrinsicHeight(i10));
    }

    @Override // x1.o0
    public int minIntrinsicWidth(z zVar, y measurable, int i10) {
        e0.checkNotNullParameter(zVar, "<this>");
        e0.checkNotNullParameter(measurable, "measurable");
        if (!b()) {
            return measurable.minIntrinsicWidth(i10);
        }
        long jE = e(s2.d.Constraints$default(0, 0, 0, i10, 7, null));
        return Math.max(s2.c.m6757getMinWidthimpl(jE), measurable.minIntrinsicWidth(i10));
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f56683e + ", sizeToIntrinsics=" + this.f56684f + ", alignment=" + this.f56685g + ", alpha=" + this.f56687i + ", colorFilter=" + this.f56688j + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m1.e painter, boolean z10, e1.d alignment, x1.r contentScale, float f10, n0 n0Var, kv.l inspectorInfo) {
        super(inspectorInfo);
        e0.checkNotNullParameter(painter, "painter");
        e0.checkNotNullParameter(alignment, "alignment");
        e0.checkNotNullParameter(contentScale, "contentScale");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56683e = painter;
        this.f56684f = z10;
        this.f56685g = alignment;
        this.f56686h = contentScale;
        this.f56687i = f10;
        this.f56688j = n0Var;
    }
}
