package com.applovin.impl.sdk.network;

import a2.s;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.browser.customtabs.g;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import com.applovin.impl.k7;
import com.applovin.impl.p6;
import com.applovin.impl.q2;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f15618a;

    /* renamed from: b, reason: collision with root package name */
    private final o f15619b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15620c;

    /* renamed from: d, reason: collision with root package name */
    private final c f15621d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f15622e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final List f15623f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f15624g;

    /* renamed from: h, reason: collision with root package name */
    private final List f15625h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements AppLovinPostbackListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f15626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f15627b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f15626a = dVar;
            this.f15627b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            o unused = b.this.f15619b;
            if (o.a()) {
                b.this.f15619b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f15626a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f15626a);
            q2.a(this.f15627b, str, i10);
            if (this.f15626a.c() == 1) {
                b.this.f15618a.E().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f15626a);
            o unused = b.this.f15619b;
            if (o.a()) {
                b.this.f15619b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f15626a);
            }
            b.this.c();
            q2.a(this.f15627b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f15623f = arrayList;
        this.f15624g = new HashSet();
        this.f15625h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f15618a = kVar;
        this.f15619b = kVar.O();
        int iIntValue = ((Integer) kVar.a(v4.H2)).intValue();
        this.f15620c = iIntValue;
        if (!((Boolean) kVar.a(v4.K2)).booleanValue()) {
            this.f15621d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.f15621d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f15618a.r0().a((g5) this.f15621d, b6.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f15622e) {
            while (this.f15623f.size() > this.f15620c) {
                try {
                    this.f15623f.remove(0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f15623f.add(dVar);
        }
        if (o.a()) {
            this.f15619b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f15622e) {
            try {
                if (((Boolean) this.f15618a.a(v4.J2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f15625h.size());
                    arrayList.addAll(this.f15625h);
                } else {
                    arrayList.ensureCapacity(this.f15623f.size());
                    arrayList.addAll(this.f15623f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f15622e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f15622e) {
            try {
                Iterator it = new ArrayList(this.f15623f).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z10, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f15619b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new g(this, 21, dVar, appLovinPostbackListener), k7.h(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new s(this, 16), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f15622e) {
            try {
                Iterator it = this.f15625h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f15625h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f15622e) {
            this.f15623f.clear();
            this.f15625h.clear();
        }
        this.f15618a.r0().a((g5) this.f15621d, b6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f15622e) {
            this.f15624g.remove(dVar);
            this.f15625h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.f15619b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f15618a.F0() && !dVar.m()) {
            if (o.a()) {
                this.f15619b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.f15619b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f15622e) {
            try {
                if (this.f15624g.contains(dVar)) {
                    if (o.a()) {
                        this.f15619b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f15618a.a(v4.G2);
                if (dVar.c() > num.intValue()) {
                    if (o.a()) {
                        this.f15619b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f15622e) {
                    this.f15624g.add(dVar);
                }
                e eVarB = e.b(this.f15618a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (o.a()) {
                    this.f15619b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f15618a.g0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f15622e) {
            this.f15624g.remove(dVar);
            this.f15623f.remove(dVar);
        }
        if (o.a()) {
            this.f15619b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f15618a.r0().a((g5) new p6(this.f15618a, z11, "runPostbackTask", runnable), b6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
