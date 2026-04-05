package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class u4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f15802a;

    /* renamed from: b, reason: collision with root package name */
    private final float f15803b;

    /* renamed from: c, reason: collision with root package name */
    private final f0 f15804c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f15805d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f15806e;

    /* renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f15807f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f15808g;

    /* renamed from: h, reason: collision with root package name */
    private float f15809h;

    public u4(com.applovin.impl.sdk.k kVar) {
        this.f15807f = kVar;
        f0 f0Var = new f0();
        this.f15804c = f0Var;
        this.f15805d = f0Var.a(9);
        this.f15806e = f0Var.a(4);
        this.f15802a = ((Integer) kVar.a(v4.f15916e4)).intValue();
        this.f15803b = ((Float) kVar.a(v4.f15908d4)).floatValue();
    }

    public float a() {
        if (this.f15808g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f15809h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f15807f.o0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f15804c.b(this);
        if (((Boolean) this.f15807f.p0().a(v4.f15890b4)).booleanValue()) {
            this.f15804c.b(this, this.f15805d, (int) TimeUnit.MILLISECONDS.toMicros(this.f15802a), this.f15807f.O());
        }
        if (((Boolean) this.f15807f.p0().a(v4.f15899c4)).booleanValue()) {
            this.f15804c.b(this, this.f15806e, (int) TimeUnit.MILLISECONDS.toMicros(this.f15802a), this.f15807f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f15804c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f15808g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f15809h * this.f15803b;
            this.f15809h = f10;
            this.f15809h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f10;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
