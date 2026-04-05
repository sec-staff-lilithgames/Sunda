package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: e, reason: collision with root package name */
    private static final long f15314e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final k f15315a;

    /* renamed from: b, reason: collision with root package name */
    private final o f15316b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f15317c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f15318d = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0038a {
        void onAdExpired(s1 s1Var);
    }

    public a(k kVar) {
        this.f15315a = kVar;
        this.f15316b = kVar.O();
    }

    private b b(s1 s1Var) {
        synchronized (this.f15318d) {
            try {
                if (s1Var == null) {
                    return null;
                }
                Iterator it = this.f15317c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (s1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(s1 s1Var, InterfaceC0038a interfaceC0038a) {
        synchronized (this.f15318d) {
            try {
                if (b(s1Var) != null) {
                    if (o.a()) {
                        this.f15316b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + s1Var);
                    }
                    return true;
                }
                if (s1Var.getTimeToLiveMillis() <= f15314e) {
                    if (o.a()) {
                        this.f15316b.a("AdExpirationManager", "Ad has already expired: " + s1Var);
                    }
                    s1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.f15316b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(s1Var.getTimeToLiveMillis()) + " seconds from now for " + s1Var + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                if (this.f15317c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f15317c.add(b.a(s1Var, interfaceC0038a, this.f15315a));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f15318d) {
            try {
                Iterator it = this.f15317c.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    s1 s1VarB = bVar.b();
                    if (s1VarB == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = s1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.f15316b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + s1VarB);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (o.a()) {
                                this.f15316b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + s1VarB);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(s1 s1Var) {
        synchronized (this.f15318d) {
            try {
                b bVarB = b(s1Var);
                if (bVarB != null) {
                    if (o.a()) {
                        this.f15316b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + s1Var);
                    }
                    bVarB.a();
                    a(bVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f15318d) {
            try {
                this.f15317c.remove(bVar);
                if (this.f15317c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        synchronized (this.f15318d) {
            try {
                Iterator it = this.f15317c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
