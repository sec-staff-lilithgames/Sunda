package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.b3;
import com.applovin.impl.b6;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.Q6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m3 implements q0.e {

    /* renamed from: l, reason: collision with root package name */
    private static WeakReference f14432l;

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicBoolean f14433m = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f14434a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14435b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f14436c;

    /* renamed from: d, reason: collision with root package name */
    private final l3 f14437d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14440g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14442i;

    /* renamed from: j, reason: collision with root package name */
    private Map f14443j;

    /* renamed from: k, reason: collision with root package name */
    private final b0 f14444k;

    /* renamed from: e, reason: collision with root package name */
    private final Map f14438e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f14439f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private int f14441h = 2;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends b {
        public a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!m3.this.c() || m3.f14432l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = m3.f14432l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(m3.this.f14437d, m3.this.f14434a.e());
                }
                m3.f14433m.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = m3.f14432l = null;
            }
        }
    }

    public m3(com.applovin.impl.sdk.k kVar) {
        this.f14434a = kVar;
        this.f14435b = kVar.O();
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f14436c = contextO;
        l3 l3Var = new l3(contextO);
        this.f14437d = l3Var;
        this.f14444k = new b0(kVar, l3Var);
    }

    private void f() {
        this.f14434a.e().a(new a());
    }

    public void e() {
        if (this.f14439f.compareAndSet(false, true)) {
            this.f14434a.r0().a((g5) new u5(this, this.f14434a), b6.b.OTHER);
        }
    }

    public boolean g() {
        return this.f14440g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f14437d + "}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        WeakReference weakReference = f14432l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Activity activityV0 = this.f14434a.v0();
        if (activityV0 == null || activityV0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityV0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new u9(this, 0)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void a(boolean z10, int i10) {
        this.f14440g = z10;
        this.f14441h = i10;
    }

    public void a(Map map) {
        this.f14443j = map;
        e();
        if (!c() && f14433m.compareAndSet(false, true)) {
            if (!this.f14442i) {
                f();
                this.f14442i = true;
            }
            Intent intent = new Intent(this.f14436c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            this.f14436c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.f14443j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f14443j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b3 b3Var = (b3) it.next();
            if (b3Var.A() && b3Var.q() == b3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new t9(this, 1), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i10) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayT = b0.e2.t(jSONObject, Q6.D1);
        ArrayList arrayList = new ArrayList(jSONArrayT.length());
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                b3 b3Var = new b3(jSONObject2, kVar);
                arrayList.add(b3Var);
                this.f14438e.put(b3Var.b(), b3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "ad_units");
        ArrayList arrayList = new ArrayList(jSONArrayT.length());
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayT, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.f14438e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List<String> adUnitIds = kVar.K() != null ? kVar.K().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (adUnitIds.contains(nVar.c())) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f14435b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, JSONObject jSONObject, int i10) {
        List listA = a(jSONObject, this.f14434a);
        List listA2 = a(jSONObject, listA, this.f14434a);
        List listA3 = a(listA2, this.f14434a);
        List listA4 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f14437d.a(listA, listA2, listA3, listA4, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, PglCryptUtils.KEY_MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f14434a);
        if (!listA4.isEmpty()) {
            this.f14444k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new t9(this, 0), TimeUnit.SECONDS.toMillis(this.f14441h));
        } else {
            a(listA);
        }
    }

    @Override // com.applovin.impl.q0.e
    public void a(String str, int i10, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14435b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f14434a.E().a("fetchMediationDebuggerInfo", str, i10, str2);
        this.f14437d.a(null, null, null, null, null, null, null, false, this.f14434a);
        this.f14439f.set(false);
    }
}
