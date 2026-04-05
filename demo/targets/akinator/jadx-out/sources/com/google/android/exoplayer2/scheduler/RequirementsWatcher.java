package com.google.android.exoplayer2.scheduler;

import af.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class RequirementsWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28022a;

    /* renamed from: b, reason: collision with root package name */
    public final b f28023b;

    /* renamed from: c, reason: collision with root package name */
    public final Requirements f28024c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f28025d = n1.createHandlerForCurrentOrMainLooper();

    /* renamed from: e, reason: collision with root package name */
    public DeviceStatusChangeReceiver f28026e;

    /* renamed from: f, reason: collision with root package name */
    public int f28027f;

    /* renamed from: g, reason: collision with root package name */
    public d f28028g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        public DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher.this.a();
        }
    }

    public RequirementsWatcher(Context context, b bVar, Requirements requirements) {
        this.f28022a = context.getApplicationContext();
        this.f28023b = bVar;
        this.f28024c = requirements;
    }

    public final void a() {
        int notMetRequirements = this.f28024c.getNotMetRequirements(this.f28022a);
        if (this.f28027f != notMetRequirements) {
            this.f28027f = notMetRequirements;
            ((g) this.f28023b).onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    public Requirements getRequirements() {
        return this.f28024c;
    }

    public int start() {
        Requirements requirements = this.f28024c;
        Context context = this.f28022a;
        this.f28027f = requirements.getNotMetRequirements(context);
        IntentFilter intentFilter = new IntentFilter();
        if (requirements.isNetworkRequired()) {
            if (n1.f28506a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) com.google.android.exoplayer2.util.a.checkNotNull((ConnectivityManager) context.getSystemService("connectivity"));
                d dVar = new d(this);
                this.f28028g = dVar;
                connectivityManager.registerDefaultNetworkCallback(dVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (requirements.isIdleRequired()) {
            if (n1.f28506a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (requirements.isStorageNotLowRequired()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        DeviceStatusChangeReceiver deviceStatusChangeReceiver = new DeviceStatusChangeReceiver();
        this.f28026e = deviceStatusChangeReceiver;
        context.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.f28025d);
        return this.f28027f;
    }

    public void stop() {
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) com.google.android.exoplayer2.util.a.checkNotNull(this.f28026e);
        Context context = this.f28022a;
        context.unregisterReceiver(broadcastReceiver);
        this.f28026e = null;
        if (n1.f28506a < 24 || this.f28028g == null) {
            return;
        }
        ((ConnectivityManager) com.google.android.exoplayer2.util.a.checkNotNull((ConnectivityManager) context.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) com.google.android.exoplayer2.util.a.checkNotNull(this.f28028g));
        this.f28028g = null;
    }
}
