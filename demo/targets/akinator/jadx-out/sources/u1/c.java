package u1;

import a2.g5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface c extends s2.e {
    static /* synthetic */ Object awaitPointerEvent$default(c cVar, o oVar, zu.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            oVar = o.f87647c;
        }
        return cVar.awaitPointerEvent(oVar, dVar);
    }

    static /* synthetic */ Object withTimeout$suspendImpl(c cVar, long j10, kv.p pVar, zu.d dVar) {
        return pVar.invoke(cVar, dVar);
    }

    static /* synthetic */ Object withTimeoutOrNull$suspendImpl(c cVar, long j10, kv.p pVar, zu.d dVar) {
        return pVar.invoke(cVar, dVar);
    }

    Object awaitPointerEvent(o oVar, zu.d<? super m> dVar);

    m getCurrentEvent();

    @Override // s2.e
    /* synthetic */ float getDensity();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo7284getExtendedTouchPaddingNHjbRc() {
        return i1.o.f59366b.m4239getZeroNHjbRc();
    }

    @Override // s2.e
    /* synthetic */ float getFontScale();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo7285getSizeYbymL2g();

    g5 getViewConfiguration();

    @Override // s2.e
    /* renamed from: roundToPx--R2X_6o */
    /* bridge */ /* synthetic */ default int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: roundToPx-0680j_4 */
    /* bridge */ /* synthetic */ default int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    @Override // s2.e
    /* renamed from: toDp-GaN1DYA */
    /* bridge */ /* synthetic */ default float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // s2.e
    /* renamed from: toDpSize-k-rfVVM */
    /* bridge */ /* synthetic */ default long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // s2.e
    /* renamed from: toPx--R2X_6o */
    /* bridge */ /* synthetic */ default float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: toPx-0680j_4 */
    /* bridge */ /* synthetic */ default float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // s2.e
    /* bridge */ /* synthetic */ default i1.j toRect(s2.m mVar) {
        return super.toRect(mVar);
    }

    @Override // s2.e
    /* renamed from: toSize-XkaWNTQ */
    /* bridge */ /* synthetic */ default long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // s2.e
    /* renamed from: toSp-0xMU5do */
    /* bridge */ /* synthetic */ default long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    default <T> Object withTimeout(long j10, kv.p pVar, zu.d<? super T> dVar) {
        return withTimeout$suspendImpl(this, j10, pVar, dVar);
    }

    default <T> Object withTimeoutOrNull(long j10, kv.p pVar, zu.d<? super T> dVar) {
        return withTimeoutOrNull$suspendImpl(this, j10, pVar, dVar);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }
}
