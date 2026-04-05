package b0;

import c0.z1;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q2 extends h2 {

    /* renamed from: b, reason: collision with root package name */
    public final z1.a f8481b;

    /* renamed from: c, reason: collision with root package name */
    public final v5 f8482c;

    /* renamed from: e, reason: collision with root package name */
    public final v5 f8483e;

    /* renamed from: f, reason: collision with root package name */
    public final p2 f8484f;

    public q2(c0.z1.a lazyAnimation, v5 slideIn, v5 slideOut) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lazyAnimation, "lazyAnimation");
        kotlin.jvm.internal.e0.checkNotNullParameter(slideIn, "slideIn");
        kotlin.jvm.internal.e0.checkNotNullParameter(slideOut, "slideOut");
        this.f8481b = lazyAnimation;
        this.f8482c = slideIn;
        this.f8483e = slideOut;
        this.f8484f = new p2(this);
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final c0.z1.a getLazyAnimation() {
        return this.f8481b;
    }

    public final v5 getSlideIn() {
        return this.f8482c;
    }

    public final v5 getSlideOut() {
        return this.f8483e;
    }

    public final kv.l getTransitionSpec() {
        return this.f8484f;
    }

    @Override // b0.h2, x1.o0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(j10);
        return x1.a1.layout$default(measure, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new o2(this, q1VarMo7826measureBRTryo0, s2.w.IntSize(q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight())), 4, null);
    }

    /* renamed from: targetValueByState-oFUgxo0, reason: not valid java name */
    public final long m98targetValueByStateoFUgxo0(r0 targetState, long j10) {
        kv.l slideOffset;
        kv.l slideOffset2;
        kotlin.jvm.internal.e0.checkNotNullParameter(targetState, "targetState");
        m2 m2Var = (m2) this.f8482c.getValue();
        long jM6920getZeronOccac = (m2Var == null || (slideOffset2 = m2Var.getSlideOffset()) == null) ? s2.q.f85352b.m6920getZeronOccac() : ((s2.q) slideOffset2.invoke(s2.v.m6964boximpl(j10))).m6939unboximpl();
        m2 m2Var2 = (m2) this.f8483e.getValue();
        long jM6920getZeronOccac2 = (m2Var2 == null || (slideOffset = m2Var2.getSlideOffset()) == null) ? s2.q.f85352b.m6920getZeronOccac() : ((s2.q) slideOffset.invoke(s2.v.m6964boximpl(j10))).m6939unboximpl();
        int iOrdinal = targetState.ordinal();
        if (iOrdinal == 0) {
            return jM6920getZeronOccac;
        }
        if (iOrdinal == 1) {
            return s2.q.f85352b.m6920getZeronOccac();
        }
        if (iOrdinal == 2) {
            return jM6920getZeronOccac2;
        }
        throw new tu.t();
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
