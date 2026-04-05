package jo;

import android.opengl.Matrix;
import io.bidmachine.media3.common.util.t;
import io.bidmachine.media3.common.util.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f69816a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f69817b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final t0 f69818c = new t0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f69819d;

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        t.setToIdentity(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    public boolean pollRotationMatrix(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f69818c.pollFloor(j10);
        if (fArr2 == null) {
            return false;
        }
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        float[] fArr3 = this.f69817b;
        if (length != 0.0f) {
            Matrix.setRotateM(fArr3, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            t.setToIdentity(fArr3);
        }
        boolean z10 = this.f69819d;
        float[] fArr4 = this.f69816a;
        if (!z10) {
            computeRecenterMatrix(fArr4, fArr3);
            this.f69819d = true;
        }
        Matrix.multiplyMM(fArr, 0, fArr4, 0, fArr3, 0);
        return true;
    }

    public void reset() {
        this.f69818c.clear();
        this.f69819d = false;
    }

    public void setRotation(long j10, float[] fArr) {
        this.f69818c.add(j10, fArr);
    }
}
