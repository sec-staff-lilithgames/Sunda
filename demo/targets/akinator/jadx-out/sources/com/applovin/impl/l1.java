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
public class l1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14299a;

    /* renamed from: b, reason: collision with root package name */
    private final f0 f14300b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f14301c;

    /* renamed from: d, reason: collision with root package name */
    private final a f14302d;

    /* renamed from: e, reason: collision with root package name */
    private float f14303e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a();

        void b();
    }

    public l1(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f14299a = kVar;
        f0 f0Var = new f0();
        this.f14300b = f0Var;
        this.f14301c = f0Var.a(1);
        this.f14302d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f14299a.o0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f14300b.b(this);
        this.f14300b.b(this, this.f14301c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f14299a.O());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f14300b.b(this);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f14300b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f14303e;
            float f11 = (fMax * 0.5f) + (f10 * 0.5f);
            this.f14303e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f14302d.a();
            } else {
                if (f10 <= -0.8f || f11 >= -0.8f) {
                    return;
                }
                this.f14302d.b();
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
