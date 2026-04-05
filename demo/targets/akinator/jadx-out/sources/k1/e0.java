package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String name, int i10) {
        super(name, f.f70028b.m5100getXyzxdoWZVw(), i10, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
    }

    public static float a(float f10) {
        return qv.v.coerceIn(f10, -2.0f, 2.0f);
    }

    @Override // k1.g
    public float[] fromXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        v10[0] = a(v10[0]);
        v10[1] = a(v10[1]);
        v10[2] = a(v10[2]);
        return v10;
    }

    @Override // k1.g
    public float getMaxValue(int i10) {
        return 2.0f;
    }

    @Override // k1.g
    public float getMinValue(int i10) {
        return -2.0f;
    }

    @Override // k1.g
    public boolean isWideGamut() {
        return true;
    }

    @Override // k1.g
    public float[] toXyz(float[] v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        v10[0] = a(v10[0]);
        v10[1] = a(v10[1]);
        v10[2] = a(v10[2]);
        return v10;
    }
}
