package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.g5;
import com.applovin.impl.k1;
import com.applovin.impl.o9;
import com.applovin.impl.p6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f15384a;

    /* renamed from: b, reason: collision with root package name */
    private final c f15385b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15386c = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(k kVar) {
        this.f15384a = kVar;
        this.f15385b = new c(kVar);
    }

    private void e() {
        String str = (String) this.f15384a.q0().a(x4.D);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            c.a aVarA = c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f15384a);
            if (aVarA != null) {
                if (a(aVarA)) {
                    long jC = aVarA.c() - SystemClock.elapsedRealtime();
                    this.f15384a.g().d(c2.L, CollectionUtils.map("details", "ttl = " + jC + "ms"));
                } else {
                    this.f15386c.add(0, aVarA);
                }
            }
        }
    }

    private void f() {
        this.f15384a.r0().a((g5) new p6(this.f15384a, "loadPersistedAdFilesQueueAndCleanupAsync", new v(this, 0)), b6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f15386c) {
            try {
                Iterator it = this.f15386c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c.a) it.next()).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15384a.q0().b(x4.D, new JSONArray((Collection) arrayList).toString());
    }

    public void g() {
        this.f15384a.r0().a((g5) new p6(this.f15384a, "resetManagerState", new v(this, 1)), b6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(c.a aVar) {
        if (aVar == null) {
            this.f15384a.O();
            if (o.a()) {
                this.f15384a.O().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f15386c.add(aVar);
        if (((Boolean) this.f15384a.a(v4.X0)).booleanValue()) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f15384a.q0().b(x4.D);
        this.f15385b.a();
    }

    public void a(com.applovin.impl.u uVar, a aVar) {
        if (aVar == null) {
            this.f15384a.O();
            if (o.a()) {
                this.f15384a.O().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            k1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (uVar == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f15384a.g().a(c2.I, uVar, (AppLovinError) null);
        c.a aVarA = a(uVar.g());
        this.f15385b.a(aVarA, new o9(this, aVar, aVarA, uVar));
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    private void d(c.a aVar) {
        if (aVar != null && this.f15386c.remove(aVar)) {
            this.f15385b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f15384a.g().a(c2.F, bVar);
        this.f15385b.b(bVar, new af.g(this, 8));
    }

    private boolean b(c.a aVar) {
        long jB = aVar.b();
        return (jB == 0 || jB == k.n()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, c.a aVar2, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, uVar, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(c.a.a(bVar));
    }

    private c.a a(AppLovinAdType appLovinAdType) {
        c.a aVar;
        synchronized (this.f15386c) {
            try {
                Iterator it = this.f15386c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (c.a) it.next();
                    if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                        break;
                    }
                }
                this.f15386c.remove(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private void a(a aVar, c.a aVar2, com.applovin.impl.u uVar, String str) {
        if (aVar == null) {
            return;
        }
        this.f15384a.O();
        if (o.a()) {
            this.f15384a.O().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.f15385b.b(aVar2);
        this.f15384a.g().a(c2.K, uVar, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f15384a.O();
        if (o.a()) {
            this.f15384a.O().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.f15385b.b(aVar2);
        this.f15384a.g().a(c2.J, bVar);
    }

    private boolean a(c.a aVar) {
        return ((Long) this.f15384a.a(v4.Z0)).longValue() + SystemClock.elapsedRealtime() >= aVar.c();
    }

    private void a() {
        synchronized (this.f15386c) {
            this.f15385b.a(new ArrayList(this.f15386c));
        }
    }
}
