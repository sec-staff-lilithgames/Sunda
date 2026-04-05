package io.odeeo.internal.s0;

import android.opengl.Matrix;
import io.odeeo.internal.q0.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f66265a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f66266b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final d0<float[]> f66267c = new d0<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f66268d;

    public static void a(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
    }

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    public boolean pollRotationMatrix(float[] fArr, long j10) {
        float[] fArrPollFloor = this.f66267c.pollFloor(j10);
        if (fArrPollFloor == null) {
            return false;
        }
        a(this.f66266b, fArrPollFloor);
        if (!this.f66268d) {
            computeRecenterMatrix(this.f66265a, this.f66266b);
            this.f66268d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f66265a, 0, this.f66266b, 0);
        return true;
    }

    public void reset() {
        this.f66267c.clear();
        this.f66268d = false;
    }

    public void setRotation(long j10, float[] fArr) {
        this.f66267c.add(j10, fArr);
    }
}
