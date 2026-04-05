package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 implements v0 {

    /* renamed from: f, reason: collision with root package name */
    public float f68829f;

    /* renamed from: g, reason: collision with root package name */
    public float f68830g;

    /* renamed from: h, reason: collision with root package name */
    public float f68831h;

    /* renamed from: k, reason: collision with root package name */
    public float f68834k;

    /* renamed from: l, reason: collision with root package name */
    public float f68835l;

    /* renamed from: m, reason: collision with root package name */
    public float f68836m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f68840q;

    /* renamed from: s, reason: collision with root package name */
    public z1 f68842s;

    /* renamed from: b, reason: collision with root package name */
    public float f68826b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f68827c = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f68828e = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public long f68832i = w0.getDefaultShadowColor();

    /* renamed from: j, reason: collision with root package name */
    public long f68833j = w0.getDefaultShadowColor();

    /* renamed from: n, reason: collision with root package name */
    public float f68837n = 8.0f;

    /* renamed from: o, reason: collision with root package name */
    public long f68838o = u2.f69011b.m4991getCenterSzJe1aQ();

    /* renamed from: p, reason: collision with root package name */
    public f2 f68839p = y1.getRectangleShape();

    /* renamed from: r, reason: collision with root package name */
    public s2.e f68841r = s2.g.Density$default(1.0f, 0.0f, 2, null);

    @Override // j1.v0
    public float getAlpha() {
        return this.f68828e;
    }

    @Override // j1.v0
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public long mo4661getAmbientShadowColor0d7_KjU() {
        return this.f68832i;
    }

    @Override // j1.v0
    public float getCameraDistance() {
        return this.f68837n;
    }

    @Override // j1.v0
    public boolean getClip() {
        return this.f68840q;
    }

    @Override // j1.v0, s2.e
    public float getDensity() {
        return this.f68841r.getDensity();
    }

    @Override // j1.v0, s2.e
    public float getFontScale() {
        return this.f68841r.getFontScale();
    }

    public final s2.e getGraphicsDensity$ui_release() {
        return this.f68841r;
    }

    @Override // j1.v0
    public z1 getRenderEffect() {
        return this.f68842s;
    }

    @Override // j1.v0
    public float getRotationX() {
        return this.f68834k;
    }

    @Override // j1.v0
    public float getRotationY() {
        return this.f68835l;
    }

    @Override // j1.v0
    public float getRotationZ() {
        return this.f68836m;
    }

    @Override // j1.v0
    public float getScaleX() {
        return this.f68826b;
    }

    @Override // j1.v0
    public float getScaleY() {
        return this.f68827c;
    }

    @Override // j1.v0
    public float getShadowElevation() {
        return this.f68831h;
    }

    @Override // j1.v0
    public f2 getShape() {
        return this.f68839p;
    }

    @Override // j1.v0
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public long mo4662getSpotShadowColor0d7_KjU() {
        return this.f68833j;
    }

    @Override // j1.v0
    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public long mo4663getTransformOriginSzJe1aQ() {
        return this.f68838o;
    }

    @Override // j1.v0
    public float getTranslationX() {
        return this.f68829f;
    }

    @Override // j1.v0
    public float getTranslationY() {
        return this.f68830g;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo4664setAmbientShadowColor8_81llA(w0.getDefaultShadowColor());
        mo4665setSpotShadowColor8_81llA(w0.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo4666setTransformOrigin__ExYCQ(u2.f69011b.m4991getCenterSzJe1aQ());
        setShape(y1.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
    }

    @Override // j1.v0, s2.e
    /* renamed from: roundToPx--R2X_6o */
    public /* bridge */ /* synthetic */ int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: roundToPx-0680j_4 */
    public /* bridge */ /* synthetic */ int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    @Override // j1.v0
    public void setAlpha(float f10) {
        this.f68828e = f10;
    }

    @Override // j1.v0
    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public void mo4664setAmbientShadowColor8_81llA(long j10) {
        this.f68832i = j10;
    }

    @Override // j1.v0
    public void setCameraDistance(float f10) {
        this.f68837n = f10;
    }

    @Override // j1.v0
    public void setClip(boolean z10) {
        this.f68840q = z10;
    }

    public final void setGraphicsDensity$ui_release(s2.e eVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<set-?>");
        this.f68841r = eVar;
    }

    @Override // j1.v0
    public void setRenderEffect(z1 z1Var) {
        this.f68842s = z1Var;
    }

    @Override // j1.v0
    public void setRotationX(float f10) {
        this.f68834k = f10;
    }

    @Override // j1.v0
    public void setRotationY(float f10) {
        this.f68835l = f10;
    }

    @Override // j1.v0
    public void setRotationZ(float f10) {
        this.f68836m = f10;
    }

    @Override // j1.v0
    public void setScaleX(float f10) {
        this.f68826b = f10;
    }

    @Override // j1.v0
    public void setScaleY(float f10) {
        this.f68827c = f10;
    }

    @Override // j1.v0
    public void setShadowElevation(float f10) {
        this.f68831h = f10;
    }

    @Override // j1.v0
    public void setShape(f2 f2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(f2Var, "<set-?>");
        this.f68839p = f2Var;
    }

    @Override // j1.v0
    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public void mo4665setSpotShadowColor8_81llA(long j10) {
        this.f68833j = j10;
    }

    @Override // j1.v0
    /* renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    public void mo4666setTransformOrigin__ExYCQ(long j10) {
        this.f68838o = j10;
    }

    @Override // j1.v0
    public void setTranslationX(float f10) {
        this.f68829f = f10;
    }

    @Override // j1.v0
    public void setTranslationY(float f10) {
        this.f68830g = f10;
    }

    @Override // j1.v0, s2.e
    /* renamed from: toDp-GaN1DYA */
    public /* bridge */ /* synthetic */ float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public /* bridge */ /* synthetic */ long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toPx--R2X_6o */
    public /* bridge */ /* synthetic */ float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toPx-0680j_4 */
    public /* bridge */ /* synthetic */ float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // j1.v0, s2.e
    public /* bridge */ /* synthetic */ i1.j toRect(s2.m mVar) {
        return super.toRect(mVar);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toSize-XkaWNTQ */
    public /* bridge */ /* synthetic */ long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toSp-0xMU5do */
    public /* bridge */ /* synthetic */ long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // j1.v0, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }
}
