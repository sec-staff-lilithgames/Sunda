package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final Queue f15673a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Object f15674b = new Object();

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f15674b) {
            try {
                if (b() <= 25) {
                    this.f15673a.offer(appLovinAdImpl);
                } else {
                    o.h("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b() {
        int size;
        synchronized (this.f15674b) {
            size = this.f15673a.size();
        }
        return size;
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f15674b) {
            z10 = b() == 0;
        }
        return z10;
    }

    public AppLovinAdImpl d() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f15674b) {
            appLovinAdImpl = (AppLovinAdImpl) this.f15673a.peek();
        }
        return appLovinAdImpl;
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f15674b) {
            this.f15673a.remove(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl a() {
        AppLovinAdImpl appLovinAdImpl;
        synchronized (this.f15674b) {
            try {
                appLovinAdImpl = !c() ? (AppLovinAdImpl) this.f15673a.poll() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return appLovinAdImpl;
    }
}
