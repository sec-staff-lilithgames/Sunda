package b7;

import android.os.SystemClock;
import j1.n0;
import p0.j2;
import p0.o5;
import x1.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends m1.e {

    /* renamed from: h, reason: collision with root package name */
    public m1.e f8901h;

    /* renamed from: i, reason: collision with root package name */
    public final m1.e f8902i;

    /* renamed from: j, reason: collision with root package name */
    public final x1.r f8903j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8904k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8905l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8906m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8909p;

    /* renamed from: n, reason: collision with root package name */
    public final j2 f8907n = o5.mutableStateOf$default(0, null, 2, null);

    /* renamed from: o, reason: collision with root package name */
    public long f8908o = -1;

    /* renamed from: q, reason: collision with root package name */
    public final j2 f8910q = o5.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* renamed from: r, reason: collision with root package name */
    public final j2 f8911r = o5.mutableStateOf$default(null, null, 2, null);

    public w(m1.e eVar, m1.e eVar2, x1.r rVar, int i10, boolean z10, boolean z11) {
        this.f8901h = eVar;
        this.f8902i = eVar2;
        this.f8903j = rVar;
        this.f8904k = i10;
        this.f8905l = z10;
        this.f8906m = z11;
    }

    @Override // m1.e
    public final boolean a(float f10) {
        this.f8910q.setValue(Float.valueOf(f10));
        return true;
    }

    @Override // m1.e
    public final boolean b(n0 n0Var) {
        this.f8911r.setValue(n0Var);
        return true;
    }

    @Override // m1.e
    public final void d(l1.i iVar) {
        boolean z10 = this.f8909p;
        j2 j2Var = this.f8910q;
        m1.e eVar = this.f8902i;
        if (z10) {
            e(iVar, eVar, ((Number) j2Var.getValue()).floatValue());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f8908o == -1) {
            this.f8908o = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.f8908o) / this.f8904k;
        float fFloatValue = ((Number) j2Var.getValue()).floatValue() * qv.v.coerceIn(f10, 0.0f, 1.0f);
        float fFloatValue2 = this.f8905l ? ((Number) j2Var.getValue()).floatValue() - fFloatValue : ((Number) j2Var.getValue()).floatValue();
        this.f8909p = f10 >= 1.0f;
        e(iVar, this.f8901h, fFloatValue2);
        e(iVar, eVar, fFloatValue);
        if (this.f8909p) {
            this.f8901h = null;
        } else {
            j2 j2Var2 = this.f8907n;
            j2Var2.setValue(Integer.valueOf(((Number) j2Var2.getValue()).intValue() + 1));
        }
    }

    public final void e(l1.i iVar, m1.e eVar, float f10) {
        if (eVar == null || f10 <= 0.0f) {
            return;
        }
        long jMo5314getSizeNHjbRc = iVar.mo5314getSizeNHjbRc();
        long jMo138getIntrinsicSizeNHjbRc = eVar.mo138getIntrinsicSizeNHjbRc();
        i1.n nVar = i1.o.f59366b;
        long jM7823timesUQTWf7w = (jMo138getIntrinsicSizeNHjbRc == nVar.m4238getUnspecifiedNHjbRc() || i1.o.m4254isEmptyimpl(jMo138getIntrinsicSizeNHjbRc) || jMo5314getSizeNHjbRc == nVar.m4238getUnspecifiedNHjbRc() || i1.o.m4254isEmptyimpl(jMo5314getSizeNHjbRc)) ? jMo5314getSizeNHjbRc : a2.m7823timesUQTWf7w(jMo138getIntrinsicSizeNHjbRc, this.f8903j.mo7834computeScaleFactorH7hwNQA(jMo138getIntrinsicSizeNHjbRc, jMo5314getSizeNHjbRc));
        long jM4238getUnspecifiedNHjbRc = nVar.m4238getUnspecifiedNHjbRc();
        j2 j2Var = this.f8911r;
        if (jMo5314getSizeNHjbRc == jM4238getUnspecifiedNHjbRc || i1.o.m4254isEmptyimpl(jMo5314getSizeNHjbRc)) {
            eVar.m5582drawx_KDEd0(iVar, jM7823timesUQTWf7w, f10, (n0) j2Var.getValue());
            return;
        }
        float f11 = 2;
        float fM4252getWidthimpl = (i1.o.m4252getWidthimpl(jMo5314getSizeNHjbRc) - i1.o.m4252getWidthimpl(jM7823timesUQTWf7w)) / f11;
        float fM4249getHeightimpl = (i1.o.m4249getHeightimpl(jMo5314getSizeNHjbRc) - i1.o.m4249getHeightimpl(jM7823timesUQTWf7w)) / f11;
        ((l1.c) ((l1.b) iVar.getDrawContext()).getTransform()).inset(fM4252getWidthimpl, fM4249getHeightimpl, fM4252getWidthimpl, fM4249getHeightimpl);
        eVar.m5582drawx_KDEd0(iVar, jM7823timesUQTWf7w, f10, (n0) j2Var.getValue());
        l1.k transform = ((l1.b) iVar.getDrawContext()).getTransform();
        float f12 = -fM4252getWidthimpl;
        float f13 = -fM4249getHeightimpl;
        ((l1.c) transform).inset(f12, f13, f12, f13);
    }

    @Override // m1.e
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo138getIntrinsicSizeNHjbRc() {
        m1.e eVar = this.f8901h;
        long jMo138getIntrinsicSizeNHjbRc = eVar != null ? eVar.mo138getIntrinsicSizeNHjbRc() : i1.o.f59366b.m4239getZeroNHjbRc();
        m1.e eVar2 = this.f8902i;
        long jMo138getIntrinsicSizeNHjbRc2 = eVar2 != null ? eVar2.mo138getIntrinsicSizeNHjbRc() : i1.o.f59366b.m4239getZeroNHjbRc();
        i1.n nVar = i1.o.f59366b;
        boolean z10 = jMo138getIntrinsicSizeNHjbRc != nVar.m4238getUnspecifiedNHjbRc();
        boolean z11 = jMo138getIntrinsicSizeNHjbRc2 != nVar.m4238getUnspecifiedNHjbRc();
        if (z10 && z11) {
            return i1.p.Size(Math.max(i1.o.m4252getWidthimpl(jMo138getIntrinsicSizeNHjbRc), i1.o.m4252getWidthimpl(jMo138getIntrinsicSizeNHjbRc2)), Math.max(i1.o.m4249getHeightimpl(jMo138getIntrinsicSizeNHjbRc), i1.o.m4249getHeightimpl(jMo138getIntrinsicSizeNHjbRc2)));
        }
        if (this.f8906m) {
            if (z10) {
                return jMo138getIntrinsicSizeNHjbRc;
            }
            if (z11) {
                return jMo138getIntrinsicSizeNHjbRc2;
            }
        }
        return nVar.m4238getUnspecifiedNHjbRc();
    }
}
