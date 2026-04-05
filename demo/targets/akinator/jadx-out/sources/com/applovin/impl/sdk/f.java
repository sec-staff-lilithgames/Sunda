package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.d7;
import com.applovin.impl.o3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private d7 f15392a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f15393b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f15394c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private boolean f15395d;

    /* renamed from: e, reason: collision with root package name */
    private final k f15396e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference f15397f;

    /* renamed from: g, reason: collision with root package name */
    private long f15398g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onAdRefresh();
    }

    public f(k kVar, a aVar) {
        this.f15397f = new WeakReference(aVar);
        this.f15396e = kVar;
    }

    private void e() {
        if (((Boolean) this.f15396e.a(o3.f14973u7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f15396e.a(o3.f14973u7)).booleanValue()) {
            synchronized (this.f15393b) {
                try {
                    if (this.f15395d) {
                        this.f15396e.O();
                        if (o.a()) {
                            this.f15396e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f15396e.n0().isApplicationPaused()) {
                        this.f15396e.O();
                        if (o.a()) {
                            this.f15396e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        d7 d7Var = this.f15392a;
                        if (d7Var != null) {
                            d7Var.e();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f15397f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f15393b) {
            try {
                d7 d7Var = this.f15392a;
                if (d7Var != null) {
                    d7Var.d();
                } else {
                    this.f15396e.O();
                    if (o.a()) {
                        this.f15396e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f15394c.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        synchronized (this.f15393b) {
            try {
                this.f15392a = null;
                if (!((Boolean) this.f15396e.a(o3.f14974v7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n() {
        synchronized (this.f15393b) {
            try {
                d7 d7Var = this.f15392a;
                if (d7Var != null) {
                    d7Var.e();
                } else {
                    this.f15394c.set(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f15393b) {
            try {
                d7 d7Var = this.f15392a;
                jC = d7Var != null ? d7Var.c() : -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f15396e.a(o3.f14972t7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f15396e.a(o3.f14972t7)).booleanValue()) {
            synchronized (this.f15393b) {
                try {
                    if (this.f15395d) {
                        this.f15396e.O();
                        if (o.a()) {
                            this.f15396e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f15396e.I().c()) {
                        this.f15396e.O();
                        if (o.a()) {
                            this.f15396e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f15392a != null) {
                        long jB = this.f15398g - b();
                        long jLongValue = ((Long) this.f15396e.a(o3.f14970s7)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f15392a.e();
                            z10 = false;
                        } else {
                            a();
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10 || (aVar = (a) this.f15397f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean g() {
        return this.f15395d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f15393b) {
            z10 = this.f15392a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f15393b) {
            k();
            this.f15395d = true;
        }
    }

    public void m() {
        synchronized (this.f15393b) {
            n();
            this.f15395d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j10) {
        synchronized (this.f15393b) {
            try {
                a();
                this.f15398g = j10;
                this.f15392a = d7.a(j10, this.f15396e, new a2.s(this, 14));
                if (!((Boolean) this.f15396e.a(o3.f14974v7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f15396e.a(o3.f14973u7)).booleanValue() && (this.f15396e.I().c() || this.f15396e.n0().isApplicationPaused())) {
                    this.f15392a.d();
                }
                if (this.f15394c.compareAndSet(true, false) && ((Boolean) this.f15396e.a(o3.f14975w7)).booleanValue()) {
                    this.f15396e.O();
                    if (o.a()) {
                        this.f15396e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f15392a.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f15393b) {
            try {
                d7 d7Var = this.f15392a;
                if (d7Var != null) {
                    d7Var.a();
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
