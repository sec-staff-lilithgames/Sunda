package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    public final float f85333b;

    /* renamed from: c, reason: collision with root package name */
    public final float f85334c;

    public f(float f10, float f11) {
        this.f85333b = f10;
        this.f85334c = f11;
    }

    public static /* synthetic */ f copy$default(f fVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = fVar.getDensity();
        }
        if ((i10 & 2) != 0) {
            f11 = fVar.getFontScale();
        }
        return fVar.copy(f10, f11);
    }

    public final float component1() {
        return getDensity();
    }

    public final float component2() {
        return getFontScale();
    }

    public final f copy(float f10, float f11) {
        return new f(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(getDensity()), (Object) Float.valueOf(fVar.getDensity())) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(getFontScale()), (Object) Float.valueOf(fVar.getFontScale()));
    }

    @Override // s2.e
    public float getDensity() {
        return this.f85333b;
    }

    @Override // s2.e
    public float getFontScale() {
        return this.f85334c;
    }

    public int hashCode() {
        return Float.hashCode(getFontScale()) + (Float.hashCode(getDensity()) * 31);
    }

    @Override // s2.e
    /* renamed from: roundToPx--R2X_6o */
    public /* bridge */ /* synthetic */ int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: roundToPx-0680j_4 */
    public /* bridge */ /* synthetic */ int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    @Override // s2.e
    /* renamed from: toDp-GaN1DYA */
    public /* bridge */ /* synthetic */ float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public /* bridge */ /* synthetic */ long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // s2.e
    /* renamed from: toPx--R2X_6o */
    public /* bridge */ /* synthetic */ float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // s2.e
    /* renamed from: toPx-0680j_4 */
    public /* bridge */ /* synthetic */ float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // s2.e
    public /* bridge */ /* synthetic */ i1.j toRect(m mVar) {
        return super.toRect(mVar);
    }

    @Override // s2.e
    /* renamed from: toSize-XkaWNTQ */
    public /* bridge */ /* synthetic */ long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // s2.e
    /* renamed from: toSp-0xMU5do */
    public /* bridge */ /* synthetic */ long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + getFontScale() + ')';
    }

    @Override // s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }
}
