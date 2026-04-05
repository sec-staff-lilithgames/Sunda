package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f13956a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    private Handler f13957b;

    public f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f13957b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i10) {
        return this.f13956a.getDefaultSensor(i10);
    }

    public void b(SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.o oVar) {
        this.f13957b.post(new c9(this, sensorEventListener, sensor, i10, oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i10, com.applovin.impl.sdk.o oVar) {
        try {
            this.f13956a.registerListener(sensorEventListener, sensor, i10, this.f13957b);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                oVar.a("BackgroundSensorManager", "Unable to register sensor listener", th2);
            }
        }
    }

    public void b(SensorEventListener sensorEventListener) {
        this.f13957b.post(new s8(7, this, sensorEventListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f13956a.unregisterListener(sensorEventListener);
    }
}
