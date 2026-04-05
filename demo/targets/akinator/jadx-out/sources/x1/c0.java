package x1;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 implements a1, s2.e {

    /* renamed from: b, reason: collision with root package name */
    public final s2.x f91336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2.e f91337c;

    public c0(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f91336b = layoutDirection;
        this.f91337c = density;
    }

    @Override // x1.a1, x1.z, s2.e
    public float getDensity() {
        return this.f91337c.getDensity();
    }

    @Override // x1.a1, x1.z, s2.e
    public float getFontScale() {
        return this.f91337c.getFontScale();
    }

    @Override // x1.a1, x1.z
    public s2.x getLayoutDirection() {
        return this.f91336b;
    }

    @Override // x1.a1
    public /* bridge */ /* synthetic */ y0 layout(int i10, int i11, Map map, kv.l lVar) {
        return super.layout(i10, i11, map, lVar);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: roundToPx--R2X_6o */
    public int mo3418roundToPxR2X_6o(long j10) {
        return this.f91337c.mo3418roundToPxR2X_6o(j10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: roundToPx-0680j_4 */
    public int mo3419roundToPx0680j_4(float f10) {
        return this.f91337c.mo3419roundToPx0680j_4(f10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toDp-GaN1DYA */
    public float mo3420toDpGaN1DYA(long j10) {
        return this.f91337c.mo3420toDpGaN1DYA(j10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3421toDpu2uoSUM(float f10) {
        return this.f91337c.mo3421toDpu2uoSUM(f10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public long mo3423toDpSizekrfVVM(long j10) {
        return this.f91337c.mo3423toDpSizekrfVVM(j10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toPx--R2X_6o */
    public float mo3424toPxR2X_6o(long j10) {
        return this.f91337c.mo3424toPxR2X_6o(j10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toPx-0680j_4 */
    public float mo3425toPx0680j_4(float f10) {
        return this.f91337c.mo3425toPx0680j_4(f10);
    }

    @Override // x1.a1, x1.z, s2.e
    public i1.j toRect(s2.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return this.f91337c.toRect(mVar);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toSize-XkaWNTQ */
    public long mo3426toSizeXkaWNTQ(long j10) {
        return this.f91337c.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toSp-0xMU5do */
    public long mo3427toSp0xMU5do(float f10) {
        return this.f91337c.mo3427toSp0xMU5do(f10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3428toSpkPz2Gy4(float f10) {
        return this.f91337c.mo3428toSpkPz2Gy4(f10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3422toDpu2uoSUM(int i10) {
        return this.f91337c.mo3422toDpu2uoSUM(i10);
    }

    @Override // x1.a1, x1.z, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3429toSpkPz2Gy4(int i10) {
        return this.f91337c.mo3429toSpkPz2Gy4(i10);
    }
}
