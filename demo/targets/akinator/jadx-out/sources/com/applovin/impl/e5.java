package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e5 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b, reason: collision with root package name */
    private final String f13936b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f13937c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f13935a = true;

    /* renamed from: d, reason: collision with root package name */
    private final Set f13938d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f13939e = new Object();

    public e5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f13936b = str;
        this.f13937c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f13937c.get();
    }

    public String b() {
        return this.f13936b;
    }

    public boolean c() {
        return this.f13935a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f13937c.get();
        e5 e5Var = (e5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) e5Var.f13937c.get();
        return b().equals(e5Var.b()) && (appLovinCommunicatorSubscriber == null ? appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2 : appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2));
    }

    public int hashCode() {
        int iHashCode = this.f13936b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f13937c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z10;
        if (a() == null) {
            com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f13939e) {
            try {
                if (this.f13938d.contains(communicatorMessageImpl.getUniqueId())) {
                    z10 = false;
                } else {
                    this.f13938d.add(communicatorMessageImpl.getUniqueId());
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f13935a = z10;
    }
}
