package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g0 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f13993c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final d7 f13994a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13995b;

    private g0(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f13994a = d7.a(j10, z10, kVar, new d9(this, z10, runnable, 0));
        this.f13995b = kVar;
        f13993c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f13994a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f13994a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f13994a.e();
        }
    }

    public static g0 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static g0 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new g0(j10, z10, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Runnable runnable) {
        if (!z10) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f13994a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f13993c.remove(this);
    }
}
