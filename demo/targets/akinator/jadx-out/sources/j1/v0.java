package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface v0 extends s2.e {
    float getAlpha();

    /* renamed from: getAmbientShadowColor-0d7_KjU */
    default long mo4661getAmbientShadowColor0d7_KjU() {
        return w0.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    @Override // s2.e
    /* synthetic */ float getDensity();

    @Override // s2.e
    /* synthetic */ float getFontScale();

    default z1 getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    f2 getShape();

    /* renamed from: getSpotShadowColor-0d7_KjU */
    default long mo4662getSpotShadowColor0d7_KjU() {
        return w0.getDefaultShadowColor();
    }

    /* renamed from: getTransformOrigin-SzJe1aQ */
    long mo4663getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

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

    void setAlpha(float f10);

    void setCameraDistance(float f10);

    void setClip(boolean z10);

    void setRotationX(float f10);

    void setRotationY(float f10);

    void setRotationZ(float f10);

    void setScaleX(float f10);

    void setScaleY(float f10);

    void setShadowElevation(float f10);

    void setShape(f2 f2Var);

    /* renamed from: setTransformOrigin-__ExYCQ */
    void mo4666setTransformOrigin__ExYCQ(long j10);

    void setTranslationX(float f10);

    void setTranslationY(float f10);

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

    /* renamed from: setAmbientShadowColor-8_81llA */
    default void mo4664setAmbientShadowColor8_81llA(long j10) {
    }

    default void setRenderEffect(z1 z1Var) {
    }

    /* renamed from: setSpotShadowColor-8_81llA */
    default void mo4665setSpotShadowColor8_81llA(long j10) {
    }
}
