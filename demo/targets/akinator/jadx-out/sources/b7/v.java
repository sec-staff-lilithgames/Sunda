package b7;

import a2.t3;
import a2.w3;
import a2.x3;
import b0.e2;
import j1.n0;
import tu.x0;
import x1.a1;
import x1.a2;
import x1.o0;
import x1.q1;
import x1.w0;
import x1.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends x3 implements o0, g1.i {

    /* renamed from: e, reason: collision with root package name */
    public final m1.e f8891e;

    /* renamed from: f, reason: collision with root package name */
    public final e1.d f8892f;

    /* renamed from: g, reason: collision with root package name */
    public final x1.r f8893g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8894h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f8895i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m1.e f8896e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e1.d f8897f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x1.r f8898g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f8899h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n0 f8900i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1.e eVar, e1.d dVar, x1.r rVar, float f10, n0 n0Var) {
            super(1);
            this.f8896e = eVar;
            this.f8897f = dVar;
            this.f8898g = rVar;
            this.f8899h = f10;
            this.f8900i = n0Var;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((w3) obj);
            return x0.f87415a;
        }

        public final void invoke(w3 w3Var) {
            a.b.b(w3Var, "$this$null", "content").set("painter", this.f8896e);
            w3Var.getProperties().set("alignment", this.f8897f);
            w3Var.getProperties().set("contentScale", this.f8898g);
            w3Var.getProperties().set("alpha", Float.valueOf(this.f8899h));
            w3Var.getProperties().set("colorFilter", this.f8900i);
        }
    }

    public v(m1.e eVar, e1.d dVar, x1.r rVar, float f10, n0 n0Var) {
        m1.e eVar2;
        e1.d dVar2;
        x1.r rVar2;
        float f11;
        n0 n0Var2;
        kv.l noInspectorInfo;
        if (t3.isDebugInspectorInfoEnabled()) {
            eVar2 = eVar;
            dVar2 = dVar;
            rVar2 = rVar;
            f11 = f10;
            n0Var2 = n0Var;
            noInspectorInfo = new a(eVar2, dVar2, rVar2, f11, n0Var2);
        } else {
            eVar2 = eVar;
            dVar2 = dVar;
            rVar2 = rVar;
            f11 = f10;
            n0Var2 = n0Var;
            noInspectorInfo = t3.getNoInspectorInfo();
        }
        super(noInspectorInfo);
        this.f8891e = eVar2;
        this.f8892f = dVar2;
        this.f8893g = rVar2;
        this.f8894h = f11;
        this.f8895i = n0Var2;
    }

    public static /* synthetic */ v copy$default(v vVar, m1.e eVar, e1.d dVar, x1.r rVar, float f10, n0 n0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = vVar.f8891e;
        }
        if ((i10 & 2) != 0) {
            dVar = vVar.f8892f;
        }
        if ((i10 & 4) != 0) {
            rVar = vVar.f8893g;
        }
        if ((i10 & 8) != 0) {
            f10 = vVar.f8894h;
        }
        if ((i10 & 16) != 0) {
            n0Var = vVar.f8895i;
        }
        n0 n0Var2 = n0Var;
        x1.r rVar2 = rVar;
        return vVar.copy(eVar, dVar, rVar2, f10, n0Var2);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final long b(long j10) {
        if (i1.o.m4254isEmptyimpl(j10)) {
            return i1.o.f59366b.m4239getZeroNHjbRc();
        }
        long jMo138getIntrinsicSizeNHjbRc = this.f8891e.mo138getIntrinsicSizeNHjbRc();
        if (jMo138getIntrinsicSizeNHjbRc == i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
            return j10;
        }
        float fM4252getWidthimpl = i1.o.m4252getWidthimpl(jMo138getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(fM4252getWidthimpl) || Float.isNaN(fM4252getWidthimpl)) {
            fM4252getWidthimpl = i1.o.m4252getWidthimpl(j10);
        }
        float fM4249getHeightimpl = i1.o.m4249getHeightimpl(jMo138getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(fM4249getHeightimpl) || Float.isNaN(fM4249getHeightimpl)) {
            fM4249getHeightimpl = i1.o.m4249getHeightimpl(j10);
        }
        long jSize = i1.p.Size(fM4252getWidthimpl, fM4249getHeightimpl);
        return a2.m7823timesUQTWf7w(jSize, this.f8893g.mo7834computeScaleFactorH7hwNQA(jSize, j10));
    }

    public final long c(long j10) {
        float fM6757getMinWidthimpl;
        int iM6756getMinHeightimpl;
        float fM134constrainHeightK40F9xA;
        boolean zM6753getHasFixedWidthimpl = s2.c.m6753getHasFixedWidthimpl(j10);
        boolean zM6752getHasFixedHeightimpl = s2.c.m6752getHasFixedHeightimpl(j10);
        if (!zM6753getHasFixedWidthimpl || !zM6752getHasFixedHeightimpl) {
            boolean z10 = s2.c.m6751getHasBoundedWidthimpl(j10) && s2.c.m6750getHasBoundedHeightimpl(j10);
            long jMo138getIntrinsicSizeNHjbRc = this.f8891e.mo138getIntrinsicSizeNHjbRc();
            if (jMo138getIntrinsicSizeNHjbRc != i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
                if (z10 && (zM6753getHasFixedWidthimpl || zM6752getHasFixedHeightimpl)) {
                    fM6757getMinWidthimpl = s2.c.m6755getMaxWidthimpl(j10);
                    iM6756getMinHeightimpl = s2.c.m6754getMaxHeightimpl(j10);
                } else {
                    float fM4252getWidthimpl = i1.o.m4252getWidthimpl(jMo138getIntrinsicSizeNHjbRc);
                    float fM4249getHeightimpl = i1.o.m4249getHeightimpl(jMo138getIntrinsicSizeNHjbRc);
                    fM6757getMinWidthimpl = (Float.isInfinite(fM4252getWidthimpl) || Float.isNaN(fM4252getWidthimpl)) ? s2.c.m6757getMinWidthimpl(j10) : f0.m135constrainWidthK40F9xA(j10, fM4252getWidthimpl);
                    if (!Float.isInfinite(fM4249getHeightimpl) && !Float.isNaN(fM4249getHeightimpl)) {
                        fM134constrainHeightK40F9xA = f0.m134constrainHeightK40F9xA(j10, fM4249getHeightimpl);
                        long jB = b(i1.p.Size(fM6757getMinWidthimpl, fM134constrainHeightK40F9xA));
                        return s2.c.m6747copyZbe2FdA$default(j10, s2.d.m6772constrainWidthK40F9xA(j10, mv.d.roundToInt(i1.o.m4252getWidthimpl(jB))), 0, s2.d.m6771constrainHeightK40F9xA(j10, mv.d.roundToInt(i1.o.m4249getHeightimpl(jB))), 0, 10, null);
                    }
                    iM6756getMinHeightimpl = s2.c.m6756getMinHeightimpl(j10);
                }
                fM134constrainHeightK40F9xA = iM6756getMinHeightimpl;
                long jB2 = b(i1.p.Size(fM6757getMinWidthimpl, fM134constrainHeightK40F9xA));
                return s2.c.m6747copyZbe2FdA$default(j10, s2.d.m6772constrainWidthK40F9xA(j10, mv.d.roundToInt(i1.o.m4252getWidthimpl(jB2))), 0, s2.d.m6771constrainHeightK40F9xA(j10, mv.d.roundToInt(i1.o.m4249getHeightimpl(jB2))), 0, 10, null);
            }
            if (z10) {
                return s2.c.m6747copyZbe2FdA$default(j10, s2.c.m6755getMaxWidthimpl(j10), 0, s2.c.m6754getMaxHeightimpl(j10), 0, 10, null);
            }
        }
        return j10;
    }

    public final v copy(m1.e eVar, e1.d dVar, x1.r rVar, float f10, n0 n0Var) {
        return new v(eVar, dVar, rVar, f10, n0Var);
    }

    @Override // g1.i
    public void draw(l1.e eVar) {
        long jB = b(eVar.mo5314getSizeNHjbRc());
        long jMo3802alignKFBX0sM = this.f8892f.mo3802alignKFBX0sM(f0.m136toIntSizeuvyYCjk(jB), f0.m136toIntSizeuvyYCjk(eVar.mo5314getSizeNHjbRc()), eVar.getLayoutDirection());
        float fM6922component1impl = s2.q.m6922component1impl(jMo3802alignKFBX0sM);
        float fM6923component2impl = s2.q.m6923component2impl(jMo3802alignKFBX0sM);
        ((l1.c) ((l1.b) eVar.getDrawContext()).getTransform()).translate(fM6922component1impl, fM6923component2impl);
        this.f8891e.m5582drawx_KDEd0(eVar, jB, this.f8894h, this.f8895i);
        ((l1.c) ((l1.b) eVar.getDrawContext()).getTransform()).translate(-fM6922component1impl, -fM6923component2impl);
        eVar.drawContent();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f8891e, vVar.f8891e) && kotlin.jvm.internal.e0.areEqual(this.f8892f, vVar.f8892f) && kotlin.jvm.internal.e0.areEqual(this.f8893g, vVar.f8893g) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f8894h), (Object) Float.valueOf(vVar.f8894h)) && kotlin.jvm.internal.e0.areEqual(this.f8895i, vVar.f8895i);
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
        int iB = e2.b(this.f8894h, (this.f8893g.hashCode() + ((this.f8892f.hashCode() + (this.f8891e.hashCode() * 31)) * 31)) * 31, 31);
        n0 n0Var = this.f8895i;
        return iB + (n0Var == null ? 0 : n0Var.hashCode());
    }

    @Override // x1.o0
    public int maxIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        if (this.f8891e.mo138getIntrinsicSizeNHjbRc() == i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
            return yVar.maxIntrinsicHeight(i10);
        }
        int iMaxIntrinsicHeight = yVar.maxIntrinsicHeight(s2.c.m6755getMaxWidthimpl(c(s2.d.Constraints$default(0, i10, 0, 0, 13, null))));
        return Math.max(mv.d.roundToInt(i1.o.m4249getHeightimpl(b(i1.p.Size(i10, iMaxIntrinsicHeight)))), iMaxIntrinsicHeight);
    }

    @Override // x1.o0
    public int maxIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        if (this.f8891e.mo138getIntrinsicSizeNHjbRc() == i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
            return yVar.maxIntrinsicWidth(i10);
        }
        int iMaxIntrinsicWidth = yVar.maxIntrinsicWidth(s2.c.m6754getMaxHeightimpl(c(s2.d.Constraints$default(0, 0, 0, i10, 7, null))));
        return Math.max(mv.d.roundToInt(i1.o.m4252getWidthimpl(b(i1.p.Size(iMaxIntrinsicWidth, i10)))), iMaxIntrinsicWidth);
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public y0 mo74measure3p2s80s(a1 a1Var, w0 w0Var, long j10) {
        q1 q1VarMo7826measureBRTryo0 = w0Var.mo7826measureBRTryo0(c(j10));
        return a1.layout$default(a1Var, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new u(q1VarMo7826measureBRTryo0), 4, null);
    }

    @Override // x1.o0
    public int minIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        if (this.f8891e.mo138getIntrinsicSizeNHjbRc() == i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
            return yVar.minIntrinsicHeight(i10);
        }
        int iMinIntrinsicHeight = yVar.minIntrinsicHeight(s2.c.m6755getMaxWidthimpl(c(s2.d.Constraints$default(0, i10, 0, 0, 13, null))));
        return Math.max(mv.d.roundToInt(i1.o.m4249getHeightimpl(b(i1.p.Size(i10, iMinIntrinsicHeight)))), iMinIntrinsicHeight);
    }

    @Override // x1.o0
    public int minIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        if (this.f8891e.mo138getIntrinsicSizeNHjbRc() == i1.o.f59366b.m4238getUnspecifiedNHjbRc()) {
            return yVar.minIntrinsicWidth(i10);
        }
        int iMinIntrinsicWidth = yVar.minIntrinsicWidth(s2.c.m6754getMaxHeightimpl(c(s2.d.Constraints$default(0, 0, 0, i10, 7, null))));
        return Math.max(mv.d.roundToInt(i1.o.m4252getWidthimpl(b(i1.p.Size(iMinIntrinsicWidth, i10)))), iMinIntrinsicWidth);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.f8891e + ", alignment=" + this.f8892f + ", contentScale=" + this.f8893g + ", alpha=" + this.f8894h + ", colorFilter=" + this.f8895i + ')';
    }
}
