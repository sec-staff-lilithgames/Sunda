package b0;

import c0.z1;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 extends h2 {

    /* renamed from: b, reason: collision with root package name */
    public final z1.a f8340b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.a f8341c;

    /* renamed from: e, reason: collision with root package name */
    public final v5 f8342e;

    /* renamed from: f, reason: collision with root package name */
    public final v5 f8343f;

    /* renamed from: g, reason: collision with root package name */
    public final v5 f8344g;

    /* renamed from: h, reason: collision with root package name */
    public e1.d f8345h;

    /* renamed from: i, reason: collision with root package name */
    public final b2 f8346i;

    public c2(c0.z1.a sizeAnimation, c0.z1.a offsetAnimation, v5 expand, v5 shrink, v5 alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        kotlin.jvm.internal.e0.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        kotlin.jvm.internal.e0.checkNotNullParameter(expand, "expand");
        kotlin.jvm.internal.e0.checkNotNullParameter(shrink, "shrink");
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        this.f8340b = sizeAnimation;
        this.f8341c = offsetAnimation;
        this.f8342e = expand;
        this.f8343f = shrink;
        this.f8344g = alignment;
        this.f8346i = new b2(this);
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

    public final v5 getAlignment() {
        return this.f8344g;
    }

    public final e1.d getCurrentAlignment() {
        return this.f8345h;
    }

    public final v5 getExpand() {
        return this.f8342e;
    }

    public final c0.z1.a getOffsetAnimation() {
        return this.f8341c;
    }

    public final v5 getShrink() {
        return this.f8343f;
    }

    public final c0.z1.a getSizeAnimation() {
        return this.f8340b;
    }

    public final kv.l getSizeTransitionSpec() {
        return this.f8346i;
    }

    @Override // b0.h2, x1.o0
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public x1.y0 mo74measure3p2s80s(x1.a1 measure, x1.w0 measurable, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurable, "measurable");
        x1.q1 q1VarMo7826measureBRTryo0 = measurable.mo7826measureBRTryo0(j10);
        long jIntSize = s2.w.IntSize(q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight());
        long jM6976unboximpl = ((s2.v) this.f8340b.animate(this.f8346i, new y1(this, jIntSize)).getValue()).m6976unboximpl();
        long jM6939unboximpl = ((s2.q) this.f8341c.animate(z1.f8569e, new a2(this, jIntSize)).getValue()).m6939unboximpl();
        e1.d dVar = this.f8345h;
        return x1.a1.layout$default(measure, s2.v.m6972getWidthimpl(jM6976unboximpl), s2.v.m6971getHeightimpl(jM6976unboximpl), null, new x1(q1VarMo7826measureBRTryo0, dVar != null ? dVar.mo3802alignKFBX0sM(jIntSize, jM6976unboximpl, s2.x.f85363b) : s2.q.f85352b.m6920getZeronOccac(), jM6939unboximpl), 4, null);
    }

    public final void setCurrentAlignment(e1.d dVar) {
        this.f8345h = dVar;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m75sizeByStateUzc_VyU(r0 targetState, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(targetState, "targetState");
        i0 i0Var = (i0) this.f8342e.getValue();
        long jM6976unboximpl = i0Var != null ? ((s2.v) i0Var.getSize().invoke(s2.v.m6964boximpl(j10))).m6976unboximpl() : j10;
        i0 i0Var2 = (i0) this.f8343f.getValue();
        long jM6976unboximpl2 = i0Var2 != null ? ((s2.v) i0Var2.getSize().invoke(s2.v.m6964boximpl(j10))).m6976unboximpl() : j10;
        int iOrdinal = targetState.ordinal();
        if (iOrdinal == 0) {
            return jM6976unboximpl;
        }
        if (iOrdinal == 1) {
            return j10;
        }
        if (iOrdinal == 2) {
            return jM6976unboximpl2;
        }
        throw new tu.t();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m76targetOffsetByStateoFUgxo0(r0 targetState, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(targetState, "targetState");
        if (this.f8345h == null) {
            return s2.q.f85352b.m6920getZeronOccac();
        }
        v5 v5Var = this.f8344g;
        if (v5Var.getValue() == null) {
            return s2.q.f85352b.m6920getZeronOccac();
        }
        if (kotlin.jvm.internal.e0.areEqual(this.f8345h, v5Var.getValue())) {
            return s2.q.f85352b.m6920getZeronOccac();
        }
        int iOrdinal = targetState.ordinal();
        if (iOrdinal == 0) {
            return s2.q.f85352b.m6920getZeronOccac();
        }
        if (iOrdinal == 1) {
            return s2.q.f85352b.m6920getZeronOccac();
        }
        if (iOrdinal != 2) {
            throw new tu.t();
        }
        i0 i0Var = (i0) this.f8343f.getValue();
        if (i0Var == null) {
            return s2.q.f85352b.m6920getZeronOccac();
        }
        long jM6976unboximpl = ((s2.v) i0Var.getSize().invoke(s2.v.m6964boximpl(j10))).m6976unboximpl();
        Object value = v5Var.getValue();
        kotlin.jvm.internal.e0.checkNotNull(value);
        s2.x xVar = s2.x.f85363b;
        long jMo3802alignKFBX0sM = ((e1.d) value).mo3802alignKFBX0sM(j10, jM6976unboximpl, xVar);
        e1.d dVar = this.f8345h;
        kotlin.jvm.internal.e0.checkNotNull(dVar);
        long jMo3802alignKFBX0sM2 = dVar.mo3802alignKFBX0sM(j10, jM6976unboximpl, xVar);
        return s2.r.IntOffset(s2.q.m6930getXimpl(jMo3802alignKFBX0sM) - s2.q.m6930getXimpl(jMo3802alignKFBX0sM2), s2.q.m6931getYimpl(jMo3802alignKFBX0sM) - s2.q.m6931getYimpl(jMo3802alignKFBX0sM2));
    }

    @Override // b0.h2, x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
