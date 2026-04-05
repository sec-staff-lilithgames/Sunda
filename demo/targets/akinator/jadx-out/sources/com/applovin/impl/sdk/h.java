package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.c2;
import com.applovin.impl.k7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.v4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f15422a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f15423b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f15424c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f15425d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f15426e = new AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    private long f15427f;

    /* renamed from: g, reason: collision with root package name */
    private long f15428g;

    /* renamed from: h, reason: collision with root package name */
    private long f15429h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f15423b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f15426e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f15427f) {
                h.this.f15425d.postDelayed(this, h.this.f15429h);
                return;
            }
            h.this.f15423b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", h.this.f15422a.A0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f15422a.E().d(c2.f13734r0, map);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f15423b.get() != b.MONITORING) {
                return;
            }
            h.this.f15426e.set(System.currentTimeMillis());
            h.this.f15424c.postDelayed(this, h.this.f15428g);
        }
    }

    public h(k kVar) {
        this.f15422a = kVar;
        this.f15423b = new AtomicReference(!k7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.f15424c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f15425d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        AtomicReference atomicReference = this.f15423b;
        b bVar = b.MONITORING;
        b bVar2 = b.IDLE;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f15424c.removeCallbacksAndMessages(null);
        this.f15425d.removeCallbacksAndMessages(null);
    }

    private void c() {
        if (((Boolean) this.f15422a.a(v4.T5)).booleanValue() && this.f15422a.n0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        AtomicReference atomicReference = this.f15423b;
        b bVar = b.IDLE;
        b bVar2 = b.MONITORING;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f15424c.post(new d());
        this.f15425d.postDelayed(new c(), this.f15429h / 2);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f15427f = ((Long) this.f15422a.a(v4.Q5)).longValue();
        this.f15428g = ((Long) this.f15422a.a(v4.R5)).longValue();
        this.f15429h = ((Long) this.f15422a.a(v4.S5)).longValue();
        if (((Boolean) this.f15422a.a(v4.T5)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f15423b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f15422a.a(v4.P5)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
