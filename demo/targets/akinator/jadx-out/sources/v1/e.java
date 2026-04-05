package v1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f88853a;

    /* renamed from: b, reason: collision with root package name */
    public final Float[] f88854b;

    public e(int i10) {
        this.f88853a = i10;
        Float[] fArr = new Float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[i11] = Float.valueOf(0.0f);
        }
        this.f88854b = fArr;
    }

    public final float get(int i10) {
        return this.f88854b[i10].floatValue();
    }

    public final Float[] getElements() {
        return this.f88854b;
    }

    public final int getLength() {
        return this.f88853a;
    }

    public final float norm() {
        return (float) Math.sqrt(times(this));
    }

    public final void set(int i10, float f10) {
        this.f88854b[i10] = Float.valueOf(f10);
    }

    public final float times(e a10) {
        e0.checkNotNullParameter(a10, "a");
        float f10 = 0.0f;
        for (int i10 = 0; i10 < this.f88853a; i10++) {
            f10 += a10.get(i10) * get(i10);
        }
        return f10;
    }
}
