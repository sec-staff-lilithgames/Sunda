package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends g {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String name, int i10) {
        super(name, f.f70028b.m5098getLabxdoWZVw(), i10, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
    }

    @Override // k1.g
    public float[] fromXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        float f10 = v10[0];
        n nVar = n.f70072a;
        float f11 = f10 / nVar.getD50Xyz$ui_graphics_release()[0];
        float f12 = v10[1] / nVar.getD50Xyz$ui_graphics_release()[1];
        float f13 = v10[2] / nVar.getD50Xyz$ui_graphics_release()[2];
        float fPow = f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        float fPow2 = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float fPow3 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        v10[0] = qv.v.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v10[1] = qv.v.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v10[2] = qv.v.coerceIn((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v10;
    }

    @Override // k1.g
    public float getMaxValue(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // k1.g
    public float getMinValue(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // k1.g
    public boolean isWideGamut() {
        return true;
    }

    @Override // k1.g
    public float[] toXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        v10[0] = qv.v.coerceIn(v10[0], 0.0f, 100.0f);
        v10[1] = qv.v.coerceIn(v10[1], -128.0f, 128.0f);
        float fCoerceIn = qv.v.coerceIn(v10[2], -128.0f, 128.0f);
        v10[2] = fCoerceIn;
        float f10 = (v10[0] + 16.0f) / 116.0f;
        float f11 = (v10[1] * 0.002f) + f10;
        float f12 = f10 - (fCoerceIn * 0.005f);
        float f13 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        float f14 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
        n nVar = n.f70072a;
        v10[0] = f13 * nVar.getD50Xyz$ui_graphics_release()[0];
        v10[1] = f14 * nVar.getD50Xyz$ui_graphics_release()[1];
        v10[2] = f15 * nVar.getD50Xyz$ui_graphics_release()[2];
        return v10;
    }
}
