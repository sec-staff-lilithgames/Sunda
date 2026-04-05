package jo;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements SensorEventListener {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f69820b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f69821c = new float[16];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f69822e = new float[16];

    /* renamed from: f, reason: collision with root package name */
    public final float[] f69823f = new float[3];

    /* renamed from: g, reason: collision with root package name */
    public final Display f69824g;

    /* renamed from: h, reason: collision with root package name */
    public final d[] f69825h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f69826i;

    public e(Display display, d... dVarArr) {
        this.f69824g = display;
        this.f69825h = dVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f69820b;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f69824g.getRotation();
        float[] fArr3 = this.f69821c;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i11 = 130;
                    i10 = 1;
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, fArr3);
        float[] fArr4 = this.f69823f;
        SensorManager.getOrientation(fArr3, fArr4);
        float f10 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z10 = this.f69826i;
        float[] fArr5 = this.f69822e;
        if (!z10) {
            c.computeRecenterMatrix(fArr5, fArr2);
            this.f69826i = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (d dVar : this.f69825h) {
            dVar.onOrientationChange(fArr2, f10);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
