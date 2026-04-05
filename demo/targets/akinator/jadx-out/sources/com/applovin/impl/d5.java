package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d5 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f13865a = new HashSet(32);

    /* renamed from: b, reason: collision with root package name */
    private final Object f13866b = new Object();

    public boolean a(String str) {
        synchronized (this.f13866b) {
            try {
                Iterator it = this.f13865a.iterator();
                while (it.hasNext()) {
                    if (str.equals(((e5) it.next()).b())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        e5 e5VarA;
        if (StringUtils.isValidString(str)) {
            synchronized (this.f13866b) {
                e5VarA = a(str, appLovinCommunicatorSubscriber);
            }
            if (e5VarA != null) {
                e5VarA.a(false);
                AppLovinBroadcastManager.unregisterReceiver(e5VarA);
            }
        }
    }

    public boolean a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f13866b) {
                try {
                    e5 e5VarA = a(str, appLovinCommunicatorSubscriber);
                    if (e5VarA != null) {
                        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                        if (!e5VarA.c()) {
                            e5VarA.a(true);
                            AppLovinBroadcastManager.registerReceiver(e5VarA, new IntentFilter(str));
                        }
                        return true;
                    }
                    e5 e5Var = new e5(str, appLovinCommunicatorSubscriber);
                    this.f13865a.add(e5Var);
                    AppLovinBroadcastManager.registerReceiver(e5Var, new IntentFilter(str));
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        com.applovin.impl.sdk.o.h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }

    private e5 a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (e5 e5Var : this.f13865a) {
            if (str.equals(e5Var.b()) && appLovinCommunicatorSubscriber.equals(e5Var.a())) {
                return e5Var;
            }
        }
        return null;
    }
}
