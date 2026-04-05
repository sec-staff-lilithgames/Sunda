package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f70083d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f70084e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f70085f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f70086g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        float[] transform$ui_graphics_release = d.f70021b.getBradford().getTransform$ui_graphics_release();
        n nVar = n.f70072a;
        float[] fArrMul3x3 = h.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, h.chromaticAdaptation(transform$ui_graphics_release, nVar.getD50().toXyz$ui_graphics_release(), nVar.getD65().toXyz$ui_graphics_release()));
        f70083d = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f70084e = fArr;
        f70085f = h.inverse3x3(fArrMul3x3);
        f70086g = h.inverse3x3(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String name, int i10) {
        super(name, f.f70028b.m5098getLabxdoWZVw(), i10, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
    }

    @Override // k1.g
    public float[] fromXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        h.mul3x3Float3(f70083d, v10);
        double d10 = 0.33333334f;
        v10[0] = Math.signum(v10[0]) * ((float) Math.pow(Math.abs(v10[0]), d10));
        v10[1] = Math.signum(v10[1]) * ((float) Math.pow(Math.abs(v10[1]), d10));
        v10[2] = Math.signum(v10[2]) * ((float) Math.pow(Math.abs(v10[2]), d10));
        h.mul3x3Float3(f70084e, v10);
        return v10;
    }

    @Override // k1.g
    public float getMaxValue(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // k1.g
    public float getMinValue(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // k1.g
    public boolean isWideGamut() {
        return true;
    }

    @Override // k1.g
    public float[] toXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        v10[0] = qv.v.coerceIn(v10[0], 0.0f, 1.0f);
        v10[1] = qv.v.coerceIn(v10[1], -0.5f, 0.5f);
        v10[2] = qv.v.coerceIn(v10[2], -0.5f, 0.5f);
        h.mul3x3Float3(f70086g, v10);
        float f10 = v10[0];
        v10[0] = f10 * f10 * f10;
        float f11 = v10[1];
        v10[1] = f11 * f11 * f11;
        float f12 = v10[2];
        v10[2] = f12 * f12 * f12;
        h.mul3x3Float3(f70085f, v10);
        return v10;
    }
}
