package j1;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f68876a = k.makeNativePaint();

    /* renamed from: b, reason: collision with root package name */
    public int f68877b = x.f69020b.m5062getSrcOver0nO6VwU();

    /* renamed from: c, reason: collision with root package name */
    public Shader f68878c;

    /* renamed from: d, reason: collision with root package name */
    public n0 f68879d;

    /* renamed from: e, reason: collision with root package name */
    public m1 f68880e;

    @Override // j1.i1
    public Paint asFrameworkPaint() {
        return this.f68876a;
    }

    @Override // j1.i1
    public float getAlpha() {
        return k.getNativeAlpha(this.f68876a);
    }

    @Override // j1.i1
    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public int mo4765getBlendMode0nO6VwU() {
        return this.f68877b;
    }

    @Override // j1.i1
    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public long mo4766getColor0d7_KjU() {
        return k.getNativeColor(this.f68876a);
    }

    @Override // j1.i1
    public n0 getColorFilter() {
        return this.f68879d;
    }

    @Override // j1.i1
    /* renamed from: getFilterQuality-f-v9h1I, reason: not valid java name */
    public int mo4767getFilterQualityfv9h1I() {
        return k.getNativeFilterQuality(this.f68876a);
    }

    @Override // j1.i1
    public m1 getPathEffect() {
        return this.f68880e;
    }

    @Override // j1.i1
    public Shader getShader() {
        return this.f68878c;
    }

    @Override // j1.i1
    /* renamed from: getStrokeCap-KaPHkGw, reason: not valid java name */
    public int mo4768getStrokeCapKaPHkGw() {
        return k.getNativeStrokeCap(this.f68876a);
    }

    @Override // j1.i1
    /* renamed from: getStrokeJoin-LxFBmk8, reason: not valid java name */
    public int mo4769getStrokeJoinLxFBmk8() {
        return k.getNativeStrokeJoin(this.f68876a);
    }

    @Override // j1.i1
    public float getStrokeMiterLimit() {
        return k.getNativeStrokeMiterLimit(this.f68876a);
    }

    @Override // j1.i1
    public float getStrokeWidth() {
        return k.getNativeStrokeWidth(this.f68876a);
    }

    @Override // j1.i1
    /* renamed from: getStyle-TiuSbCo, reason: not valid java name */
    public int mo4770getStyleTiuSbCo() {
        return k.getNativeStyle(this.f68876a);
    }

    @Override // j1.i1
    public boolean isAntiAlias() {
        return k.getNativeAntiAlias(this.f68876a);
    }

    @Override // j1.i1
    public void setAlpha(float f10) {
        k.setNativeAlpha(this.f68876a, f10);
    }

    @Override // j1.i1
    public void setAntiAlias(boolean z10) {
        k.setNativeAntiAlias(this.f68876a, z10);
    }

    @Override // j1.i1
    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public void mo4771setBlendModes9anfk8(int i10) {
        this.f68877b = i10;
        k.m4782setNativeBlendModeGB0RdKg(this.f68876a, i10);
    }

    @Override // j1.i1
    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public void mo4772setColor8_81llA(long j10) {
        k.m4783setNativeColor4WTKRHQ(this.f68876a, j10);
    }

    @Override // j1.i1
    public void setColorFilter(n0 n0Var) {
        this.f68879d = n0Var;
        k.setNativeColorFilter(this.f68876a, n0Var);
    }

    @Override // j1.i1
    /* renamed from: setFilterQuality-vDHp3xo, reason: not valid java name */
    public void mo4773setFilterQualityvDHp3xo(int i10) {
        k.m4784setNativeFilterQuality50PEsBU(this.f68876a, i10);
    }

    @Override // j1.i1
    public void setPathEffect(m1 m1Var) {
        k.setNativePathEffect(this.f68876a, m1Var);
        this.f68880e = m1Var;
    }

    @Override // j1.i1
    public void setShader(Shader shader) {
        this.f68878c = shader;
        k.setNativeShader(this.f68876a, shader);
    }

    @Override // j1.i1
    /* renamed from: setStrokeCap-BeK7IIE, reason: not valid java name */
    public void mo4774setStrokeCapBeK7IIE(int i10) {
        k.m4785setNativeStrokeCapCSYIeUk(this.f68876a, i10);
    }

    @Override // j1.i1
    /* renamed from: setStrokeJoin-Ww9F2mQ, reason: not valid java name */
    public void mo4775setStrokeJoinWw9F2mQ(int i10) {
        k.m4786setNativeStrokeJoinkLtJ_vA(this.f68876a, i10);
    }

    @Override // j1.i1
    public void setStrokeMiterLimit(float f10) {
        k.setNativeStrokeMiterLimit(this.f68876a, f10);
    }

    @Override // j1.i1
    public void setStrokeWidth(float f10) {
        k.setNativeStrokeWidth(this.f68876a, f10);
    }

    @Override // j1.i1
    /* renamed from: setStyle-k9PVt8s, reason: not valid java name */
    public void mo4776setStylek9PVt8s(int i10) {
        k.m4787setNativeStyle5YerkU(this.f68876a, i10);
    }
}
