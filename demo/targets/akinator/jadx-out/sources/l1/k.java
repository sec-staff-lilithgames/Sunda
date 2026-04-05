package l1;

import i1.o;
import j1.k0;
import j1.l1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface k {
    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m5415clipPathmtrdDE$default(k kVar, l1 l1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = k0.f68900b.m4778getIntersectrtfAjoo();
        }
        ((c) kVar).mo5322clipPathmtrdDE(l1Var, i10);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m5416clipRectN_I0leg$default(k kVar, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = o.m4252getWidthimpl(((c) kVar).mo5325getSizeNHjbRc());
        }
        if ((i11 & 8) != 0) {
            f13 = o.m4249getHeightimpl(((c) kVar).mo5325getSizeNHjbRc());
        }
        if ((i11 & 16) != 0) {
            i10 = k0.f68900b.m4778getIntersectrtfAjoo();
        }
        ((c) kVar).mo5323clipRectN_I0leg(f10, f11, f12, f13, i10);
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m5417rotateUv8p0NA$default(k kVar, float f10, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = ((c) kVar).mo5324getCenterF1C5BW0();
        }
        ((c) kVar).mo5326rotateUv8p0NA(f10, j10);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m5418scale0AR0LA0$default(k kVar, float f10, float f11, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i10 & 4) != 0) {
            j10 = ((c) kVar).mo5324getCenterF1C5BW0();
        }
        ((c) kVar).mo5327scale0AR0LA0(f10, f11, j10);
    }

    static /* synthetic */ void translate$default(k kVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        ((c) kVar).translate(f10, f11);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo5322clipPathmtrdDE(l1 l1Var, int i10);

    /* renamed from: clipRect-N_I0leg */
    void mo5323clipRectN_I0leg(float f10, float f11, float f12, float f13, int i10);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo5324getCenterF1C5BW0() {
        c cVar = (c) this;
        float f10 = 2;
        return i1.i.Offset(o.m4252getWidthimpl(cVar.mo5325getSizeNHjbRc()) / f10, o.m4249getHeightimpl(cVar.mo5325getSizeNHjbRc()) / f10);
    }

    /* renamed from: getSize-NH-jbRc */
    long mo5325getSizeNHjbRc();

    void inset(float f10, float f11, float f12, float f13);

    /* renamed from: rotate-Uv8p0NA */
    void mo5326rotateUv8p0NA(float f10, long j10);

    /* renamed from: scale-0AR0LA0 */
    void mo5327scale0AR0LA0(float f10, float f11, long j10);

    /* renamed from: transform-58bKbWc */
    void mo5328transform58bKbWc(float[] fArr);

    void translate(float f10, float f11);
}
