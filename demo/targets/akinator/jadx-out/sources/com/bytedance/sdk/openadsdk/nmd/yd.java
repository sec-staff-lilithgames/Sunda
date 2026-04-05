package com.bytedance.sdk.openadsdk.nmd;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {
    public static WeakReference<jpo> jpo;

    /* renamed from: jd, reason: collision with root package name */
    protected static final float[] f21401jd = new float[3];
    protected static final float[] wqx = new float[3];

    /* renamed from: cm, reason: collision with root package name */
    protected static final float[] f21400cm = new float[9];
    protected static final float[] my = new float[3];

    public static void cm(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<jpo> weakReference = jpo;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            qk.jpo("SensorHub", "startListenRotationVector err", th2);
        }
    }

    public static void jd(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<jpo> weakReference = jpo;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            qk.jpo("SensorHub", "startListenGyroscope error", th2);
        }
    }

    public static void jpo(Context context, SensorEventListener sensorEventListener) {
    }

    public static void wqx(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<jpo> weakReference = jpo;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            qk.jpo("SensorHub", "startListenLinearAcceleration error", th2);
        }
    }

    public static void jpo(jpo jpoVar) {
        jpo = new WeakReference<>(jpoVar);
    }

    public static void jpo(Context context, SensorEventListener sensorEventListener, int i10) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<jpo> weakReference = jpo;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th2) {
            qk.jpo("SensorHub", "startListenAccelerometer error", th2);
        }
    }

    public static void jpo(Context context, long j10) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j10);
    }
}
