package io.odeeo.internal.s0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f66269a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f66270b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f66271c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f66272d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f66273e;

    /* renamed from: f, reason: collision with root package name */
    public final a[] f66274f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f66275g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onOrientationChange(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f66273e = display;
        this.f66274f = aVarArr;
    }

    public static void c(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final void a(float[] fArr, float f10) {
        for (a aVar : this.f66274f) {
            aVar.onOrientationChange(fArr, f10);
        }
    }

    public final void b(float[] fArr) {
        if (!this.f66275g) {
            c.computeRecenterMatrix(this.f66271c, fArr);
            this.f66275g = true;
        }
        float[] fArr2 = this.f66270b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f66270b, 0, this.f66271c, 0);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f66269a, sensorEvent.values);
        a(this.f66269a, this.f66273e.getRotation());
        float fA = a(this.f66269a);
        c(this.f66269a);
        b(this.f66269a);
        a(this.f66269a, fA);
    }

    public final float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, this.f66270b);
        SensorManager.getOrientation(this.f66270b, this.f66272d);
        return this.f66272d[2];
    }

    public final void a(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f66270b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f66270b, i11, i12, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
