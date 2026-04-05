package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.e2;
import com.applovin.impl.g6;
import com.applovin.impl.h3;
import com.applovin.impl.i5;
import com.applovin.impl.k1;
import com.applovin.impl.o3;
import com.applovin.impl.q4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.mediation.adapter.MaxAdapter;
import cv.BLca.YsiBvdpw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14719a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14720b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f14721c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Set f14722d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f14723e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final JSONArray f14724f = new JSONArray();

    /* renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f14725g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f14726h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Map f14727i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f14728j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final Object f14729k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private List f14730l;

    public f(com.applovin.impl.sdk.k kVar) {
        this.f14719a = kVar;
        this.f14720b = kVar.O();
    }

    public void a(Activity activity) {
        if (this.f14721c.compareAndSet(false, true)) {
            String str = (String) this.f14719a.a(x4.F);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<h3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f14719a.t0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f14730l = listA;
                    for (h3 h3Var : listA) {
                        this.f14727i.put(h3Var.b(), h3Var);
                    }
                    long j10 = StringUtils.parseLong(this.f14719a.o0().getExtraParameters().get(YsiBvdpw.tVjqpe), -1L);
                    i5 i5Var = new i5(listA, activity, this.f14719a);
                    if (j10 > 0) {
                        this.f14719a.r0().a(i5Var, b6.b.MEDIATION, j10);
                    } else {
                        this.f14719a.r0().a(i5Var);
                    }
                } catch (JSONException e10) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14720b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e10);
                    }
                    k1.a((Throwable) e10);
                }
            }
        }
    }

    public boolean c() {
        return this.f14721c.get();
    }

    private void c(h3 h3Var) {
        String strB = h3Var.b();
        synchronized (this.f14723e) {
            try {
                if (this.f14722d.contains(strB)) {
                    return;
                }
                this.f14722d.add(strB);
                this.f14719a.P().d(c2.O, e2.a(h3Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f14726h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f14724f);
        }
        return jSONArrayShallowCopy;
    }

    public boolean b(h3 h3Var) {
        boolean zContainsKey;
        synchronized (this.f14726h) {
            zContainsKey = this.f14725g.containsKey(h3Var.b());
        }
        return zContainsKey;
    }

    public q4 a(h3 h3Var, Activity activity) {
        h3 h3VarA = a(h3Var);
        if (h3VarA == null) {
            return q4.a("AdapterInitialization:" + h3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = h3Var.b();
        synchronized (this.f14729k) {
            try {
                q4 q4Var = (q4) this.f14728j.get(strB);
                if (q4Var == null || (q4Var.d() && h3VarA.q())) {
                    final q4 q4Var2 = new q4("AdapterInitialization:" + h3Var.c());
                    this.f14728j.put(strB, q4Var2);
                    h hVarA = this.f14719a.T().a(h3VarA);
                    if (hVarA == null) {
                        q4Var2.a("Adapter implementation not found");
                        return q4Var2;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14720b.d("MediationAdapterInitializationManager", "Initializing adapter " + h3VarA);
                    }
                    c(h3VarA);
                    hVarA.a(MaxAdapterParametersImpl.a(h3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.n
                        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                        public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                            f.a(q4Var2, initializationStatus, str);
                        }
                    });
                    g6.a(h3VarA.m(), q4Var2, "The adapter (" + h3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f14719a);
                    return q4Var2;
                }
                return q4Var;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(q4 q4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                q4Var.a(str);
                return;
            } else {
                q4Var.b(initializationStatus);
                return;
            }
        }
        k1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        q4Var.a("Adapter reported INITIALIZING");
    }

    private h3 a(h3 h3Var) {
        List<h3> list;
        if (((Boolean) this.f14719a.a(o3.f14957l8)).booleanValue()) {
            h3 h3Var2 = (h3) this.f14727i.get(h3Var.b());
            return h3Var2 != null ? h3Var2 : h3Var;
        }
        if (!this.f14719a.t0().c() || (list = this.f14730l) == null) {
            return h3Var;
        }
        for (h3 h3Var3 : list) {
            if (h3Var3.b().equals(h3Var.b())) {
                return h3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f14726h) {
            num = (Integer) this.f14725g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f14726h) {
            hashSet = new HashSet(this.f14725g.keySet());
        }
        return hashSet;
    }

    public void a(h3 h3Var, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zB;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f14726h) {
            try {
                zB = b(h3Var);
                if (!zB) {
                    this.f14725g.put(h3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", h3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j10);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f14724f.put(jSONObject);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zB) {
            return;
        }
        this.f14719a.a(h3Var);
        this.f14719a.X().processAdapterInitializationPostback(h3Var, j10, initializationStatus, str);
        this.f14719a.u().a(initializationStatus, h3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(new h3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, this.f14719a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f14726h) {
            this.f14725g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f14719a.u().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
