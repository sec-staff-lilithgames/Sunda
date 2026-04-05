package io.bidmachine.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import io.bidmachine.media3.common.util.a1;
import z9.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RequirementsWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Context f61547a;

    /* renamed from: b, reason: collision with root package name */
    public final b f61548b;

    /* renamed from: c, reason: collision with root package name */
    public final Requirements f61549c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f61550d = a1.createHandlerForCurrentOrMainLooper();

    /* renamed from: e, reason: collision with root package name */
    public DeviceStatusChangeReceiver f61551e;

    /* renamed from: f, reason: collision with root package name */
    public int f61552f;

    /* renamed from: g, reason: collision with root package name */
    public d f61553g;

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
        this.f61547a = context.getApplicationContext();
        this.f61548b = bVar;
        this.f61549c = requirements;
    }

    public final void a() {
        int notMetRequirements = this.f61549c.getNotMetRequirements(this.f61547a);
        if (this.f61552f != notMetRequirements) {
            this.f61552f = notMetRequirements;
            ((h) this.f61548b).onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    public Requirements getRequirements() {
        return this.f61549c;
    }

    public int start() {
        Requirements requirements = this.f61549c;
        Context context = this.f61547a;
        this.f61552f = requirements.getNotMetRequirements(context);
        IntentFilter intentFilter = new IntentFilter();
        if (requirements.isNetworkRequired()) {
            if (a1.f60679a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) io.bidmachine.media3.common.util.a.checkNotNull((ConnectivityManager) context.getSystemService("connectivity"));
                d dVar = new d(this);
                this.f61553g = dVar;
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
            if (a1.f60679a >= 23) {
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
        this.f61551e = deviceStatusChangeReceiver;
        context.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.f61550d);
        return this.f61552f;
    }

    public void stop() {
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) io.bidmachine.media3.common.util.a.checkNotNull(this.f61551e);
        Context context = this.f61547a;
        context.unregisterReceiver(broadcastReceiver);
        this.f61551e = null;
        if (a1.f60679a < 24 || this.f61553g == null) {
            return;
        }
        ((ConnectivityManager) io.bidmachine.media3.common.util.a.checkNotNull((ConnectivityManager) context.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) io.bidmachine.media3.common.util.a.checkNotNull(this.f61553g));
        this.f61553g = null;
    }
}
