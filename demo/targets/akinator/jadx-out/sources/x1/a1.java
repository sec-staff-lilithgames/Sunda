package x1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface a1 extends z {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ y0 layout$default(a1 a1Var, int i10, int i11, Map map, kv.l lVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = uu.p1.emptyMap();
        }
        return a1Var.layout(i10, i11, map, lVar);
    }

    @Override // x1.z, s2.e
    /* synthetic */ float getDensity();

    @Override // x1.z, s2.e
    /* synthetic */ float getFontScale();

    @Override // x1.z
    /* synthetic */ s2.x getLayoutDirection();

    default y0 layout(int i10, int i11, Map<a, Integer> alignmentLines, kv.l placementBlock) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLines, "alignmentLines");
        kotlin.jvm.internal.e0.checkNotNullParameter(placementBlock, "placementBlock");
        return new z0(this, i10, i11, alignmentLines, placementBlock);
    }

    @Override // x1.z, s2.e
    /* renamed from: roundToPx--R2X_6o */
    /* bridge */ /* synthetic */ default int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // x1.z, s2.e
    /* renamed from: roundToPx-0680j_4 */
    /* bridge */ /* synthetic */ default int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toDp-GaN1DYA */
    /* bridge */ /* synthetic */ default float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    /* bridge */ /* synthetic */ default long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toPx--R2X_6o */
    /* bridge */ /* synthetic */ default float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toPx-0680j_4 */
    /* bridge */ /* synthetic */ default float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // x1.z, s2.e
    /* bridge */ /* synthetic */ default i1.j toRect(s2.m mVar) {
        return super.toRect(mVar);
    }

    @Override // x1.z, s2.e
    /* renamed from: toSize-XkaWNTQ */
    /* bridge */ /* synthetic */ default long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toSp-0xMU5do */
    /* bridge */ /* synthetic */ default long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // x1.z, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }
}
