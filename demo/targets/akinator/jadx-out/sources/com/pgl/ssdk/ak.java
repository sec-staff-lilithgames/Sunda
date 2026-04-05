package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ak implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f50376a = {999999.0f, 999999.0f, 999999.0f};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f50377b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile ak f50378c;

    /* renamed from: i, reason: collision with root package name */
    private final Context f50384i;

    /* renamed from: d, reason: collision with root package name */
    private Sensor f50379d = null;

    /* renamed from: e, reason: collision with root package name */
    private Sensor f50380e = null;

    /* renamed from: f, reason: collision with root package name */
    private Sensor f50381f = null;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f50382g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f50383h = false;

    /* renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f50385j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private long f50386k = 999999;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f50387a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f50388b = null;

        /* renamed from: c, reason: collision with root package name */
        public float[] f50389c = null;

        /* renamed from: d, reason: collision with root package name */
        public float[] f50390d = null;

        public a(long j10) {
            this.f50387a = j10;
        }
    }

    private ak(Context context) {
        this.f50384i = context;
    }

    public static ak a(Context context) {
        if (f50378c == null) {
            synchronized (ak.class) {
                try {
                    if (f50378c == null) {
                        f50378c = new ak(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f50377b) {
            f50378c.c();
        }
        return f50378c;
    }

    private void c() {
        if (this.f50383h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f50384i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f50379d = sensorManager.getDefaultSensor(1);
                this.f50380e = sensorManager.getDefaultSensor(2);
                this.f50381f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f50383h = true;
    }

    private void e() {
        this.f50386k = -1L;
        this.f50382g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f50384i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f50385j.get();
        if (!f50377b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f50379d == null || aVar.f50388b != null) && ((this.f50380e == null || aVar.f50389c != null) && (this.f50381f == null || aVar.f50390d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f50382g = false;
        a(objArr, aVar);
        this.f50385j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f50379d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f50384i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f50379d, 2);
                    Sensor sensor = this.f50380e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f50381f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f50386k = jCurrentTimeMillis;
                        this.f50385j.set(new a(jCurrentTimeMillis));
                        this.f50382g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f50382g;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f50385j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f50388b == null) {
                aVar.f50388b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f50389c == null) {
                aVar.f50389c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f50390d == null) {
            aVar.f50390d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f50376a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        Float fValueOf = Float.valueOf(999999.0f);
        float[] fArr = aVar.f50388b;
        if (fArr != null) {
            float[] fArr2 = aVar.f50389c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f50388b;
        } else {
            objArr[0] = fValueOf;
            objArr[1] = fValueOf;
            objArr[2] = fValueOf;
            objArr[4] = f50376a;
        }
        objArr[3] = Long.valueOf(aVar.f50387a);
        float[] fArr3 = aVar.f50390d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f50376a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, new float[3]);
        return new float[]{(((float) Math.toDegrees(r2[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(r2[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt((f12 * f12) + ((f11 * f11) + (f10 * f10))));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void a() {
        if (!f50377b || this.f50382g) {
            return;
        }
        d();
    }
}
